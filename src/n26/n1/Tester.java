package n26.n1;

import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        //n2
        hashtab hashTable = new hashtab();
        hashTable.hashtabInit(10);
        hashTable.hashtabAdd("key1", "value1");
        hashTable.hashtabAdd("key2", "value2");
        hashTable.hashtabAdd("key3", "value3");
        hashTable.hashtabAdd("key4", "value4");
        hashTable.hashtabAdd("key5", "value5");
        hashTable.hashtabAdd("key6", "value6");
        hashTable.hashtabAdd("key7", "value7");
        hashTable.hashtabAdd("key8", "value8");
        hashTable.hashtabAdd("key9", "value9");
        hashTable.hashtabAdd("key10", "value10");

        //n3
        System.out.println(hashTable.hashtabLookup("key1"));
        hashTable.hashtabDelete("key1");
        System.out.println(hashTable.hashtabLookup("key1"));

        //n4
        Set keys = hashTable.hashTable.keySet();
        for (Object key : keys) {
            System.out.println(key + " " + hashTable.hashtabLookup((String) key));
        }
    }
}
