package interfaceClass;



public class SalaryEmployee implements Employee {

    private String name;
    private int yrWorked;
    private boolean goodEmployee;
    private int income;

    public SalaryEmployee(String name, int yrWorked, boolean goodEmployee, int income) {
	setName(name);
	setYearsWorked(yrWorked);
	setGoodEmployee(goodEmployee);
	changeIncome(income);
	
    }

    public String getSalIncome() {
	return "$" + income;
    }

    public final void changeIncome(int income) {
	this.income = income;
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
