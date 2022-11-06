package n4.part0.n2;

public class TShrit extends Clothes implements MenClothing, WomenClothing {

    @Override
    public void dressMan() {
        System.out.println("Man - TShirt");

    }

    @Override
    public void dressWomen() {
        System.out.println("Women - TShirt");
    }
}
