import java.lang.Math;

public class n2 {
    public static void main(String[] args) {
        double summ = 0;
        for(double i = 1; i <= 10; i++ ){
            summ += 1/i;
            System.out.printf("%.2f", 1/i);
            System.out.println(" ");
        }
        summ=Math.ceil(summ * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println(summ);
    }
}
