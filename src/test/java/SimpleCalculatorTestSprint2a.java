import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import test.SimpleCalculator;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by julen on 8/26/16.
 */



    @RunWith(Parameterized.class)
    public class SimpleCalculatorTestSprint2a {
    private SimpleCalculator calculator;
    private int expected;
    private int first;
    private int second;

    public SimpleCalculatorTestSprint2a(int expectedResult, int firstNumber,
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
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void add() {
        //Arrange
        float actual;
        //Act
        actual = this.calculator.add(first, second);
        //Assert
        assertEquals(expected, actual, 1.000);
    }
}
