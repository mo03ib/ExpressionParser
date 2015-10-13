/**
 * Arithmetic integer expressions
 */
public abstract class Expression {
    
    /**
     * The value of this expression
     */
    public abstract int getValue();

    /**
     * String representation in in-order notation
     */
    public abstract String toString();
   
    public static final int NONE = 0;
    public static final int ADDITION = 1;
    public static final int MULTIPLICATION = 2;
}
