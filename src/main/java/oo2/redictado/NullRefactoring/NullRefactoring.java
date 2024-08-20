package oo2.redictado.NullRefactoring;

import org.antlr.v4.runtime.tree.*;

import oo2.redictado.ParseUtils;
import oo2.redictado.Refactoring;
import oo2.redictado.antlr4.PJscriptParser;

public class NullRefactoring extends Refactoring{
    private String preconditionTree = null;

    protected boolean checkPreconditions(String text) {
        PJscriptParser parser = ParseUtils.createPJscriptParser(text);

        try {
            this.preconditionTree = parser.program().toStringTree();
            return true;
        } catch (Exception e) {
            this.preconditionTree = null;
            return false;
        }
    }

    protected String transform(String text) {
        PJscriptParser parser = ParseUtils.createPJscriptParser(text);
        try {
            ParseTree tree = parser.program();
            NullVisitor visitor = new NullVisitor();
            String transformedText = visitor.visit(tree);
            return transformedText;
        } catch (Exception e) {
            return text;
        }
    }
    
    protected boolean checkPostconditions(String text) {
        if (preconditionTree == null) {
            return false;
        }

        PJscriptParser parser = ParseUtils.createPJscriptParser(text);
        try {
            String postConditionTree = parser.program().toStringTree();
            return preconditionTree.equals(postConditionTree);
        } catch (Exception e) {
            return false;
        }
    }
}