package MachineProblem2;

public class PaySlip_Cunanan {
    // Attributes
    private String employeeName;
    private double basicSalary;
    private double overTimeHours;
    private double overTimePay;
    private double grossIncome;
    private double withHoldingTax;
    private double sss;
    private double pagIbig;
    private double philHealth;
    private double netPay;

    // Constructor
    public PaySlip_Cunanan(String employeeName, double basicSalary, double overTimeHours) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.overTimeHours = overTimeHours;
        this.overTimePay = calcOvertimePay();
        this.grossIncome = calcGrossIncome();
        this.withHoldingTax = calcWithholdingTax();
        this.sss = calcSSS();
        this.pagIbig = calcPagIbig();
        this.philHealth = calcPhilHealth();
        this.netPay = calcNetPay();
    }

    // Getters
    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public double getOverTimePay() {
        return overTimePay;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public double getWithHoldingTax() {
        return withHoldingTax;
    }

    public double getSss() {
        return sss;
    }

    public double getPagIbig() {
        return pagIbig;
    }

    public double getPhilHealth() {
        return philHealth;
    }

    public double getNetPay() {
        return netPay;
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

    public void setOverTimePay(double overTimePay) {
        this.overTimePay = overTimePay;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public void setWithHoldingTax(double withHoldingTax) {
        this.withHoldingTax = withHoldingTax;
    }

    public void setSss(double sss) {
        this.sss = sss;
    }

    public void setPagIbig(double pagIbig) {
        this.pagIbig = pagIbig;
    }

    public void setPhilHealth(double philHealth) {
        this.philHealth = philHealth;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
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
