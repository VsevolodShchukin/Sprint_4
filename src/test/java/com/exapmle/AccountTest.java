package com.exapmle;

import com.example.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String accountName;
    private final Boolean expectedResult;

    public AccountTest(String accountName, Boolean expectedResult) {
        this.accountName = accountName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Te", false},
                {"T e", true},
                {"Test testtesttesttes", false},
                {"Test testtesttestte", true},
                {"Test  t", false},
                {" test", false},
                {"test ", false}
        };
    }

    //в строке не меньше 3 и не больше 19 символов,
    //в строке есть только один пробел,
    //пробел стоит не в начале и не в конце строки.

    @Test
    public void accountParametersTest() {
        Account accountForTest = new Account(accountName);
        Assert.assertEquals(accountForTest.checkNameToEmboss(), expectedResult);

    }

}
