package com.cognizant.calculator.phase10.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {

	Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		calc.setOperands(2.3,  3.2);
		assertEquals(5.5, calc.add(), .00001);
	}
	
	@Test
	public void testSubtract() {
		calc.setOperands(2.3,  3.2);
		assertEquals(-.9, calc.subtract(), .00001);
	}
	
	@Test
	public void testMultiply() {
		calc.setOperands(2.3,  3.2);
		assertEquals(7.36, calc.multiply(), .00001);
	}
	
	@Test
	public void testDivide() {
		calc.setOperands(2.3,  3.2);
		assertEquals(.71875, calc.divide(), .0000001);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		fail("Not yet implemented");
	}

}
