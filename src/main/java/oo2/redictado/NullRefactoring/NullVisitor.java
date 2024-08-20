package oo2.redictado.NullRefactoring;

import org.antlr.v4.runtime.tree.TerminalNode;

import oo2.redictado.antlr4.PJscriptParserBaseVisitor;


public class NullVisitor extends PJscriptParserBaseVisitor<String>{
    @Override
    public String visitTerminal(TerminalNode node) {
        if (node.getText().equals("<EOF>")){
            return "";
        }
        return " " + node.getText();
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