
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
    
    public Employee() {
    }

    public Employee(String name, int yrWorked, boolean goodEmployee) {
	this.name = name;
	this.yrWorked = yrWorked;
	this.goodEmployee = goodEmployee;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setYrWorked(int yrWorked) {
	this.yrWorked = yrWorked;
    }

    public void setGoodEmployee(boolean goodEmployee) {
	this.goodEmployee = goodEmployee;
    }

    public int getYrWorked() {
	return yrWorked;
    }

    public boolean isGoodEmployee() {
	return goodEmployee;
    }

    public String getName() {
	return name;
    }
    
    
}
