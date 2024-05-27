public class Main {
    public static void main(String[] args) {
        String function = "2x + y = 10";

        Strategy cartesian = new CartesianGraph();
        Strategy polar = new PolarGraph();

        Displayer displayer = new Displayer(cartesian, function);
        displayer.displayGraph();

        displayer.setDisplayStrategy(polar);
        displayer.displayGraph();
    }
}