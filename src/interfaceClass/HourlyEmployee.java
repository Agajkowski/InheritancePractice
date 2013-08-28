package interfaceClass;



public class HourlyEmployee implements Employee {

    private String name;
    private int yrWorked;
    private boolean goodEmployee;
    private double wage;

    public HourlyEmployee(String name, int yrWorked, boolean goodEmployee, double wage) {
	setName(name);
	setYearsWorked(yrWorked);
	setGoodEmployee(goodEmployee);
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

     @Override
    public final void setName(String name) {
	this.name = name;
    }

    @Override
    public final void setYearsWorked(int yrWorked) {
	this.yrWorked = yrWorked;
    }

    @Override
    public final void setGoodEmployee(boolean goodEmployee) {
	this.goodEmployee = goodEmployee;
    }

    @Override
    public int getYearsWorked() {
	return yrWorked;
    }

    @Override
    public boolean getGoodEmployee() {
	return goodEmployee;
	
    }

    @Override
    public String getName() {
	return name;
    }
}
