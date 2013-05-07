/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author losa
 */
@Entity
public class SavingsPlan implements Serializable
{

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date InicialDate;
    @OneToMany(cascade = CascadeType.ALL)
    private List<SavingGoal> listSavingGoal;

    public SavingsPlan()
    {
        listSavingGoal = new ArrayList<SavingGoal>();
    }

    public SavingsPlan(Date d)
    {
        InicialDate = d;
    }

    public SavingGoal registerSavingGoal(SavingGoal savingGoal)
    {
        listSavingGoal.add(savingGoal);
        return savingGoal;
    }

    
    // fixme: modificado AJS -- isto deveria trabalhar com indices da lista e não com objectivos 
    // propriamente ditos
    public void registerSavingDeposit(SavingDeposit s, SavingGoal goal1)
    {
        goal1.registerSavingDeposit(s);
    }

    public void registerSavingWithdraw(SavingDeposit s, SavingGoal goal1)
    {
        goal1.registerSavingDeposit(s);
    }
}
