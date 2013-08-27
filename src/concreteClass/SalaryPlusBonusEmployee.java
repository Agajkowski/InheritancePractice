/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteClass;


public class SalaryPlusBonusEmployee extends SalaryEmployee {

    private int bonus;
    
    public SalaryPlusBonusEmployee() {
	
    }
    
    public SalaryPlusBonusEmployee(int bonus){
	this.bonus = bonus;
    }

    public int getBonus() {
	return bonus;
    }

    
}
