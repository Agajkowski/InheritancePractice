package concreteClass;

public class SalaryEmployee extends Employee {

    private int income;

    public SalaryEmployee(String name, int yrWorked, boolean goodEmployee, int income) {
	super(name, yrWorked, goodEmployee);
	this.income = income;
    }

    public String getSalIncome() {
	return "$" + income;
    }

    public void changeIncome(int income) {
	this.income = income;
    }
}
