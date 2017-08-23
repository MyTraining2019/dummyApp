package org.cap.bankapp.test;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoTest {

	private AcccountService accountService;
	
	@Mock
	private AccountDao accountDao;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		accountService=new AccountServiceImpl(accountDao);
	}
	
	
	@Test
	public void test_addAccount_with_proxyObject() throws InvalidInitialAmountException {
		
		Account account=new Account();
		
		Customer customer=new Customer();
		customer.setCustName("Jerry");
		
		Address address=new Address();
		customer.setCustAddress(address);
		account.setCustomer(customer);
		account.setAmount(3000);
		
		
		//Declaration
		Mockito.when(accountDao.createAccount(account))
					.thenReturn(true);
		
		//Actual Logic
		Account account_ret=accountService.addAccount(customer, 3000);
		
		
		//Verify
		Mockito.verify(accountDao).createAccount(account);
		
		
	}

}
