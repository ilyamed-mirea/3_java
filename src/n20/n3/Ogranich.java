package n20.n3;

public class Ogranich<T, V, K> implements Comparable<T>, Animal {
    public T t;
    public V v;
    public K k;

    public Ogranich(T t, V v, K k) {
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
        Ogranich<String, Integer, Double> first = new Ogranich<>("t", 1, 1.0);
        System.out.println("t: "+first.getT());
        System.out.println("v: " + first.getV());
        System.out.println("k: "+first.getK());
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    public void eat(Object v) {
        System.out.println("eat");
    }
}
