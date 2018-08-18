package com.nisan.training.fizzbuzz;

public class FizzBuzz {
	
	public String output(int a)
	{
		if(a%3 == 0 && a%5 == 0)
			return "FizzBuzz";
		else if(a%3==0)
			return "Fizz";
		else if(a%5==0)
			return "Buzz";
					return "null";
	}

}
