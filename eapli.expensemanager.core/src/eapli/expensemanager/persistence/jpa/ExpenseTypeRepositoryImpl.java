/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence.jpa;

import eapli.framework.persistence.jpa.JpaRepository;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.persistence.ExpenseTypeRepository;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseTypeRepositoryImpl extends JpaRepository<ExpenseType, String> implements ExpenseTypeRepository {
}
