package coreJavaSummary;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SumOfElementsOfArrayTest {
    @Test
    public void testSumOfElementsOfArrayTest(){
        Integer[] array = new Integer[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        //assertTrue("Sum", 15, SumOfElementsOfArray.sumOfElementsOfArray(array));
        assertEquals(15,SumOfElementsOfArray.sumOfElementsOfArray(array));
    }




}
