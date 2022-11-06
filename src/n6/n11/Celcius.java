package n6.n11;

public class Celcius implements Convertable {
    @Override
    public double convert(double value) {
        return value * 1.8 + 32;
    }
}
