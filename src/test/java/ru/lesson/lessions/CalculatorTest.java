package ru.lesson.lessions;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        assertEquals(2,calculator.getResult());
    }
    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(10,2);
        assertEquals(5,calculator.getResult());
    }
    @Test
    public void multiplication() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiplication(2,4);
        assertEquals(8,calculator.getResult());
    }
    @Test
    public void subtraction() throws Exception {
        Calculator calculator = new Calculator();
        calculator.subtraction(4,2);
        assertEquals(2,calculator.getResult());
    }
    @Test()
    public void clean() throws Exception {
        Calculator calculator = new Calculator();
        calculator.clearResult();
        assertEquals(0,calculator.getResult());
    }


    @Test()
    public void divInCycle() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divInCycle(1,1);
        assertEquals(1,calculator.getResult());
    }
    @Test(expected = UserExeption.class)
    public void divInCycleTest() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divInCycle();

    }
    @Test()
    public void divInCycleExeption() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divInCycle(1,1);
        assertEquals(1,calculator.getResult());
    }
    @Test(expected = IllegalArgumentException.class)
    public void divInCycleRuntimeExeption() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divInCycle(1,0);
        assertEquals(1,calculator.getResult());
    }
}