package abstractClass;

public class SalaryEmployee extends Employee {

    private int income;

    public SalaryEmployee(String name, int yrWorked, boolean goodEmployee, int income) {
	super(name, yrWorked, goodEmployee);
	changeIncome(income);
    }

    public String getSalIncome() {
	return "$" + income;
    }

    public void changeIncome(int income) {
	this.income = income;
    }

    @Override
    public double getYearlyIncome() {
	return income;
    }
}
