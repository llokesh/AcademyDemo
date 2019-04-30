import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import test.SimpleCalculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by julen on 8/26/16.
 */

@RunWith(Parameterized.class)
public class SimpleCalculatorTestSprint2 {
    private SimpleCalculator calculator;
    private int expected;
    private int first;
    private int second;

    public SimpleCalculatorTestSprint2(int expectedResult, int firstNumber,
                                       int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> addedNumbers() {
        return Arrays.asList(new Integer[][]{{3, 1, 2}, {5, 2, 3},
                {7, 3, 4}, {9, 4, 5},});
    }

    @Before
    public void setUp() throws Exception {
        this.calculator = new SimpleCalculator();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void add() {
        //Arrange
        List<Integer> n1 = Arrays.asList(1,2,4);
        List<Integer> n2 = Arrays.asList(1,2,4,5);
        //Act
        this.calculator.addTwoLists(n1, n2);
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticExpection() {
        //Arrange
        float n1 = 4;
        float n2 = 0;
        //Act
        this.calculator.divide(n1, n2);
    }
}