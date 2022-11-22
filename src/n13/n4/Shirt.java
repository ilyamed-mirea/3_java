package n13.n4;

public class Shirt {
    String id;
    String type;
    String color;
    String size;

    Shirt(String gotString) {
        String[] splitted = gotString.split(",");
        id = splitted[0];
        type = splitted[1];
        color = splitted[2];
        size = splitted[3];
    }

    //tostring
    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
