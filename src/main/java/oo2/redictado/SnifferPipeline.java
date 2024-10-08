package oo2.redictado;

import java.util.ArrayList;
import java.util.List;

public class SnifferPipeline {
    private List<CodeSniffer> sniffers;

    public SnifferPipeline() {
        sniffers = new ArrayList<>();
    }

    public void addSniffer(CodeSniffer sniffer) {
        sniffers.add(sniffer);
    }

    public AromaReport run(String code) {
        AromaReport report = new AromaReport(code);
        sniffers.forEach(sniffer -> sniffer.sniff(code, report));
        return report;
    }
}
