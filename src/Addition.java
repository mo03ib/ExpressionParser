/**
 * Sums of two expressions
 */
public class Addition extends Expression {

    /**
     * The expressions to be added.
     */
    private Expression left, right;

    /**
     * Initialise left and right sides
     */
    public Addition(Expression l, Expression r) {
        left = l;
        right = r;
    }

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
        return "(" + left.toString() + " + "
                + right.toString() + ")";
    }
}
