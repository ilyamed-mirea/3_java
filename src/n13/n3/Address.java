package n13.n3;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String corpus;
    String rooom;
    //Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира
    String gotString;

    Address(String gotString) {
        this.gotString = gotString;
    }

    void split1() {
        String[] splitted = gotString.split(",");
        country = splitted[0];
        region = splitted[1];
        city = splitted[2];
        street = splitted[3];
        house = splitted[4];
        corpus = splitted[5];
        rooom = splitted[6];
    }

    void split2(String delimiter) {
        StringTokenizer st = new StringTokenizer(gotString, delimiter);
        country = st.nextToken();
        region = st.nextToken();
        city = st.nextToken();
        street = st.nextToken();
        house = st.nextToken();
        corpus = st.nextToken();
        rooom = st.nextToken();
    }

    void print() {
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(house);
        System.out.println(corpus);
        System.out.println(rooom);
    }

}
