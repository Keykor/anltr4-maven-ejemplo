package oo2.redictado.PrintSniffer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import oo2.redictado.Aroma;
import oo2.redictado.CodeSniffer;
import oo2.redictado.antlr4.BythonLexer;
import oo2.redictado.antlr4.BythonParser;

public class PrintSniffer implements CodeSniffer {
    public Aroma sniff(String code) {
        // Creates Bython Parser
        CharStream stream = CharStreams.fromString(code);
        BythonLexer lexer = new BythonLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BythonParser parser = new BythonParser(tokens);

        // Parses the code and checks for syntax errors
        ParseTree tree = parser.program();
        System.out.println(parser.getNumberOfSyntaxErrors());
        if (parser.getNumberOfSyntaxErrors() > 0) {
            return new Aroma("PrintSniffer", "Syntax error", true);
        }

        // Visits the parse tree to check for bad smells
        PrintSnifferVisitor visitor = new PrintSnifferVisitor();
        Integer printCount = visitor.visit(tree);
        if (printCount > 0) {
            return new Aroma("PrintSniffer", "The code has " + printCount + " print calls.", true);
        }

        return new Aroma("PrintSniffer", "The code smells good", false);
    }
}
