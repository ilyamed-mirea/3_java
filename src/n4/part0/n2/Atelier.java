package n4.part0.n2;

public class Atelier {
    private static Clothes[] clothesTypes;

    public static void dressMan() {
        for (int i = 0; i < clothesTypes.length; ++i)
            if (clothesTypes[i] instanceof MenClothing)
                ((MenClothing) clothesTypes[i]).dressMan();
    }

    public static void dressWomen() {
        for (int i = 0; i < clothesTypes.length; ++i)
            if (clothesTypes[i] instanceof WomenClothing)
                ((WomenClothing) clothesTypes[i]).dressWomen();
    }

    public static void main(String[] args) {
        clothesTypes = new Clothes[4];
        clothesTypes[0] = new Pants();
        clothesTypes[1] = new Skirt();
        clothesTypes[2] = new TShrit();
        clothesTypes[3] = new Tie();

        dressMan();

        dressWomen();
    }
}
