package org.cap.bankapp.test;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BankAppTestCase {

	private AcccountService acccountService;
	
	
	@Before
	public void setUp(){
		//System.out.println("Before Method");
		acccountService=new AccountServiceImpl();
	}
	
	
	@After
	public void tearDown(){
		//System.out.println("After Method");
	}
	
	@Test
	public void test_addNumbers() {
		
	assertEquals(35, acccountService.addNumbers(10, 25));
		
	}
	
	@Ignore
	@Category(GoodTestCategory.class)
	@Test(expected=IllegalArgumentException.class)
	public void test_addNumber_with_null_customer() throws InvalidInitialAmountException{
		//acccountService=new AccountServiceImpl();
		/*Customer customer=new Customer();
		customer.setCustName("Tom");*/
		
		Customer customer=null;
		acccountService.addAccount(customer, 100);
	}
	
	@Category(BadTestCategory.class)
	@Test(expected=InvalidInitialAmountException.class)
	public void test_addNumber_with_invalid_initial_amount() throws InvalidInitialAmountException{
		//acccountService=new AccountServiceImpl();
		Customer customer=new Customer();
		customer.setCustName("Tom");
		
		acccountService.addAccount(customer, 100);
	}
	
	
	
	

}
