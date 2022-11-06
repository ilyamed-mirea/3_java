package n4.part0.n4;

public class RAM implements ComputerPart{
    private static double capacity;
    private static int frequency;

    RAM() {
        capacity = 16;
        frequency = 3200;
    }

    public static double getCapacity() {
        return capacity;
    }

    public static void setCapacity(double capacity) {
        RAM.capacity = capacity;
    }

    public static int getFrequency() {
        return frequency;
    }

    public static void setFrequency(int frequency) {
        RAM.frequency = frequency;
    }

    @Override
    public String toString() {
        return "RAM{\n"+"capacity: "+getCapacity()+";\n frequency: "+getFrequency()+";\n}";
    }
}
