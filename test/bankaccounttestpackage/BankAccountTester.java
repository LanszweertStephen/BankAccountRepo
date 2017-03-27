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
    
    public void testBankAccounrCreation(){
       BankAccount b = new BankAccount();
       
       Assert.assertNotNull(b);
    }


   
}
