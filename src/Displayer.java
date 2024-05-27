/**
 * Utility class for displaying graphs using various strategies.
 * This class facilitates the display of graphs by delegating the
 * display functionality to an object implementing the Strategy interface.
 */
public class Displayer {
    private String function;
    private Strategy displayStrategy;

    /**
     * Constructor
     *
     * @param displayStrategy The strategy used to display the graph.
     * @param function        The mathematical function to be graphed.
     */
    public Displayer(Strategy displayStrategy, String function){
        this.displayStrategy = displayStrategy;
        this.function = function;
    }

    /**
     * Sets the display strategy to be used for displaying the graph.
     *
     * @param displayStrategy The new display strategy to be set.
     */
    public void setDisplayStrategy(Strategy displayStrategy){
        this.displayStrategy = displayStrategy;
    }

    /**
     * Displays the graph using the current display strategy and function.
     * The graph is drawn based on the specified function using the chosen strategy.
     */
    public void displayGraph(){
        displayStrategy.displayGraph(function);
    }
}
