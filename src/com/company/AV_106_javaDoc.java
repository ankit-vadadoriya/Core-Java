package com.company;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word <P>This is a new paragraph</P>
 * @author Ankit (CodeWithHarry)
 * @version 0.1
 * @since 2001
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class AV_106_javaDoc {
    public static void add(int a, int b){
        System.out.println("The sum is : " + (a+b));
    }
    public static void main(String[] args) {
        System.out.println("This is my main method");
        add(4,5);
    }
}
