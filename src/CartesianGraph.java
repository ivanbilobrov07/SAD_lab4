/**
 * Represents a Cartesian graph display strategy.
 * This class implements the Strategy interface and provides
 * functionality to display a graph with cartesian coordinates.
 */
public class CartesianGraph implements Strategy {
    /**
     * Displays a graph of the given function using cartesian coordinates.
     *
     * @param function The mathematical function to be graphed.
     */
    @Override
    public void displayGraph(String function) {
        System.out.println("Draw a graph of the function " + function + " with cartesian coordinate system");
    }
}
