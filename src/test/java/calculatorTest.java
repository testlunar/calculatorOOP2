import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class calculatorTest {




    @Test
    public void resultAddition() throws Exception {
        Calculator calculator = new Calculator();
        double res = calculator.result(2.5,6.5,  '+');
        assertEquals(9, res,0);
        System.out.println("\n");
    }
    @Test
    public void resultDeducation() throws Exception {
        Calculator calculator = new Calculator();
        double res = calculator.result(5, 3, '-');
        assertEquals(2, res,0);
        System.out.println("\n");
    }
    @Test
    public void resultMultiplication() throws Exception {
        Calculator calculator = new Calculator();
        double res = calculator.result(2.5, 2, '*');
        assertEquals(5, res,0);
        System.out.println("\n");
    }
    @Test
    public void resultDivision() throws Exception {
        Calculator calculator = new Calculator();
        double res = calculator.result(5, 2, '/');
        assertEquals(2.5, res,0);
        System.out.println("\n");
    }

    @Test
    public void ZeroDivision() throws Exception {
         try {
            Calculator calculator = new Calculator();
            double res = calculator.result(2, 0, '/');
            fail();
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Нельзя делить на ноль"));
        }
        System.out.println("\n");
    }
    @Test
    public void NegativeAddition() throws Exception {
        Calculator calculator = new Calculator();
        double res = calculator.result(2, 3, '-');
        assertEquals(-1, res,0);
        System.out.println("\n");
    }
}
