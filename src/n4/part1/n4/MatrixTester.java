package n4.part1.n4;

public class MatrixTester {
    public static void main(String[] args) {
        int[][] values = new int[2][2];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                values[i][j] = i + j;
            }
        }
        Matrix a = new Matrix(values, 2, 2);
        a.print();
        System.out.println();
        a.multiply(3);
        a.print();
        System.out.println();
        a.add(a).print();
    }
}
