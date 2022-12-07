package n27.n1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {
    public static HashSet<Integer> hashSet;
    public static TreeSet<Integer> treeSet;

    public static void main(String[] args) {
        hashSet = new HashSet<Integer>();
        //fill hashset
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        //transform hashset to treeset
        treeSet = new TreeSet<Integer>(hashSet);
        //print treeset
        System.out.println(treeSet);

    }
}
