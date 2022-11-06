package n4.part0.n2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        System.out.println("Man - pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman - pants");
    }
}
