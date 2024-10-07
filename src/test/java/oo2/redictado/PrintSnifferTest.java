package oo2.redictado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import oo2.redictado.PrintSniffer.PrintSniffer;

public class PrintSnifferTest {
    @Test
    public void testPrints() {
        PrintSniffer codeSmeller = new PrintSniffer();
        Aroma aroma = codeSmeller.sniff("print(\"Hello, World!\");");
        assertTrue(aroma.stinks());
        assertEquals("The code has 1 print calls.", aroma.message());
    }

    @Test
    public void testMorePrints() {
        PrintSniffer codeSmeller = new PrintSniffer();
        String code = """
               x = 5;

               if (x > 0) {
                   print("Positive number");
                   print("Value of x is: " + x);
               }

               if (x < 10) {
                   print("x is less than 10");
               }

               for i in range(3) {
                   print("Iteration number: " + i);
               }

               print("End of the program");
               """;
        Aroma aroma = codeSmeller.sniff(code);
        assertTrue(aroma.stinks());
        assertEquals("The code has 5 print calls.", aroma.message());
    }

    @Test
    public void testNoPrints() {
        PrintSniffer codeSmeller = new PrintSniffer();
        Aroma aroma = codeSmeller.sniff("person = Person(\"Alice\", 30);");
        assertFalse(aroma.stinks());
        assertEquals("The code smells good", aroma.message());
    }

    @Test
    public void testSyntaxError() {
        PrintSniffer codeSmeller = new PrintSniffer();
        Aroma aroma = codeSmeller.sniff("for (int i = 0; i < 10; i++) {}");
        assertTrue(aroma.stinks());
        assertEquals("Syntax error", aroma.message());
    }
}
