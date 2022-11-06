package n6.n12;

public class Tester {
    public static void main(String[] args) {
        StringBuilder2 sb = new StringBuilder2("Hello");
        sb.append(" world");
        System.out.println(sb);
        sb.changeCharAt(0, 'h');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.undo();
        sb.undo();
        sb.undo();
        sb.undo();
        System.out.println(sb);
    }
}
