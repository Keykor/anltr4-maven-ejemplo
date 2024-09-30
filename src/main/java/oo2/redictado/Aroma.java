package oo2.redictado;

public interface Aroma {
    /**
     * @return the name of the Bad Smell
     */
    public String name();

    /**
     * @return the message that describes the Bad Smell in the code
     */
    public String message();

    /**
     * @return true if the Bad Smell is present in the code, false otherwise
     */
    public boolean stinks();
}
