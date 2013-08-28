/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceClass;

/**
 *
 * @author alex
 */
public interface Employee {

    public void setName(String name);

    public void setYearsWorked(int yrWorked);

    public void setGoodEmployee(boolean goodEmployee);

    public int getYearsWorked();

    public boolean getGoodEmployee();

    public String getName();
}
