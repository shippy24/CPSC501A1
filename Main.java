import java.util.TreeMap;

public class Main {

    private static double[][] females = {{30, 45000, 2500, 50, 150 },
                                        {42, 77000, 1700, 20, 110},
                                        {21, 38000, 1900, 50, 150 }};
                                     
    private static double[][] males = {{32, 62000, 4500, 25, 75, 0.15},
                                        {42, 70000, 1000, 25, 75, 0.2},
                                        {27, 87000, 2700, 55, 28, 0.30}};    
                                        
    private static TreeMap<Double, Double> savingsPercentageMap = new TreeMap<>();
                                        
    public static void main (String[] args) {

        initializeMap();

        Mother mom;
        Father dad;
        double maxBaseSalary = 0;
        double maxDeductedSalary = 0;
        double maxSavings = 0;
        double savingsMultiplier;
        
        for (int i = 0; i < 3; i++) {
            mom = new Mother(females[i]);
            dad = new Father(males[i]);

            //attain greatest base salary
            if (mom.getBaseSalary() + dad.getBaseSalary() > maxBaseSalary ) {
                maxBaseSalary = mom.getBaseSalary() + dad.getBaseSalary();
            }
            //attain greatest salary after deductions
            if (mom.salaryAfterDeductions() + dad.salaryAfterDeductions() > maxDeductedSalary ) {
                maxDeductedSalary = mom.salaryAfterDeductions() + dad.salaryAfterDeductions();
            }  

            //attain greatest savings
            savingsMultiplier = savingsPercentageMap.floorEntry(females[i][0]).getValue();
            mom.calculateSavings(savingsMultiplier);
            savingsMultiplier = savingsPercentageMap.floorEntry(males[i][0]).getValue();
            dad.calculateSavings(savingsMultiplier);

            if (mom.getSavings() + dad.getSavings() > maxSavings ) {
                maxSavings = mom.getSavings() + dad.getSavings();
            } 
        }

         
            
        System.out.println("Greatest income: " + maxBaseSalary);

     
        
        System.out.println("After savings: " + maxDeductedSalary);

    
        
        System.out.println("savings: " + maxSavings);
        
    }

    //REFACTORING TO USE MORE DATA STRUCTURES
    public static void initializeMap(){
        savingsPercentageMap.put(0.0, 0.0);
        savingsPercentageMap.put(25.0, 0.05);
        savingsPercentageMap.put(35.0, 0.08);
        savingsPercentageMap.put(60.0, 0.15);
    }
}