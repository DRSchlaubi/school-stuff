/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

/**
 *
 * @author MiRi217740
 */
public abstract class Employed {
    private final String firstName;
    private String lastName;
    private String address;
    private final int employeeId;

    public Employed(String firstName, String lastName, String address, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
