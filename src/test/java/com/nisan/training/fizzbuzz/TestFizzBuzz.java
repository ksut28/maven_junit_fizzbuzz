package com.nisan.training.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzBuzz {

	@Test
	public void test1() 
	{
		FizzBuzz c = new FizzBuzz();
	
		assertEquals("Fizz", c.output(9));
		
	}
	@Test
	public void test4() 
	{
		FizzBuzz c = new FizzBuzz();
		assertEquals("Fizz", c.output(18));

		
	}
	@Test
	public void test2() 
	{
		FizzBuzz c = new FizzBuzz();
		
		assertEquals("FizzBuzz", c.output(15));
	
		
	}
	@Test
	public void test3() 
	{
		FizzBuzz c = new FizzBuzz();
		assertEquals("Buzz", c.output(10));
	
	}

}
