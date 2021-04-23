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
public class BossDude extends Employed {
    
    
    private BigDecimal yearlySalary;
    private BigDecimal bonus;
    
    public BossDude(BigDecimal yearlySalary, BigDecimal bonus, String firstName, String lastName, String address, int employeeId) {
        super(firstName, lastName, address, employeeId);
        this.yearlySalary = yearlySalary;
        this.bonus = bonus;
    }

    public BigDecimal getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(BigDecimal yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
