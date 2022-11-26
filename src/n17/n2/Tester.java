package n17.n2;

public class Tester {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeContoller contoller = new EmployeeContoller(model, view);
        contoller.setEmployeeName("Stas");
        contoller.setEmployeeId("10");
        contoller.updateView();
        contoller.setEmployeeName("Ken");
        contoller.updateView();

    }
}
