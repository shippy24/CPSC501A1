class Mother extends Parent {


    public Mother (double[] params) {
        super(params);
        loyaltyrate = 0.15;
    }

    public double salaryAfterDeductions() {
        salaryAfterExpenses = baseSalary + (age * loyaltyrate) - firstExpense - secondExpense - thirdExpense ;
        return salaryAfterExpenses;
    }

    public double calculateSavings() { return 0; }
}