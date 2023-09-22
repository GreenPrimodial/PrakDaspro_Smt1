import java.util.Scanner;
public class SalaryStudentID {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numAttendance, numAbsence, totalSalary;
        int salary = 40000, salaryDeduction = 25000;

        System.out.print("Input attendance number: ");
        numAttendance = input.nextInt();
        System.out.print("Input absence number: ");
        numAbsence = input.nextInt();

        totalSalary = (numAttendance * salary) - (numAbsence * salaryDeduction);
        System.out.println("Total salary: "+totalSalary);

    }
}
