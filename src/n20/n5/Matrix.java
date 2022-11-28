package n20.n5;

public class Matrix {
    private double[][] matrix;
    private int n;
    private int m;

    public Matrix(double[][] matrix, int n, int m) {
        this.matrix = matrix;
        this.n = n;
        this.m = m;
    }

    //write add with generics
    public <T> Matrix add(Matrix b) {
        if (b.getN() != n || b.getM() != m) {
            return null;
        }
        double[][] newValues = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newValues[i][j] = b.getElement(i, j) + matrix[i][j];
            }
        }
        return new Matrix(newValues, n, m);
    }

    //multiply with generics
    public <T> void multiply(T k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] *= Double.parseDouble(k.toString());
            }
        }
    }

    //print with generics
    public <T> void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //setters with generics
    public <T> void setN(T n) {
        this.n = (int) n;
    }

    public <T> void setM(T m) {
        this.m = (int) m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public double getElement(int i, int j) {
        return matrix[i][j];
    }

    //write main and test operations

    public static void main(String[] args) {
        double[][] matrix = {{1, 2.2, 3.1}, {4.9, 5, 6.2}, {7.2, 8, 9}};
        Matrix m = new Matrix(matrix, 3, 3);
        m.print();
        System.out.println("-----------------");

        m.multiply(2);
        m.print();
        System.out.println("-----------------");

        m.add(m).print();
        System.out.println("-----------------");

    }
}
