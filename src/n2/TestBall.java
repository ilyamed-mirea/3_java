package n2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setX(12.3);
        ball.setY(18.2);
        ball.move(1.3,1.5);
        System.out.println(ball);
        ball = new Ball(0.7,0.8);
        System.out.println(ball);
        ball.setXY(12.34,56.78);
        System.out.println(ball);
    }
}
