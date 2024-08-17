package oo2.redictado.NullRefactoring;

import org.antlr.v4.runtime.tree.TerminalNode;

import oo2.redictado.antlr4.HelloBaseVisitor;


public class NullVisitor extends HelloBaseVisitor<String>{
    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text.equals("hello"))
            return text;
        return " " + text;
    }

    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        } else {
            return aggregate + nextResult;
        }
    }
}