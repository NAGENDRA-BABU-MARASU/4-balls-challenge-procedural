import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 480;
    public static final int BALL_WIDTH = 10;
    public static final int BALL_HEIGHT = 10;
    public static final int BALL_SPEED = 1;
    public static final int DISTANCE_FACTOR = 5;
    public static final int BALLS_COUNT = 4;
    private final float[] xPositionsOfBalls = { 1F,1F,1F,1F};

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        for(int ballNumber = 1; ballNumber <= BALLS_COUNT; ballNumber++){
            int ballIndex = ballNumber - 1;
            drawBall(ballNumber, xPositionsOfBalls, ballIndex);
        }
    }

    private void drawBall(int ballNumber, float[] ballPositions, int ballIndex) {
        final float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
        ellipse(ballPositions[ballIndex], distanceFromTop, BALL_WIDTH, BALL_HEIGHT);
        int moveByDistance = BALL_SPEED * ballNumber;
        ballPositions[ballIndex] += moveByDistance;
    }

    
}
