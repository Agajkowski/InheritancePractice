/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author alex
 */
public class Main {

    public static void main(String[] args) {

	HourlyEmployee steve = new HourlyEmployee("Steve", 2, true, 9.50, 554);
	SalaryEmployee alex = new SalaryEmployee("Alex", 1, true, 30000);
	SalaryPlusBonusEmployee kevin = new SalaryPlusBonusEmployee("Kevin", 7, false, 70000, 500);

	System.out.println("Abstract Version");
	System.out.println(steve.getName() + "\n" + steve.getYearsWorked() + "\n" + steve.getGoodEmployee() + "\n" + steve.getHourWageFormatted() + "\n" + steve.getYearlyIncome());
	System.out.println(alex.getName() + "\n" + alex.getSalIncome() + "\n" + alex.getYearlyIncome());
	System.out.println(kevin.getName() + "\n" + kevin.getSalIncome() + "\n" + kevin.getBonus() + "\n" + kevin.getYearlyIncome());

    }
}
