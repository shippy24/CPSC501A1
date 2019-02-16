abstract class Parent {

    protected double age;
    protected double baseSalary;
    protected double salaryAfterExpenses;
    protected double firstExpense;
    protected double secondExpense;
    protected double thirdExpense;
    protected double savings;
    protected double loyaltyrate;

    public Parent( double[] params){
        age = params[0];
        baseSalary = params[1];
        firstExpense = params[2];
        secondExpense = params[3];
        thirdExpense = params[4];
    }

    public abstract double salaryAfterDeductions();


    public abstract double calculateSavings();
        
}