package n4.part0.n4;

public class Computer {
    private static Marks mark;
    private static Processor processor;
    private static Monitor monitor;
    private static RAM ram;

    public Computer() {
        mark = Marks.ASUS;
        processor = new Processor();
        monitor = new Monitor();
        ram = new RAM();
    }

    public static Marks getMark() {
        return mark;
    }

    public static void setMark(Marks mark) {
        Computer.mark = mark;
    }

    public static Processor getProcessor() {
        return processor;
    }

    public static void setProcessor(Processor processor) {
        Computer.processor = processor;
    }

    public static Monitor getMonitor() {
        return monitor;
    }

    public static void setMonitor(Monitor monitor) {
        Computer.monitor = monitor;
    }

    public static RAM getRam() {
        return ram;
    }

    public static void setRam(RAM ram) {
        Computer.ram = ram;
    }

    public static void main(String[] args) {
        Computer pc = new Computer();
        System.out.println("Your PC:\n");
        System.out.println(pc.getMark());
        System.out.println(pc.getProcessor());
        System.out.println(pc.getMonitor());
        System.out.println(pc.getRam());
    }
}
