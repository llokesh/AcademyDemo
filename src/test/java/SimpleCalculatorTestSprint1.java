import org.junit.Before;
import org.junit.Test;
import test.SimpleCalculator;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTestSprint1 {
    private SimpleCalculator calculator;

    @Before
    public void setUp()  {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void testAddTwoPositiveNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = 2;
        float expected = 5;
        float actual;
        //Act
        actual = this.calculator.add(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        //Arrange
        float n1 = -3;
        float n2 = -3;
        float expected = -6;
        float actual;
        //Act
        actual = this.calculator.add(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = -2;
        float expected = 1;
        float actual;
        //Act
        actual = this.calculator.add(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testSubtractTwoPositiveNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = 2;
        float expected = 1;
        float actual;
        //Act
        actual = this.calculator.subtract(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testSubtractTwoNegativeNumbers() {
        //Arrange
        float n1 = -3;
        float n2 = -3;
        float expected = 0;
        float actual;
        //Act
        actual = this.calculator.subtract(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testSubtractPositiveAndNegativeNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = -2;
        float expected = 5;
        float actual;
        //Act
        actual = this.calculator.subtract(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testMultiplyTwoPositiveNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = 2;
        float expected = 6;
        float actual;
        //Act
        actual = this.calculator.multiply(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testMultiplyTwoNegativeNumbers() {
        //Arrange
        float n1 = -3;
        float n2 = -3;
        float expected = 9;
        float actual;
        //Act
        actual = this.calculator.multiply(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {
        //Arrange
        float n1 = 6;
        float n2 = -2;
        float expected = -3;
        float actual;
        //Act
        actual = this.calculator.divide(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testDivisionTwoPositiveNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = 1;
        float expected = 3;
        float actual;
        //Act
        actual = this.calculator.divide(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testDivisionTwoNegativeNumbers() {
        //Arrange
        float n1 = -3;
        float n2 = -3;
        float expected = 1;
        float actual;
        //Act
        actual = this.calculator.divide(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testDivisionPositiveAndNegativeNumbers() {
        //Arrange
        float n1 = 3;
        float n2 = -3;
        float expected = -1;
        float actual;
        //Act
        actual = this.calculator.divide(n1, n2);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Test
    public void testAdditionOutsideRange() {
        //Arrange
        float expected = -256;
        float actual;
        //Act
        actual = this.calculator.add(-256, 256);
        //Assert
        assertEquals(expected, actual, 1.000);
    }

    @Before
    public void tearDown()  {

    }

}
