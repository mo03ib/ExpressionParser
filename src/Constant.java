/**
 * Constant expressions
 */
public class Constant extends Expression {
   
    /**
     * Initialise value
     */
    public Constant(int v) {
	value = v;
    }
   
    /**
     * The value
     */
    private int value;

    /**
     * The value
     */
    public int getValue() {
	return 0; // Fix this in Exercise 1.
    }
   
    /**
     * String representation in in-order notation
     */
    public String toString() {
	return String.valueOf(value);
    }
}
