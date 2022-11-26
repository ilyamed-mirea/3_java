package n17.n3;

public class Tester {
public static void main(String[] args) {
        Bike model = new Bike();
        BikeView view = new BikeView();
        BikeController controller = new BikeController(model, view);
        controller.setBikeName("Honda");
        controller.setBikeModel("CBR");
        controller.updateView();
        controller.setBikeName("Yamaha");
        controller.updateView();
    }
}
