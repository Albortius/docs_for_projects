import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        Employee men = new Employee(
                "Bob",
                parseDate("1997-05-03"),
                5000);
        CalculateSalary listOfEmp = new CalculateSalary();

        System.out.println(listOfEmp);

        System.out.println(men.getEmpInfo());

    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
