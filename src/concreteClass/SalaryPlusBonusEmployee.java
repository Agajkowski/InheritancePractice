/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteClass;

public class SalaryPlusBonusEmployee extends SalaryEmployee {

    private int bonus;

    public SalaryPlusBonusEmployee(String name, int yrWorked, boolean goodEmployee, int income, int bonus) {
	super(name, yrWorked, goodEmployee, income);
	setBonus(bonus);
    }

    public int getBonus() {
	return bonus;
    }

    public final void setBonus(int bonus) {
	this.bonus = bonus;
    }
    
    
}
