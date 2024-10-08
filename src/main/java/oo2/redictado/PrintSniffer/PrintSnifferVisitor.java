package oo2.redictado.PrintSniffer;

import oo2.redictado.Aroma;
import oo2.redictado.AromaReport;
import oo2.redictado.antlr4.BythonParser;
import oo2.redictado.antlr4.BythonParserBaseVisitor;

public class PrintSnifferVisitor extends BythonParserBaseVisitor<Void> {
    private AromaReport aromaReport;
    public PrintSnifferVisitor(AromaReport aromaReport) {
        super();
        this.aromaReport = aromaReport;
    }

    @Override
    public Void visitMethodCall(BythonParser.MethodCallContext ctx) {
        if (ctx.ID().getText().equals("print")) {
            aromaReport.addAroma(new Aroma("PrintSniffer", "The code has print calls.", true));
        }
        return visitChildren(ctx);
    }
}
