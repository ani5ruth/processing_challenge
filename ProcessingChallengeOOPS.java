import processing.core.PApplet;

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
        balls.add(new Ball(1, 1.0f/5));
        balls.add(new Ball(2, 2.0f/5));
        balls.add(new Ball(3, 3.0f/5));
        balls.add(new Ball(4, 4.0f/5));

    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.draw(this));
        balls.forEach(Shape::move);
    }
}
