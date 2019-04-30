import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import test.CalculatorService;
import test.MathApplication;
import test.SimpleCalculator;

// @RunWith attaches a runner with the test class to initialize the test data
    @RunWith(MockitoJUnitRunner.class)
    public class MathApplicationTester {

        private MathApplication mathApplication;
        private CalculatorService calcService;
    private SimpleCalculator calculator;

        @Before
        public void setUp(){
            mathApplication = new MathApplication();
            calcService = mock(CalculatorService.class);
            mathApplication.setCalculatorService(calcService);
            calculator = new SimpleCalculator();
        }

        @Test
        public void testAddAndSubtract(){

            //add the behavior to add numbers
            when(calcService.add(20.0,10.0)).thenReturn(30.0);

            //subtract the behavior to subtract numbers
            when(calcService.subtract(20.0,10.0)).thenReturn(10.0);

            //add the behavior to multiply numbers
            when(calcService.multiply(20.0,10.0)).thenReturn(20.0);

            //subtract the behavior to divide numbers
            when(calcService.divide(20.0,10.0)).thenReturn(2.0);


            //test the BODMAS functionality
            Assert.assertEquals((mathApplication.subtract(20.0, 10.0) + mathApplication.subtract(20.0, 10.0) * calculator.multiply(20, 10))
                    ,2010.0,0);

        }
    }
