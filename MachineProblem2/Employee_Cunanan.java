package MachineProblem2;

public class Employee_Cunanan {
    public static void main(String[] args) {
        // Create PaySlip object
        PaySlip_Cunanan payslip = new PaySlip_Cunanan("J. E. Cunanan", 16500.00, 2.5);

        // Formatting
        String formattedBasicSalary = String.format("₱%.2f", payslip.getBasicSalary());
        String formattedOverTimeHours = String.format("%.2f", payslip.getOverTimeHours());
        String formattedOverTimePay = String.format("₱%.2f", payslip.getOverTimePay());
        String formattedGrossIncome = String.format("₱%.2f", payslip.getGrossIncome());
        String formattedWithholdingTax = String.format("₱%.2f", payslip.getWithHoldingTax());
        String formattedSss = String.format("₱%.2f", payslip.getSss());
        String formattedPagIbig = String.format("₱%.2f", payslip.getPagIbig());
        String formattedPhilHealth = String.format("₱%.2f", payslip.getPhilHealth());
        String formattedNetPay = String.format("₱%.2f", payslip.getNetPay());

        // Print to terminal
        System.out.println("Employee Name:   " + payslip.getEmployeeName());
        System.out.println("------------------------------------------------------");
        System.out.println("Basic Salary:    " + formattedBasicSalary);
        System.out.println("No. of OT Hours: " + formattedOverTimeHours);
        System.out.println("OT Pay:          " + formattedOverTimePay);
        System.out.println("Gross Income:    " + formattedGrossIncome);
        System.out.println("Withholding Tax: " + formattedWithholdingTax);
        System.out.println("----------------------Deductions----------------------");
        System.out.println("SSS:             " + formattedSss);
        System.out.println("Pag-Ibig:        " + formattedPagIbig);
        System.out.println("PhilHealth:      " + formattedPhilHealth);
        System.out.println("------------------------------------------------------");
        System.out.println("Net Pay:         " + formattedNetPay);
    }
}
