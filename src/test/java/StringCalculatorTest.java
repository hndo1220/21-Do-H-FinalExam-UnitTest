import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest{
    private StringCalculator myStringCalculator;
    @Test
    // Check that method ignores numbers >= 1000
    public void addTest1() {
        int expected = 1;
        int actual = myStringCalculator.add("1, 1000");
        assertEquals(expected, actual);
    }

    // test that method throws exception if argument is negative

    @Test
    public void addTest2(){
        assertThrows(IllegalArgumentException.class, () -> {
            myStringCalculator.add("-1, 5");
        });
    }

}