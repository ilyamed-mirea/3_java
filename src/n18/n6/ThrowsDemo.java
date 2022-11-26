package n18.n6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("null key in getDetails");
            key = "default key";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.printMessage("a");
        obj.printMessage(null);
    }
}