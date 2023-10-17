import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalculateSalary extends Employee {

    public CalculateSalary(String name, Date dob, int baseSalary) {
        super(name, dob, baseSalary);
        // TODO Auto-generated constructor stub
    }

    public int calculateNetSalary() {
        int tax = (int) (Employee.getBaseSalary() * 0.25);// calculate in otherway
        return Employee.getBaseSalary() - tax;
    }

}
