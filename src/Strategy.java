/**
 * Interface for defining strategies to display graphs.
 * Classes implementing this interface should provide
 * functionality to display a graph based on a given function.
 */
public interface Strategy {
    /**
     * Displays a graph.
     *
     * @param function The mathematical function to be graphed.
     */
    void displayGraph(String function);
}
