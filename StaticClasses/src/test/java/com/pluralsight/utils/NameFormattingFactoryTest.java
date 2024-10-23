package com.pluralsight.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFormattingFactoryTest {

    String prefix;
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    @BeforeEach
    @DisplayName("Set up data")
    void setUp() {

        prefix = "Mr";
        firstName = "Yiming";
        middleName = "Harry";
        lastName = "Gao";
        suffix = "PhD";

    }

    @Test
    @DisplayName("Testing formatName method with one argument (fullName) ")
    void formatNameFullName() {
        String fullName = firstName + " " + lastName;

        String actual = NameFormattingFactory.formatName(fullName);
        String excepted = firstName + ", " + lastName;

        assertEquals(excepted, actual);
    }

    @Test
    @DisplayName("Testing formatName method with one argument (first and last name) ")
    void testFormatNameWithFirstAndLastName() {

        String actual = NameFormattingFactory.formatName(firstName, lastName);
        String excepted = firstName + ", " + lastName;

        assertEquals(actual, excepted);

    }

    @Test
    @DisplayName("Testing formatName method with one argument (four parameters) ")
    void testFormatNameWithFourParameters() {
//  String firstName, String middleName, String lastName, String suffix
        String actual = NameFormattingFactory.formatName(firstName, middleName, lastName, suffix);
        String expected = new StringBuilder(lastName).append(", ").append(firstName).append(" ").append(middleName).append(", ").append(suffix).toString();

        assertEquals(actual, expected);

    }

    @Test
    @DisplayName("Testing formatName method with one argument (five parameters) ")
    void testFormatNameWithFiveParameters() {
//  String prefix, String firstName, String middleName, String lastName, String suffix
        String actual = NameFormattingFactory.formatName(prefix, firstName, middleName, lastName, suffix);
        String expected = new StringBuilder(lastName).append(", ").append(prefix).append(" ").append(firstName).append(" ").append(middleName).append(", ").append(suffix).toString();

        assertEquals(actual, expected);

    }
}