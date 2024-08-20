package oo2.redictado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import oo2.redictado.NullRefactoring.NullRefactoring;

public class NullRefactoringTest {

    private String readFile(String fileName) {
        ClassLoader classLoader = NullRefactoringTest.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {

            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }
            return result.toString();

        } catch (Exception e) {
            throw new RuntimeException("Error leyendo " + fileName, e);
        }
    }

    @Test 
    public void nullrefactorAQuery() {
        Refactoring refactoring = new NullRefactoring();
        String originalText = this.readFile("animal.pjscript");
        boolean comparison = false;
        try{
            String result = refactoring.refactor(originalText); 
            comparison = ParseUtils.compareParseTreeString(originalText, result);
        }
        catch(Exception e) { 
            comparison = false;
        }
        assert(comparison);
    }

    @Test 
    public void nullrefactorSyntaxError()  {
        boolean failure = false;
        Refactoring refactoring = new NullRefactoring();
        try{
            refactoring.refactor("hola = mundo");
        }
        catch(Exception e) { 
            failure = true;
        }
        assertTrue(failure);
    }
}