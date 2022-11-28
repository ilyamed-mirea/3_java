package n20.n12;

public class First<T, V, K> {
    public T t;
    public V v;
    public K k;

    public First(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }


    public static void main(String[] args) {
        //write in console names of the 3 generic classes (t,v,k)
        //and then write in console 3 values of the 3 generic classes
        First<String, Integer, Double> first = new First<>("t", 1, 1.0);
        System.out.println("t: "+first.getT());
        System.out.println("v: " + first.getV());
        System.out.println("k: "+first.getK());
    }

}
