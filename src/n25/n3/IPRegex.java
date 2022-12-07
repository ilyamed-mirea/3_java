package n25.n3;

public class IPRegex {
    public static void main(String[] args) {
        String ip_regex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String ip = "127.0.0.1";
        String ip2 = "255.255.255.0";

        String ip3 = "1300.6.7.8";
        String ip4 = "abc.def.gha.bcd";
        System.out.println(ip.matches(ip_regex));
        System.out.println(ip2.matches(ip_regex));
        System.out.println(ip3.matches(ip_regex));
        System.out.println(ip4.matches(ip_regex));


    }
}
