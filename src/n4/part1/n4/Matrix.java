package n4.part1.n4;

public class Matrix {
    private int[][] matrix;
    private int n;
    private int m;

    public Matrix(int[][] matrix, int n, int m) {
        this.matrix = matrix;
        this.n = n;
        this.m = m;
    }

    public Matrix add(Matrix b) {
        if (b.getN() != n || b.getM() != m) {
            return null;
        }
        int[][] newValues = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newValues[i][j] = b.getElement(i, j) + matrix[i][j];
            }
        }
        return new Matrix(newValues, n, m);
    }

    public void multiply(int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] *= k;
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }
}
