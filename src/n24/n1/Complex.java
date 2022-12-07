package n24.n1;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void add(Complex complex) {
        this.real += complex.real;
        this.image += complex.image;
    }

    public void sub(Complex complex) {
        this.real -= complex.real;
        this.image -= complex.image;
    }

    public void mul(Complex complex) {
        this.real = this.real * complex.real - this.image * complex.image;
        this.image = this.real * complex.image + this.image * complex.real;
    }

    public void div(Complex complex) {
        this.real = (this.real * complex.real + this.image * complex.image) / (complex.real * complex.real + complex.image * complex.image);
        this.image = (this.image * complex.real - this.real * complex.image) / (complex.real * complex.real + complex.image * complex.image);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
