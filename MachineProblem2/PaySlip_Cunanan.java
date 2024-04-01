package MachineProblem2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaySlip_Cunanan {
    // Attributes
    private String employeeName;
    private double basicSalary;
    private int overTimeHours;
    private double overTimePay;
    private double grossIncome;
    private double sss;
    private double pagIbig;
    private double philHealth;
    private double netPay;

    // Constructor
    public PaySlip_Cunanan(String employeeName, double basicSalary, int overTimeHours) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.overTimeHours = overTimeHours;
    }

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }


    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    // Computations
    private double calcOvertimePay() {
        return (basicSalary * 0.01) * overTimeHours;
    }

    private double calcGrossIncome() {
        return basicSalary + calcOvertimePay();
    }

    private double calcSSS() {
        return basicSalary * 0.13;
    }

    private double calcPagIbig() {
        return basicSalary * 0.02;
    }

    private double calcPhilHealth() {
        double maxContri = 2450;
        double philHealthContri = basicSalary * 0.035;

        if (philHealthContri > maxContri) {
            philHealthContri = maxContri;
        }
        return philHealthContri;
    }

    private double calcWithholdingTax() {
        double withHoldingTax = 0;
        if (calcGrossIncome() <= 20000) {
            withHoldingTax = 0;
        } else if (calcGrossIncome() <= 31000) {
            withHoldingTax = (calcGrossIncome() - 20000) * 0.20;
        } else if (calcGrossIncome() <= 61000) {
            withHoldingTax = (calcGrossIncome() - 31000) * 0.25 + 2300;
        } else if (calcGrossIncome() <= 154000) {
            withHoldingTax = (calcGrossIncome() - 61000) * 0.30 + 10000;
        } else if (calcGrossIncome() <= 615000) {
            withHoldingTax = (calcGrossIncome() - 154000) * 0.32 + 38000;
        } else if (calcGrossIncome() > 615000) {
            withHoldingTax = (calcGrossIncome() - 615000) * 0.35 + 185000;
        }
        return withHoldingTax;
    }

    private double calcNetPay() {
        return calcGrossIncome() - calcWithholdingTax() - calcSSS() - calcPagIbig() - calcPhilHealth();
    }
}
