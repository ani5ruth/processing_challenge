import processing.core.PApplet;

public class ProcessingChallengeProcedural extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallengeProcedural", args);
    }

    int[][] circles = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
    private int[] xCoordinate;

    @Override
    public void settings() {
        super.settings();
        xCoordinate = new int[circles.length];
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < circles.length; i++) {
            drawCircle(xCoordinate[i], HEIGHT / 5 * circles[i][0]);
            moveCircle(i);
        }
    }

    private void drawCircle(int xAxis, int yAxis) {
        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
    }

    private void moveCircle(int circleId) {
        xCoordinate[circleId] += circles[circleId][1];
    }
}
