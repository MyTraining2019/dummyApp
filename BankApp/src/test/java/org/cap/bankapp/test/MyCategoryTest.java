package org.cap.bankapp.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ BankAppTestCase.class, MyBankAppTestCaseSuite.class, ParameterizedTestCase.class })
@IncludeCategory({GoodTestCategory.class})
public class MyCategoryTest {

}
