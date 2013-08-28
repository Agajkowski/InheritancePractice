package concreteClass;

public class HourlyEmployee extends Employee {

    private double wage;

    public HourlyEmployee(String name, int yrWorked, boolean goodEmployee, double wage) {
	super(name, yrWorked, goodEmployee);
	setWage(wage);
    }

    public String getHourWageFormatted() {
	return "$" + wage;
    }

    public double getWageRaw() {
	return wage;
    }
    
    

    public final void setWage(double wage) { 
	this.wage = wage;
    }
}
