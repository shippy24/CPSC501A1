class Father extends Parent {

    private double tfsa;

    public Father (double [] params ) throws RuntimeException {
        super(params);
        tfsa = params[params.length - 1];
        loyaltyrate = 0.12;
    }

    public double salaryAfterDeductions() {
        salaryAfterExpenses = baseSalary + (age * loyaltyrate) - firstExpense - secondExpense - thirdExpense - (baseSalary * tfsa);
        return salaryAfterExpenses;
    }

}