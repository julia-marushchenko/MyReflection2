/**
 *  Java program to demonstrate reflection.
 */

package com.myreflection;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {


        try {
            // Creating an object of class.
            Main m = new Main();

            // Defining a string with path and name to class we are trying to access.
            String className = "com.myreflection.Main";

            // Checking class of the object.
            System.out.println("Class of the object: " + m.getClass());

            // Creating new instance of a class Main.
            Class testClass = Class.forName(className);

            // Printing name of new class.
            System.out.println("New class is: " + testClass.getName());

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

    }
}