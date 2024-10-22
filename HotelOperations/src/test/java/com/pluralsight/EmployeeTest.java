package com.pluralsight;

import com.pluralsight.oop1.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {



    @Test
    @DisplayName("Testing the employee class")
    public void testOne() {

        /**
         *     private int id;
         *     private String name;
         *     private String department;
         *     private double payRate;
         *     private int hoursWorked;
         */

        Employee employee = new Employee(1, "John", "Sales", 10, 45);
        try {
            double expected = 40 * 10 + (5 * 10 * 1.5);
            double salary = employee.getTotalPay();
            System.out.println();
            System.out.println(expected == salary);
            assertEquals(expected, salary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    @DisplayName("Testing the employee class method: punchTimeCard")
    public void testTwo() {

        /**
         *     private int id;
         *     private String name;
         *     private String department;
         *     private double payRate;
         *     private int hoursWorked;
         */

        Employee employee = new Employee(1, "John", "Sales", 10, 45);
        LocalDateTime startWork = LocalDateTime.now();
        LocalDateTime endWork = LocalDateTime.now().plusHours(6).plusMinutes(30);

        try {
            employee.punchTimeCard(startWork,endWork);
            double expected = 10 * 6.5;
            double salary = employee.getTotalPay();
            System.out.println();
            System.out.println(expected == salary);
            assertEquals(expected, salary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
