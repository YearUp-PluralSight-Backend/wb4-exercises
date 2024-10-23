package com.pluralsight.utils;

import java.util.Arrays;

public class NameFormattingFactory {

    // Prefix FirstName MiddleName LastName, Suffix
    // Dr. Mel B Johnson, PhD
    // Mel B Johnson, PhD
    // Mel Johnson

    /**
     * formatting the name based on these parameters
     * @param prefix s
     * @param firstName s
     * @param middleName s
     * @param lastName s
     * @param suffix s
     * @return combine all the parameters.
     */
    public static String formatName(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return new StringBuilder(lastName).append(", ").append(prefix).append(" ").append(firstName).append(" ").append(middleName).append(", ").append(suffix).toString();
    }

    /**
     * split the name with a white space.
     * @param fullName s
     * @return String name
     */
    public static String formatName(String fullName) {
        return  fullName.replace(" ", ", ");
//        return new StringBuilder(firstName).append(" ").append(lastName).toString();
    }


    /**
     * formatting the name based on first and last name
     * @param firstName s
     * @param lastName s
     * @return String the first name and last name
     */
    public static String formatName(String firstName, String lastName) {
        return new StringBuilder(firstName).append(", ").append(lastName).toString();
    }


    public static String formatName( String firstName, String middleName, String lastName, String suffix) {
        return new StringBuilder(lastName).append(", ").append(firstName).append(" ").append(middleName).append(", ").append(suffix).toString();
    }



}
