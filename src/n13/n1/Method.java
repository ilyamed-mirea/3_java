package n13.n1;

public class Method {

    public static void main(String[] args) {
        String like = "I like Java!!!!";
        printString(like);
    }

    private static void printString(String like) {
        System.out.println(like.charAt(like.length()-1));
        System.out.println(like.endsWith("!!"));
        System.out.println(like.startsWith("i dont like"));
        System.out.println(like.contains("like"));
        System.out.println(like.indexOf("Java"));
        System.out.println(like.replace("a","o"));
        System.out.println(like.toUpperCase());
        System.out.println(like.toLowerCase());
        System.out.println(like.substring(like.indexOf("J"),like.lastIndexOf("a")+1));
    }
}
