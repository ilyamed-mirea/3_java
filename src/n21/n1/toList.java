package n21.n1;

import java.util.ArrayList;
import java.util.List;

public class toList {
    public static <T> List<T> toList(T... t) {
        List<T> list = new ArrayList<>();
        for (T t1 : t) {
            list.add(t1);
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "Hello";
        Integer num = 123;
        System.out.println(toList(str));
        System.out.println(toList(num));
    }

}
