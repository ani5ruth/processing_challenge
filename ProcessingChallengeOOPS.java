import processing.core.PApplet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingChallengeOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallengeOOPS", args);
    }

    float[][] input = {{1.0f, 1.0f / 5}, {2.0f, 2.0f / 5}, {3.0f, 3.0f / 5}, {4.0f, 4.0f / 5}};

    List<MovingCircle> movingCircles;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        movingCircles = Stream.of(input).map(x -> new MovingCircle(x[0], x[1])).collect(Collectors.toList());
    }

    @Override
    public void draw() {
        movingCircles.forEach(MovingCircle::drawMovingCircle);
    }

    private void drawCircle(float xAxis, float yAxis) {
        ellipse(xAxis, yAxis, DIAMETER, DIAMETER);
    }

    private class MovingCircle {
        private float xAxis;
        private final float yAxis;
        private final float speed;

        public MovingCircle(float speed, float yAxisOffset) {
            this.xAxis = 0;
            this.yAxis = yAxisOffset * HEIGHT;
            this.speed = speed;
        }

        public void drawMovingCircle() {
            drawCircle(xAxis, yAxis);
            this.xAxis += speed;
        }
    }
}
