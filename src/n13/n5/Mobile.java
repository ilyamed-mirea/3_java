package n13.n5;

public class Mobile {
    String countryCode;
    String number10;
    StringBuilder number;

    Mobile(String gotString) {
        if (gotString.startsWith("+")) {
            countryCode = gotString.substring(1, gotString.length() - 10);
            number10 = gotString.substring(gotString.length() - 10);
        } else {
            countryCode = gotString.substring(0, 1);
            number10 = gotString.substring(1);
        }
        buildNumber();
    }

    void buildNumber() {
        number = new StringBuilder();
        number.append("+").append(countryCode).append(number10.substring(0, 3)).append("-").append(number10.substring(3, 6)).append("-").append(number10.substring(6, 10));
    }
}
