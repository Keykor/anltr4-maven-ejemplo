package oo2.redictado;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import oo2.redictado.AnosmicCodeSniffer.*;

public class AnosmicCodeSnifferTest {
    @Test
    public void testSmell() {
        AnosmicCodeSniffer codeSmeller = new AnosmicCodeSniffer();
        Aroma aroma = codeSmeller.sniff("print(\"Hello, World!\");");
        assertFalse(aroma.stinks());
    }

    @Test
    public void testSmellSyntaxError() {
        AnosmicCodeSniffer codeSmeller = new AnosmicCodeSniffer();
        Aroma aroma = codeSmeller.sniff("for (int i = 0; i < 10; i++) {}");
        assertTrue(aroma.stinks());
    }
}
