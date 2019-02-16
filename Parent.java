abstract class Parent {

    protected double age;
    protected double baseSalary;
    protected double salaryAfterExpenses;
    protected double firstExpense;
    protected double secondExpense;
    protected double thirdExpense;
    protected double savings;
    protected double loyaltyrate;

    public Parent( double[] params) throws RuntimeException {
        if (params.length != 5 && params.length != 6)
            throw new RuntimeException("params = Incorrect Number of Arguments");
        age = params[0];
        baseSalary = params[1];
        firstExpense = params[2];
        secondExpense = params[3];
        thirdExpense = params[4];
    }

    public abstract double salaryAfterDeductions();


    public void calculateSavings(double multiplier) { savings = baseSalary * multiplier; }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSavings() {
        return savings;
    }
        
}