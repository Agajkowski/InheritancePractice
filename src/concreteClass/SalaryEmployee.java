
package concreteClass;


public class SalaryEmployee extends Employee {
    
    private int income;
    
    
    public SalaryEmployee() {
    }

    public SalaryEmployee(String name, int yrWorked, boolean goodEmployee) {
	super(name, yrWorked, goodEmployee);
	System.out.println("enter the salaried income of the employee.");
	income = keyboard.nextInt();
    }

    public String getSalIncome() {
	return "$" + income;
    }

    public void changeIncome(int income) {
	this.income = income;
    }
    
    
    
    
}
