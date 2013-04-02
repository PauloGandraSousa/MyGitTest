/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.persistence.ExpenseRepository;
import eapli.expensemanager.persistence.PersistenceRegistry;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ListExpensesController extends BaseController {

    public List<Expense> getExpenses() {
        ExpenseRepository repo = PersistenceRegistry.instance().expenseRepository();
        return repo.all();
    }    
}