/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttestpackage;

import bankaccountpackage.BankAccount;
import org.junit.*;

/**
 *
 * @author Stephen
 */
public class BankAccountTester {
    @Test
    public void testBankAccounrCreation(){
       BankAccount b = new BankAccount();
       
       Assert.assertNotNull(b);
    }

    @Test
    public void testNormalDeposit(){
         BankAccount b = new BankAccount();
         double initialBalance = b.getBalance();
        double amountToDeposit = 100;
        
        b.deposit(amountToDeposit);
        
        Assert.assertEquals(initialBalance + amountToDeposit, b.getBalance(), 0.01);
        
    }
   
}
