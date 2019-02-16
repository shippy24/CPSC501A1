class Mother extends Parent {


    public Mother (double[] params) throws RuntimeException {
        super(params);
        loyaltyrate = 0.15;
    }

    public double salaryAfterDeductions() {
        salaryAfterExpenses = baseSalary + (age * loyaltyrate) - firstExpense - secondExpense - thirdExpense ;
        return salaryAfterExpenses;
    }

}