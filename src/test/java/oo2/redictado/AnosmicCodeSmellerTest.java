package oo2.redictado;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import oo2.redictado.AnosmicCodeSmeller.*;

public class AnosmicCodeSmellerTest {
    @Test
    public void testSmell() {
        AnosmicCodeSmeller codeSmeller = new AnosmicCodeSmeller();
        Aroma aroma = codeSmeller.smell("print(\"Hello, World!\");");
        assertFalse(aroma.stinks());
    }

    @Test
    public void testSmellSyntaxError() {
        AnosmicCodeSmeller codeSmeller = new AnosmicCodeSmeller();
        Aroma aroma = codeSmeller.smell("for (int i = 0; i < 10; i++) {}");
        assertTrue(aroma.stinks());
    }
}
