package n14.n6;

public class checkEmal {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z.-]{2,6}";
        //true
        String input1 = "user@example.com";
        String input2 = "root@test.ru.com";
        String input3 = "i-here+there@test.ru.com";
        //false
        String input4 = "myhost@@@com.ru";
        String input5 = "@my.ru";
        String input6 = ".@.ru";
        System.out.println(input1.matches(regex));
        System.out.println(input2.matches(regex));
        System.out.println(input3.matches(regex));
        System.out.println(input4.matches(regex));
        System.out.println(input5.matches(regex));
        System.out.println(input6.matches(regex));
    }
}
