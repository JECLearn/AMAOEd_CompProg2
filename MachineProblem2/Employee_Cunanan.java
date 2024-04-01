/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 2
*/
package MachineProblem2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee_Cunanan {
    public static void main(String[] args) {
        // Get current time and date
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formatting time and date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(formatter);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Create PaySlip object
        PaySlip_Cunanan payslip = new PaySlip_Cunanan(employeeName, basicSalary, overtimeHours);

        // Formatting
        String formattedBasicSalary = String.format("₱%.2f", payslip.getBasicSalary());
        String formattedOverTimeHours = String.format("%.1f", payslip.getOverTimeHours());
        String formattedOverTimePay = String.format("₱%.2f", payslip.getOverTimePay());
        String formattedGrossIncome = String.format("₱%.2f", payslip.getGrossIncome());
        String formattedWithholdingTax = String.format("₱%.2f", payslip.getWithHoldingTax());
        String formattedSss = String.format("₱%.2f", payslip.getSss());
        String formattedPagIbig = String.format("₱%.2f", payslip.getPagIbig());
        String formattedPhilHealth = String.format("₱%.2f", payslip.getPhilHealth());
        String formattedNetPay = String.format("₱%.2f", payslip.getNetPay());

        // Print to terminal
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Date Generated  : " + formattedDateTime);
        System.out.println("------------------------------------------------------------");
        System.out.println("Employee Name   : " + payslip.getEmployeeName());
        System.out.println("Basic Salary    : " + formattedBasicSalary);
        System.out.println("No. of OT Hours : " + formattedOverTimeHours + " Hours");
        System.out.println("OT Pay          : " + formattedOverTimePay);
        System.out.println("Gross Income    : " + formattedGrossIncome);
        System.out.println("Withholding Tax : " + formattedWithholdingTax);
        System.out.println("----------------------Other Deductions----------------------");
        System.out.println("SSS             : " + formattedSss);
        System.out.println("Pag-Ibig        : " + formattedPagIbig);
        System.out.println("PhilHealth      : " + formattedPhilHealth);
        System.out.println("------------------------------------------------------------");
        System.out.println("Net Pay         : " + formattedNetPay);
        System.out.println("------------------------------------------------------------");
    }
}
