package preambule.casa;

import java.util.ArrayList;

public class Service {
    private String serviceName;
    private ArrayList<Employee> employees;

    public Service(String serviceName) {
        this.serviceName = serviceName;
        this.employees = new ArrayList<Employee>();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    boolean addEmployee(Employee newEmp){
        if(this.employees.add(newEmp))
            return true;
        return false;
    }

}
