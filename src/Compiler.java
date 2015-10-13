
/**
 * Expression processors that hide the details of
 * scanning, parsing, trees etc. from the client, and
 * present a nice interface to it all.  (This is an
 * example of the Facade pattern.)
 */

public class Compiler {
   
    /**
     * Get everything set up
     */
    public Compiler() {
	lexer = new Lexer();
	parser = new Parser(lexer);
    }
    
    /**
     * Has the input stream been correctly parsed?
     */
    public boolean hasValidTree() {
	return (tree() != null);
    }

    /**
     * Do we have an input stream ready to read?
     */
    public boolean readyToGo() {
	return lexer.isConnected() && !lexer.endOfInput();
    }
   
    /**
     * Set it to read from `s'.
     */   
    public void setInput(String s) {
	// require s != null
	lexer.setInput(s);
    }
    /**
     * Build an Abstract Parse Tree from the tokens on lexer
     */
    public void buildTree() {
	// require readyToGo
	parser.parseExpression();
    }
   
    /*
     * Print the expression in "in_order".
     */
    public void printInOrder() {
	// require hasValidTree
	System.out.print("In-order: ");
	System.out.println(tree().toString());
    }
   
    /**
     * Print the value of the expression.
     */
    public void printValue() {
	// require hasValidTree
	System.out.print("Value = ");
	System.out.println(tree().getValue());
    }
    
    /**
     * Lexical scanner
     */
    private Lexer lexer;
    
    /**
     * Top-down parser
     */
    private Parser parser;
    
    /**
     * Root of the expression tree.
     */
    public Expression tree() {
	if (parser != null) {
            return parser.getRootNode();
	} else {
	    return null;
	}
    }
}
