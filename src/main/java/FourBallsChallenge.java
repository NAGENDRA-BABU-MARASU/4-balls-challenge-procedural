import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 480;
    public static final int BALL_WIDTH = 10;
    public static final int BALL_HEIGHT = 10;
    public static final int BALL_SPEED = 1;
    public static final int DISTANCE_FACTOR = 5;

    private int ball1positionX = 1;
    private int ball2positionX = 1;
    private int ball3positionX = 1;
    private int ball4positionX = 1;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        final int ballNumber = 1;
        final float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
        ellipse(ball1positionX, distanceFromTop, BALL_WIDTH, BALL_HEIGHT);
        int moveByDistance = BALL_SPEED * ballNumber;
        ball1positionX += moveByDistance;
    }

    private void drawBall2() {
        final int ballNumber = 2;
        final float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
        ellipse(ball2positionX, distanceFromTop, BALL_WIDTH, BALL_HEIGHT);
        int moveByDistance = BALL_SPEED * ballNumber;
        ball2positionX += moveByDistance;
    }

    private void drawBall3() {
        final int ballNumber = 3;
        final float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
        ellipse(ball3positionX, distanceFromTop, BALL_WIDTH, BALL_HEIGHT);
        int moveByDistance = BALL_SPEED * ballNumber;
        ball3positionX += moveByDistance;
    }

    private void drawBall4() {
        final int ballNumber = 4;
        final float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
        ellipse(ball4positionX, distanceFromTop, BALL_WIDTH, BALL_HEIGHT);
        int moveByDistance = BALL_SPEED * ballNumber;
        ball4positionX += moveByDistance;
    }
}
