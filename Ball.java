import processing.core.PApplet;

public class Ball implements Shape {
    private float xAxis;
    private final float yAxis;
    private final float speed;

    public Ball(float speed, float yAxisOffset) {
        this.xAxis = 0;
        this.yAxis = yAxisOffset * ProcessingChallengeOOPS.HEIGHT;
        this.speed = speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(xAxis, yAxis, ProcessingChallengeOOPS.DIAMETER, ProcessingChallengeOOPS.DIAMETER);
    }

    public void move() {
        xAxis += speed;
    }
}
