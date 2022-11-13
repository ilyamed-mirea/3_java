package n12.n2;

abstract class Shape {

    protected String color;
    protected int x;
    protected int y;

    public Shape() {

    }

    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
