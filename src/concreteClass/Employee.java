package concreteClass;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Employee {

    private String name;
    private int yrWorked;
    private boolean goodEmployee;
    Scanner keyboard = new Scanner(System.in);

    public Employee(String name, int yrWorked, boolean goodEmployee) {
	setName(name); 
	setYearsWorked(yrWorked);
	setGoodEmployee(goodEmployee);
    }

    public final void setName(String name) { //prevents overrides in childs
	this.name = name;
    }

    public final void setYearsWorked(int yrWorked) { //prevents overrides in childs
	this.yrWorked = yrWorked;
    }

    public final void setGoodEmployee(boolean goodEmployee) { //prevents overrides in childs
	this.goodEmployee = goodEmployee;
    }

    public int getYearsWorked() {
	return yrWorked;
    }

    public boolean getGoodEmployee() {
	return goodEmployee;
    }

    public String getName() {
	return name;
    }
}
