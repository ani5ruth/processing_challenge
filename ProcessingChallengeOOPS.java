import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingChallengeOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallengeOOPS", args);
    }

    List<Shape> balls;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

        balls = new ArrayList<>();
        balls.add(new Ball(1.0f, 1.0f/5 * HEIGHT));
        balls.add(new Ball(2.0f, 2.0f/5 * HEIGHT));
        balls.add(new Ball(3.0f, 3.0f/5 * HEIGHT));
        balls.add(new Ball(4.0f, 4.0f/5 * HEIGHT));
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.draw(this));
        balls.forEach(Shape::move);
    }
}
