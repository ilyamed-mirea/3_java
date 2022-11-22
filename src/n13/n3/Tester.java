package n13.n3;

public class Tester {
    public static void main(String[] args) {
        String[] gotString = new String[]{"Russia, Moscow, Moscow, Chertanovskya, 1, 2, 3",
                "Russia, Spb, Spb, Severnya, 32, 23, 32",
                "Mongolia, Sresktish, Sresktish, SVrejkdf, 111, 222, 333",
                "Country4, Region4, City4, Stree4, house44, corpus44, room4"};
        for (int i=0;i<gotString.length;i++) {
            Address address = new Address(gotString[i]);
            address.split1();
            address.print();
            System.out.println("==================================");
            address.split2(",");
            address.print();
        }
        System.out.println("==================================");
        System.out.println("==================================");
        Address addressDelim = new Address("Country45! Region45! City45! Stree45! house445! corpus445! room45");
        addressDelim.split2("!");
        addressDelim.print();
    }
}
