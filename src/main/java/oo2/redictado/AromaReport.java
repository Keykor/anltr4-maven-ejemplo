package oo2.redictado;

import java.util.ArrayList;
import java.util.List;

public class AromaReport {
    private String code;
    private List<Aroma> aromas;

    public AromaReport(String code) {
        this.code = code;
        this.aromas = new ArrayList<Aroma>();
    }

    public String getCode() {
        return this.code;
    }

    public List<Aroma> getAromas() {
        return List.copyOf(this.aromas);
    }

    public void addAroma(Aroma aroma) {
        this.aromas.add(aroma);
    }

    public boolean stinks() {
        return this.aromas.stream().anyMatch(Aroma::stinks);
    }
}
