import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Object-Oriented Programming Advanced Concepts
 * HND Software Development
 * Year 2
 *
 * Anna Podlasek
 * EC1842981
 * May 2023
 */

public class IPayCalculatorTest
{

    public IPayCalculatorTest() {}

    /**
     * Test of calculateTotalFee method, of class IPayCalculator.
     */
    @Test
    public void testCalculateTotalFee()
    {
        System.out.println("calculateTotalFee");
        IPayCalculator instance = new IPayCalculatorImpl();
        double expResult = 100.0;
        double result = instance.calculateTotalFee();
        assertEquals(expResult, result, 0);
    }

    public class IPayCalculatorImpl implements IPayCalculator
    {

        @Override
        public double calculateTotalFee()
        {
            //Return a fixed value for testing
            return 100.0;
        }
    }

}
