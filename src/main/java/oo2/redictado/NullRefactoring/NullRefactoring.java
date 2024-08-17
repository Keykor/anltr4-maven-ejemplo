package oo2.redictado.NullRefactoring;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import oo2.redictado.Refactoring;
import oo2.redictado.antlr4.HelloLexer;
import oo2.redictado.antlr4.HelloParser;

public class NullRefactoring extends Refactoring{
    private String preconditionText = null;

    private HelloParser createHelloParser (String text) {
        CharStream charStream = CharStreams.fromString(text);
        HelloLexer lexer = new HelloLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new HelloParser(tokens);
    }

    protected boolean checkPreconditions(String text) {
        HelloParser parser = this.createHelloParser(text);

        if (parser.getNumberOfSyntaxErrors() > 0) {
            preconditionText = null;
            return false;
        }
        
        preconditionText = text;
        
        return true;
    }
    protected String transform(String text) {
        HelloParser parser = this.createHelloParser(text);
        ParseTree tree = parser.r();

        NullVisitor visitor = new NullVisitor();
        String transformedText = visitor.visit(tree);
        
        return transformedText;
    }
    protected boolean checkPostconditions(String text) {
        if (preconditionText == null) {
            return false;
        }
        return preconditionText.equals(text);
    }
}