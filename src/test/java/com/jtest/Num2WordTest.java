package com.jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Num2WordTest {
	
	Num2Word num;
	
	@Before
	public void init(){
		num = new Num2Word();
	}
	
	@Test
	public void thusandNumberTest(){
		assertEquals("one thousand", num.convert(1000));
	}

	@Test
	public void negativeNumberTest(){
		assertEquals("minus four hundred forty five", num.convert(-445));
	}
	
	@Test
	public void fiveDigitNumberTest(){
		assertEquals("fifty two thousand three hundred thirty four", num.convert(52334));
	}
	
	@Test
	public void sixDigitNumberTest(){
		assertEquals("two hundred thirteen thousand four hundred fifteen", num.convert(52334));
	}

	@Test
	public void sevenDigitNumberTest(){
		assertEquals("two million one hundred thirty four thousand one hundred twenty five", num.convert(52334));
	}

	@Test
	public void eightDigitNumberTest(){
		assertEquals("thirty three million three hundred eighty eight thousand eight hundred twenty two", num.convert(52334));
	}
	
	@After
	public void destroy(){
		num = null;
	}
}
