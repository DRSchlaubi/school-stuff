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
public class CompanyManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employed pleb = new Employee(new BigDecimal(100), "Ich nichts", "bekommen", "Da wo mein Haus wohnt", 1337);
        Employed boss = new BossDude(new BigDecimal("1000000000000000000000000000"),new BigDecimal("1000000000000000000000000000"),
                "Ich bin", "sehr gut", "Da sein Haus nicht wohnt", -1);
        
        System.out.println("Pleb salary: " + SalaryUtil.calculateSalary(pleb, new BigDecimal(220)));
        System.out.println("boss salary: " + SalaryUtil.calculateSalary(boss, new BigDecimal(220)));
    }
    
}
