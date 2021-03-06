/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import javax.persistence.Entity;

/**
 *
 * @author Paulo Gandra Sousa
 */
@Entity
public class IncomeType extends MovementType {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public IncomeType() {
        super();
    }

    public IncomeType(String key, String description) {
        super(key, description);
    }

    @Override
    public String toString() {
        return "Income Type: " + super.toString();
    }
}
