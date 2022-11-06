package n4.part0.n4;

public class Processor implements ComputerPart {
    private static int cores = 2;
    private static double frequency = 4.6;
    public Processor() {
        this.cores = 3;
        this.frequency = 4.8;
    }
    public Processor(int cores, double frequency, Marks mark) {
        this.cores = cores;
        this.frequency = frequency;
    }

    public static int getCores() {
        return cores;
    }

    public static void setCores(int cores) {
        Processor.cores = cores;
    }

    public static double getFrequency() {
        return frequency;
    }

    public static void setFrequency(double frequency) {
        Processor.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{\n"+"cores: "+getCores()+";\n frequency: "+getFrequency()+";\n}";
    }
}
