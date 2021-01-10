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

    List<Shape> balls;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        balls = Stream.of(input).map(ball -> new Ball(ball[0], ball[1])).collect(Collectors.toList());
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.draw(this));
        balls.forEach(Shape::move);
    }
}