import java.util.Date;

public abstract class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public static int getBaseSalary() {
        return baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
