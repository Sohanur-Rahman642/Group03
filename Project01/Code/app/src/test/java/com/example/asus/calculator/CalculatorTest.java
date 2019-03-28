package com.example.asus.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

public class CalculatorTest {


    private static final double DELTA = 0.001;

    /*--DELTA is actually the measure of error here,
      or in a word it defines uncertainty. In this case,
      delta is the maximum allowed absolute difference
      between actual and expected value. So the test is
      basically-
      if (Math.absolute(expected - actual) > delta)
      fail
    --*/


    @Test

    /*
    * Take two double parameters
    * Call Addition method of the Calculator class
    * Call assertEquals method to compare between expected & actual value
    * */

    public void testAddition() throws Exception {

        double number1 = 2.4;
        double number2 = 1.7;
        double expected = 4.1;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);

    }
    

    @Test
    /*
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtraction() throws Exception {

            double number1 = 2.4;
            double number2 = 1.7;
            double expected = 0.7;

            double actual = Calculator.Subtraction(number1,number2);
            assertEquals(expected,actual,DELTA);

    }
    


    @Test
    /*
     * Objective: Check the method for negative outputs
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtractionForNegativeOutputs() throws Exception {

        double number1 = 1.3 ;
        double number2 = 4.2;
        double expected = -2.9;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    @Test
    /*
     * Take two double parameters
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testMultiplication() throws Exception {

        double number1 = 3.7 ;
        double number2 = 8.2;
        double expected = 30.34;

        double actual = Calculator.Multiplication(number1,number2);
        assertEquals(expected,actual,DELTA);

    }


    @Test
    /*
     * Take two double parameters
     * Call Division method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testDivision() throws Exception {

        double number1 = .5;
        double number2 = 2;
        double expected = 2.5;

        double actual = Calculator.Division(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    /*--Test for checking output of division by zero operations--*/

    /*
     * Objective: Showing test failed with getting the java.lang.ArithmeticException
     * Take two double parameters with one zero
     * Call Division method of the Calculator class
     * */

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivisionByZero() throws ArithmeticException
    {
        double number1 = 7;
        double number2 = 0;

        Calculator.Division(number1, number2);

    }


    /*.........Input Space Partitioning.......*/
    /*........Input Characteristics:
    Integers (Positive & Negative),
     Floats (Positive & Negative),
     Double (Positive & Negative),
      All zero ,
      All null*/


    /*...Test to check addition() for two positive integers from the blocks*/
    @Test
    /*
     * Take two Positive Integers parameters from the blocks {684,39852}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveIntegers(){
         int number1 = 684;
         int number2= 39852;
         Double d1 = new Double(number1);
         Double d2 = new Double(number2);

         int expected = 40536;

         double actual = Calculator.Addition(d1,d2);

         assertEquals(expected,actual,DELTA);

    }

    /*...Test to check addition() for two negative integers from the blocks*/
    @Test
    /*
     * Take two Negative Integers parameters from the blocks {-4731,-98432}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeIntegers(){
        int number1 = -4731;
        int number2= -98432;
        Double d1 = new Double(number1);
        Double d2 = new Double(number2);

        int expected = -103163;

        double actual = Calculator.Addition(d1,d2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two positive floats from the blocks*/
    @Test
    /*
     * Take two Positive Floats parameters from the blocks {872.61f,12341.23f}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveFloats(){
        float number1 = 872.61f;
        float number2= 12341.23f;


        float expected = 13213.84f;

        double actual = (float) (Calculator.Addition(number1,number2));

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two negative floats from the blocks*/
    @Test
    /*
     * Take two Negative Floats parameters from the blocks {-7136.87f,-72341.21f}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeFloats(){
        float number1 = -7136.87f;
        float number2= -72341.21f;


        float expected = -79478.078125f;

        double actual = (float) Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two positive doubles from the blocks*/
    @Test
    /*
     * Take two Positive Doubles parameters from the blocks {2459.432,64936.0003}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveDoubles(){
        double number1 = 2459.432;
        double number2=64936.0003;


        double expected = 67395.4323;

        double actual =  Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }

    /*...Test to check addition() for two negative doubles from the blocks*/
    @Test
    /*
     * Take two Negative Doubles parameters from the blocks {-2459.432,-64936.0003}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeDoubles(){
        double number1 = -2459.432;
        double number2= -64936.0003;


        double expected = -67395.4323;

        double actual =  Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }













}