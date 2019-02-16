import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestMain {

    private Mother mom;
    private Father dad;

    @Before
    public void setUp()  {
        mom = new Mother(new double[] {32, 10000 , 100 , 100, 100});
        //rare case since parameters weren't given as negative but worth looking at
        dad = new Father(new double[] {-32, -10000, -100, -100, -100, -0.15});
    }

    @After
    public void tearDown() {
        mom = null;
        dad = null;
    }

    @Test (expected = RuntimeException.class)
    public void testNegativeParameters(){
        Father.Father( new double[] {-32, -10000, -100, -100, -100, -0.15} );
    }
    
    @Test
    public void testMaxBaseSalary(){
        assertEquals(10000, mom.getBaseSalary());
    }

    @Test (expected = RuntimeException.class)
    public void testMaxSalaryAfterDeductionsNegative() {
        dad.salaryAfterExpenses();
    }

    @Test 
    public void testMaxSalaryAfterDeductions() {
        assertEquals(9700, mom.salaryAfterExpenses());
    }
}