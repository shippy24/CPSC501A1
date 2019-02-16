import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestParent {

    @Test (expected = RuntimeException.class)
    public void testCorrectArguments() {
        Parent.Parent(new double[] {});
    }
    
}