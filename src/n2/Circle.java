package n2;

public class Circle {
    private Point center = new Point();

    Circle(double x, double y) {
        center.setXY(x,y);
    }

    Circle() {}

    public double getX() {
        return center.getX();
    }
    public double getY() {
        return center.getY();
    }
    public void setX(double x) {
        this.center.setX(x);
    }
    public void setY(double y) {
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "center x: "+getX()+", y: "+getY();
    }
}
