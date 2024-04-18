import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 680;
    public static int[] xVals = new int[4];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        AssignXvals();
    }

    private static void AssignXvals() {
        for (int i = 0; i < 4; i++)
            xVals[i] = 0;
    }


    @Override
    public void draw() {

        draw4Balls();

    }

    private void draw4Balls() {
        for (int i = 0; i < 4; i++) {
            ellipse(xVals[i], (float) HEIGHT * (i + 1) / 5, 10, 10);
            xVals[i] += i + 1;
        }
    }


    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);

    }
}
