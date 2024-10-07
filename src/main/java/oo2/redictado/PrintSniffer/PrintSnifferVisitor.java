package oo2.redictado.PrintSniffer;

import oo2.redictado.antlr4.BythonParser;
import oo2.redictado.antlr4.BythonParserBaseVisitor;

public class PrintSnifferVisitor extends BythonParserBaseVisitor<Integer> {
    private int printCount = 0;

    @Override
    public Integer visitMethodCall(BythonParser.MethodCallContext ctx) {
        if (ctx.ID().getText().equals("print")) {
            printCount++;
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitProgram(BythonParser.ProgramContext ctx) {
        visitChildren(ctx);
        return printCount;
    }
}
