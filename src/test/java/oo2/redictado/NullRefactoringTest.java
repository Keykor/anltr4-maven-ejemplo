package oo2.redictado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import oo2.redictado.NullRefactoring.NullRefactoring;

public class NullRefactoringTest {

    @Test 
    public void nullrefactorAQuery() throws RefactoringException {
        String result;
        Refactoring refactoring = new NullRefactoring();
        String originalText = "hello world";
        result = refactoring.refactor(originalText); 
        assertEquals(result, originalText);
    }

    @Test 
    public void nullrefactorABadQuery()  {
        boolean failure = false;
        Refactoring refactoring = new NullRefactoring();
        try{
            refactoring.refactor("goodbye world");  
        }
        catch(Exception e) { failure = true; }
        assertTrue(failure);
    }



}