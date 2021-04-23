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
public class SalaryUtil {
    public static BigDecimal calculateSalary(Employed employed, BigDecimal workingDays) {
        if (employed instanceof Employee) {
            Employee employee = (Employee) employed;
            
            return employee.getHourlySalary().multiply(workingDays);
        } else if (employed instanceof BossDude) {
            BossDude boss = (BossDude) employed;
            return boss.getBonus().add(boss.getYearlySalary());
        } else {
            throw new IllegalArgumentException("Unexpected type: " + employed.getClass().getSimpleName());
        }
    }
}
