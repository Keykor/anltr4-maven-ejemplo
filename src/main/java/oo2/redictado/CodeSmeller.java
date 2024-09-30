package oo2.redictado;

public interface CodeSmeller {
    /**
     * Detect a smell in the code.
     *
     * @param code the code to be analyzed
     * @return the result of the smell detection
     */
    public Aroma smell(String code);
}
