package org.cap.bankapp.test;

import static org.junit.Assert.*;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;

public class MyTestCase {
	
	private AcccountService accountService=new AccountServiceImpl();

	@Test(timeout=300)
	public void test_myLoop() {
		accountService.myLoop();
	}

}
