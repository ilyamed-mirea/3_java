package n27.n3;

import java.util.HashMap;

public class FloatHash {
    private static HashMap<Float, String> map;

    //main
    public static void main(String[] args) {
        map = new HashMap<Float, String>(10);
        //fill map
        map.put(1.1f, "one");
        map.put(2.2f, "two");
        map.put(3.3f, "three");
        map.put(4.4f, "four");
        map.put(5.5f, "five");
        map.put(6.6f, "six");
        map.put(7.7f, "seven");
        map.put(8.8f, "eight");
        map.put(9.9f, "nine");
        map.put(10.10f, "ten");
        //print map
        System.out.println(map);
    }
}
