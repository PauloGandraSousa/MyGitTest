/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.CheckingAccount;
import eapli.expensemanager.model.SavingDeposit;
import eapli.expensemanager.model.SavingGoal;
import eapli.expensemanager.model.SavingPlan;
import eapli.expensemanager.model.SavingWithdraw;
import eapli.expensemanager.persistence.CheckingAccountRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import eapli.expensemanager.persistence.SavingPlanRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author AJS
 */
public class RegisterSavingWithdrawController extends BaseController
{
    

    public RegisterSavingWithdrawController() 
    {
    }

    public void registerSavingWithdraw(SavingGoal goal, Date date, BigDecimal amount, String description) 
    {
            SavingPlanRepository savingPlanRepository = PersistenceFactory.buildPersistenceFactory().savingPlanRepository();
            SavingPlan savingPlan = savingPlanRepository.theSavingPlan(); 

        //falta testar se o saldo é suficiente para resgatar    
        //if(savingPlan.)
        
       if(goal.enoughSavings(amount))
       {
            
        CheckingAccountRepository checkingAccountRepository = PersistenceFactory.buildPersistenceFactory().checkingAccountRepository();
        CheckingAccount checkingAccount = checkingAccountRepository.theAccount(); 
            
            SavingWithdraw savingWithdraw = new SavingWithdraw(description, date, amount);
            
        
            savingPlan.registerSavingWithdraw(savingWithdraw,goal);
            checkingAccount.registerSavingWithdraw(savingWithdraw);
                        
            savingPlanRepository.save(savingPlan);
            checkingAccountRepository.save(checkingAccount);
       }
    }

    public List<SavingGoal> getSavingGoals() 
    {
        return new ListSavingGoalsController().getSavingGoals();
    } 
}


