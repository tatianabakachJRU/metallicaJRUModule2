package lecture_2.assotciation.agregation;

public class OrganizationApp {
    public static void main(String[] args) {
        Employee tatiana = new Employee("Tatiana");
        Employee valery = new Employee("Valery");

        Department hr = new Department("HR");
        hr.addEmployee(tatiana);
        hr.addEmployee(valery);

        for (Employee employee : hr.getEmployees()) {
            System.out.println(employee.getName());
        }
    }
}
