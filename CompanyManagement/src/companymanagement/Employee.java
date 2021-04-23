/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import java.math.BigDecimal;

/**
 *
 * @author MiRi217740
 */
public class Employee extends Employed {
    
    private BigDecimal hourlySalary;
    
    public Employee(BigDecimal hourlySalary, String firstName, String lastName, String address, int employeeId) {
        super(firstName, lastName, address, employeeId);
        this.hourlySalary = hourlySalary;
    }

    public BigDecimal getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(BigDecimal hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
