package com.pluralsight;

import com.pluralsight.oop1.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
            System.out.println(expected == salary);
            assertEquals(expected, salary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
