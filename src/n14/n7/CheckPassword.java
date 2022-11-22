package n14.n7;

public class CheckPassword {
    public static void main(String[] args) {
        //write regex to check password strength
        //password must contain at least 1 digit
        //password must contain at least 1 lowercase letter
        //password must contain at least 1 uppercase letter
        //password length must be more than 8 characters

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

        String input1 = "F032_Password";
        String input2 = "Try.Spy11";
        String input3 = "QWERTy1QWERTy1";

        String input4 = "smart_pass";
        String input5 = "A007";
        String input6 = "007x";

        System.out.println(input1.matches(regex));
        System.out.println(input2.matches(regex));
        System.out.println(input3.matches(regex));
        System.out.println(input4.matches(regex));
        System.out.println(input5.matches(regex));
        System.out.println(input6.matches(regex));
    }
}
