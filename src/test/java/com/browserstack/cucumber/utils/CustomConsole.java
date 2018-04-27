package com.browserstack.cucumber.utils;

/**
 * Created by rahulk on 31/05/2017.
 */
public class CustomConsole {
    public static void print(String sClassName, String sMethodName){
        System.out.println("Processing: Class Name = " + sClassName + ", Method Name = " + sMethodName);
    }

    public static void printVerification(String sVerificationMessage) {
        System.out.println("!!!!!!!! VERIFICATION: " + sVerificationMessage + " !!!!!!!!");
    }

    public static void print(String sClassName, String sMethodName, String sVariable){
        System.out.println("Processing: Class Name = " + sClassName + ", Method Name = " + sMethodName + ", VALUE = " + sVariable);
    }
    public static void print(String sClassName, String sMethodName, int iVariable){
        System.out.println("Processing: Class Name = " + sClassName + ", Method Name = " + sMethodName + ", VALUE = " + iVariable);
    }
}
