package oo2.redictado;

public interface CodeSniffer {
    /**
     * Detect a sniff in the code.
     *
     * @param code the code to be analyzed
     * @return the result of the sniff detection
     */
    public Aroma sniff(String code);
}
