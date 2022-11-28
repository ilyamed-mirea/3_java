package n21.n5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    //write private static generic variables
    private static Object T;
    private static Object K;
    private static Object V;

    public static void main(String[] args) {
        ArrayList<String> list = newArrayList("Hello", "World");
        System.out.println(list);

        HashSet<String> set = newHashSet("Hello", "World");
        System.out.println(set);

        String[] keys = {"Hello", "World"};
        Integer[] values = {1, 2};
        HashMap<String, Integer> map = newHashMap(keys, values);
        System.out.println(map);
    }

    public static <T> ArrayList<T> newArrayList(T... t) {
        ArrayList<T> list = new ArrayList<>();
        for (T t1 : t) {
            list.add(t1);
        }
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... t) {
        HashSet<T> set = new HashSet<>();
        for (T t1 : t) {
            set.add(t1);
        }
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] k, V[] v) {
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < k.length; i++) {
            map.put(k[i], v[i]);
        }
        return map;
    }

}
