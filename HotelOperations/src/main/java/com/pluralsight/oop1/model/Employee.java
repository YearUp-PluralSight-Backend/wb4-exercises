package com.pluralsight.oop1.model;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Represents an employee in a company.
 */
public class Employee {

    private int id;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    /**
     * Default constructor.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor to initialize an employee with specific attributes.
     *
     * @param id the unique identifier for the employee
     * @param name the name of the employee
     * @param department the department the employee belongs to
     * @param payRate the pay rate of the employee
     * @param hoursWorked the number of hours worked by the employee
     */
    public Employee(int id, String name, String department, double payRate, float hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Gets the unique identifier for the employee.
     *
     * @return the employee ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the employee.
     *
     * @param id the employee ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the employee.
     *
     * @return the employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the employee name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the department the employee belongs to.
     *
     * @return the employee department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department the employee belongs to.
     *
     * @param department the employee department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the pay rate of the employee.
     *
     * @return the employee pay rate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * Sets the pay rate of the employee.
     *
     * @param payRate the employee pay rate
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     * Gets the number of hours worked by the employee.
     *
     * @return the hours worked
     */
    public float getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets the number of hours worked by the employee.
     *
     * @param hoursWorked the hours worked
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates the gross pay for the employee.
     *
     * @return the gross pay
     */
    public double getTotalPay() {

        return hoursWorked > 40 ? (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5) : hoursWorked * payRate;
    }


    public double getRegularPay() {
        return hoursWorked * payRate;
    }

    public double getOvertimePay() {
        return hoursWorked > 40 ? (hoursWorked - 40) * payRate * 1.5 : 0;
    }


    public double punchTimeCard(double startWork, double endWork) {
        return endWork - startWork;

    }

    public void punchTimeCard(LocalDateTime startWork, LocalDateTime endWork) {

        Duration duration = Duration.between(startWork, endWork);
        hoursWorked = (float) duration.toMinutes() / 60;

    }
}