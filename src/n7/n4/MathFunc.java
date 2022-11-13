package n7.n4;

public class MathFunc implements MathCalculable {
    @Override
    public double square(double a) {
        return a * a;
    }

    @Override
    public double module(double a) {
        return a < 0 ? -a : a;
    }

    @Override
    public double getArea(double radius) {
        return PI * square(radius);
    }
}
