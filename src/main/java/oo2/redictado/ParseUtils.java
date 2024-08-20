package oo2.redictado;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import oo2.redictado.antlr4.PJscriptLexer;
import oo2.redictado.antlr4.PJscriptParser;

public class ParseUtils {
    public static PJscriptParser createPJscriptParser(String text) {
        CharStream charStream = CharStreams.fromString(text);
        PJscriptLexer lexer = new PJscriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PJscriptParser parser = new PJscriptParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Error de sintaxis en la línea " + line + ":" + charPositionInLine + " - " + msg);
            }
        });
        return parser;
    }


    public static boolean compareParseTreeString(String originalText, String refactoredText) {
        PJscriptParser originalParser = ParseUtils.createPJscriptParser(originalText);
        PJscriptParser refactoredParser = ParseUtils.createPJscriptParser(refactoredText);
        String originalParseTree = originalParser.program().toStringTree(originalParser);
        String refactoredParseTree = refactoredParser.program().toStringTree(refactoredParser);
        return originalParseTree.equals(refactoredParseTree);
    }
}
