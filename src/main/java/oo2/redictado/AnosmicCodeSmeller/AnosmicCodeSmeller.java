package oo2.redictado.AnosmicCodeSmeller;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import oo2.redictado.Aroma;
import oo2.redictado.CodeSmeller;
import oo2.redictado.antlr4.BythonLexer;
import oo2.redictado.antlr4.BythonParser;

public class AnosmicCodeSmeller implements CodeSmeller {
    public Aroma smell(String code) {
        // Creates Bython Parser
        CharStream stream = CharStreams.fromString(code);
        BythonLexer lexer = new BythonLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BythonParser parser = new BythonParser(tokens);

        // Parses the code and checks for syntax errors
        ParseTree tree = parser.program();
        System.out.println(parser.getNumberOfSyntaxErrors());
        if (parser.getNumberOfSyntaxErrors() > 0) {
            return new Aroma("AnosmicCodeSmeller", "Syntax error", true);
        }

        // Visits the parse tree to check for bad smells
        AnosmicVisitor visitor = new AnosmicVisitor();
        boolean hasBadSmell = visitor.visit(tree);
        return new Aroma("AnosmicCodeSmeller", "The code smells good", hasBadSmell);
    }
}
