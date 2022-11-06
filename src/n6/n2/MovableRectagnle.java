package n6.n2;

import n6.n1.Movable;
import n6.n1.MovablePoint;

public class MovableRectagnle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectagnle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        checkSpeed();
    }

    public void checkSpeed() {
        if (topLeft.getxSpeed() != bottomRight.getxSpeed() || topLeft.getySpeed() != bottomRight.getySpeed()) {
            throw new IllegalArgumentException("Speeds are not equal");
        }
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectagnle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
