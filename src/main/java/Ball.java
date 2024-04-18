import processing.core.PApplet;

public class Ball {
    public void drawBall(PApplet pApplet) {

        pApplet.ellipse(xCordinate, yCordinate, diagonalDiameter, verticalDiameter);
        xCordinate += framePerSecond;
    }

    private int xCordinate;
    private int yCordinate;
    private int diagonalDiameter;
    private int verticalDiameter;
    private int framePerSecond;

    public Ball(int xCordinate, int yCordinate, int diagonalDiameter, int verticalDiameter, int framePerSecond) {
        this.diagonalDiameter = diagonalDiameter;
        this.yCordinate = yCordinate;
        this.verticalDiameter = verticalDiameter;
        this.xCordinate = xCordinate;
        this.framePerSecond = framePerSecond;
    }
}
