package n18.n5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("null key in getDetails");
            key="";
        }
        key += "abc";
        System.out.println("new key "+key);
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.getDetails(null);
    }
}
