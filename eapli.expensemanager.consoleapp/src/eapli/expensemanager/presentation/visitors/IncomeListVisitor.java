/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation.visitors;

import eapli.expensemanager.model.Income;
import eapli.framework.visitor.Visitor;
import eapli.util.DateTime;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class IncomeListVisitor implements Visitor<Income> {

	public IncomeListVisitor() {
	}

	@Override
	public void visit(Income visited) {
		System.out.print(DateTime.format(visited.getOccurred()) + " ");
		System.out.print(visited.getAmount() + " ");
		System.out.println(visited.getDescription());
	}

	@Override
	public void beforeVisiting(Income visited) {
		// nothing to do
	}

	@Override
	public void afterVisiting(Income visited) {
		// nothing to do
	}
}
