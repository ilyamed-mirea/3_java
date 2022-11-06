package n6.n11;

public class Farenheit implements Convertable {
    @Override
    public double convert(double value) {
        return (value - 32) / 1.8;
    }
}
