package n4.part1.n6;

public class Tester {
    public static void main(String[] args) {
        Employeer a = new Manager("a", "b", 10.0, 10.0);
        System.out.println(a.getIncome());
        System.out.println();

        Employeer[] employeers = new Employeer[3];
        employeers[0] = new Employeer("aaaaa", "bbbbb", 103.0);
        employeers[1] = new Manager("ccc", "ddd", 210.0, 120.0);
        employeers[2] = new Employeer("eee", "ffff", 3400.0);

        for (Employeer e : employeers) {
            System.out.println(e);
        }
    }
}
