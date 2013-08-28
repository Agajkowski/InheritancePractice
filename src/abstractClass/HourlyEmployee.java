package abstractClass;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hoursYearly;

    public HourlyEmployee(String name, int yrWorked, boolean goodEmployee, double wage, double hours) {
	super(name, yrWorked, goodEmployee);
	setWage(wage);
	setHours(hours);
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

    public double getHours() {
	return hoursYearly;
    }

    public void setHours(double hours) {
	this.hoursYearly = hours;
    }

    
    @Override
    public double getYearlyIncome() {
	 return hoursYearly * wage;
    }
}
