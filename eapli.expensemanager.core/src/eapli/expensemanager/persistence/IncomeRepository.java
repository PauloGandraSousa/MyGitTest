/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;

import eapli.expensemanager.model.Income;
import java.util.List;

/**
 * deprecated when the concept of checkingAccount was introduced
 *
 * @author Paulo Gandra Sousa
 */
@Deprecated
public interface IncomeRepository {

    Income save(Income income);

    List<Income> all();
}
