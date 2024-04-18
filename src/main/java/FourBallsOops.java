import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOops extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 680;
    public static ArrayList<Ball> fourBalls = new ArrayList<>();

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        initBalls();
    }

    private static void initBalls() {
        for (int i = 0; i < 4; i++) {
            fourBalls.add(new Ball(0, HEIGHT * (i + 1) / 5, 10, 10, i + 1));
        }
    }

    @Override
    public void draw() {
        draw4Balls();
    }

    private void draw4Balls() {
        for (Ball ball : fourBalls)
            ball.drawBall(this);
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsOops", args);

    }
}
