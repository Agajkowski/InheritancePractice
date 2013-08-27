
package concreteClass;


public class HourlyEmployee extends Employee {
    
    private double wage;

    public HourlyEmployee() {
	
    }

    public HourlyEmployee(String name, int yrWorked, boolean goodEmployee) {
	super(name, yrWorked, goodEmployee);
	System.out.println("enter the hourly wage of the employee.");
	wage = keyboard.nextDouble();
    }

    public String getHrWage() {
	return "$" + wage;
    }

    public void setWage(double wage) {
	this.wage = wage;
    }
    
    
}
