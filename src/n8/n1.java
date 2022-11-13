package n8;

public class n1 {
    // method to get first n elements of monotonous sequence when every k number has k entrys
    public static void getSequence(int k, int n) {
       for (int i=0;i<k;i++)
           System.out.println(k);
        if (k==n)
            return;
        getSequence(k+1,n);
    }

    public static void main(String[] args) {
        getSequence(1,4);
    }

}
