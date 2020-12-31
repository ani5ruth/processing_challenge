import processing.core.PApplet;

public class ProcessingChallengeProcedural extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int[] stateCounters;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallengeProcedural", args);
    }

    // list of given circles with their height and offset
    int[][] circles = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};

    @Override
    public void settings() {
        super.settings();
        //initialising statecounters
        stateCounters = new int[circles.length];
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < circles.length; i++) {
            drawCircle(stateCounters[i], HEIGHT / 5 * circles[i][0]);
            stateCounters[i] += circles[i][1];
        }
    }

    private void drawCircle(int xAxis, int yAxis) {
        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
    }
}
