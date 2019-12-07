package com.collections.model;

import java.util.Objects;

// Every class in Java by default extends Object class.
// No need to mention it because compiler adds it anyway
public class Employee // extends Object
{

    private String employeeName;

    private Long employeeSalary;

    private Long employeeId;

    //    Parameterized Constructor
    public Employee(String employeeName, Long employeeSalary, Long employeeId) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

// Commenting this to make employee salary non readable. Only constructor can be used to set salary
//    public Long getEmployeeSalary() {
//        return employeeSalary;
//    }

    public void setEmployeeSalary(Long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    // Overriding the toString method of Super class Object.class
    // to print Employee fields rather than just hashcode
    // Go to Object class and see the method for yourself
    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeId=" + employeeId +
                '}';
    }

    // Overriding equals method from super class that is Object.class.
    // Go to Object class and see the method for yourself
    // equals method decide the equality of two objects of same class.
    //
    // Contract between hashCode() and equals()
    // It is generally necessary to override the hashCode() method whenever equals() method is overridden,
    // so as to maintain the general contract for the hashCode() method,
    // which states that equal objects must have equal hash codes.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmployeeName(), employee.getEmployeeName()) &&
                Objects.equals(employeeSalary, employee.employeeSalary); // &&
        // Objects.equals(getEmployeeId(), employee.getEmployeeId());
        // Commented employeeID above because employee ID will be unique all the time
    }

    // Overriding hashcode method from super class that is Object.class.
    // Go to Object class and see the method for yourself
    // Read the description on equals method. To make the hashcode equals, we'll have to override
    // hashcode method as well like below and use same fields that are used in equals.
    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeName(), employeeSalary
                //  , getEmployeeId()
                // Commented employeeID above because employee ID will be unique all the time
        );
    }

    // Uncomment below methods and comment the same methods above to make employee objects
    // equality based on their salaries but not all fields.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(employeeSalary, employee.employeeSalary);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(employeeSalary);
//    }
}
