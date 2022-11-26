package n17.n2;

public class EmployeeContoller {
    private Employee model;
    private EmployeeView view;

    public EmployeeContoller(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String id) {
        model.setId(id);
    }

    public String getEmployeeId() {
        return model.getId();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getId());
    }
}
