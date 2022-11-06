package n4.part0.n4;

public class Monitor implements ComputerPart {
    private static int diagonal;
    private static int quality;

    Monitor() {
        diagonal = 30;
        quality = 1920;
    }

    public static int getDiagonal() {
        return diagonal;
    }

    public static void setDiagonal(int diagonal) {
        Monitor.diagonal = diagonal;
    }

    public static int getQuality() {
        return quality;
    }

    public static void setQuality(int quality) {
        Monitor.quality = quality;
    }

    @Override
    public String toString() {
        return "Monitor{\n" + "diagonal: " + getDiagonal() + ";\n quality: " + getQuality() + ";\n}";
    }
}
