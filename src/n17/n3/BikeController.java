package n17.n3;

public class BikeController {
    private Bike model;
    private BikeView view;

    public BikeController(Bike model, BikeView view) {
        this.model = model;
        this.view = view;
    }

    public void setBikeName(String name) {
        model.setName(name);
    }

    public String getBikeName() {
        return model.getName();
    }

    public void setBikeModel(String gotModel) {
        model.setModel(gotModel);
    }

    public String getBikeModel() {
        return model.getModel();
    }

    public void updateView() {
        view.printBikeDetails(model.getName(), model.getModel());
    }
}
