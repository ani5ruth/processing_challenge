import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingChallengeOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    // custom class for moving circles with varying speed and height offset
    private class MovingCircle {
        private int xAxis;
        private final int yAxisOffset;
        private final int speed;

        public MovingCircle(int yAxisOffset, int speed) {
            this.xAxis = 0;
            this.yAxisOffset = yAxisOffset;
            this.speed = speed;
        }

        public void drawMovingCircle() {
            drawCircle(xAxis, yAxisOffset * HEIGHT / 5);
            this.xAxis += speed;
        }
    }

    // list of given circles with their height and offset
    int[][] circles = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};

    public static void main(String[] args) {
        PApplet.main("ProcessingChallengeOOPS", args);
    }

    List<MovingCircle> movingCircles;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        movingCircles = new ArrayList<>();

        //initialising circles
        for (int[] circle : circles) {
            movingCircles.add(new MovingCircle(circle[0], circle[1]));
        }
    }

    @Override
    public void draw() {
        movingCircles.forEach(MovingCircle::drawMovingCircle);
    }

    private void drawCircle(int xAxis, int yAxis) {
        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
    }

}
