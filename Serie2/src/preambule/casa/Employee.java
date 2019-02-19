package preambule.casa;

public class Employee {
    private int employeeId;

    private String firstName;

    private String lastName;
    private Service service;

    public Employee(int employeeId, String firstName, String lastName, Service service) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.service = service;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
