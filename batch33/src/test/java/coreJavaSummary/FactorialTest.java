package coreJavaSummary;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial(){
        assertEquals(120,Factorial.factorial(5));
    }
}
