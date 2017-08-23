package org.cap.bankapp.test;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {

	private AcccountService acccountService;
	
	private int input1;
	private int input2;
	private int output;
	
	
	public ParameterizedTestCase(int input1, int input2, int output) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
	}
	
	@Parameters
	public static List<Object[]> myParameters(){
		return Arrays.asList(new Object[][]{
			{5,5,10},
			{0,5,5},
			{-5,-5,-10},
			{100,-5,95}
		});
	}
	
	@Test
	public void test_add_numbers(){
		
		acccountService=new AccountServiceImpl();
		
		Assert.assertEquals(output, acccountService.addNumbers(input1, input2));
		
	}
	
	
}
