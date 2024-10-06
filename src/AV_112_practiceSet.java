//Problem 1------------------------------------------------------------

//package com.company;
//
///**
// * This is video number 112
// * <p>This is new line.....</p>
// * @author AV
// * @version 1.16
// * @since 2001
// * @see <a href="https://aplusinternational.in/" target="_blank">aplus_international</a>
// */
//
//public class AV_112_practiceSet {
//    /**
//     * Java Documentation
//     * @param a This is first number
//     * @param b This is second number
//     * @return This is sum of first and second number
//     */
//    public int sum(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        /**
//         * @param args These are arguments supplied to the command line
//         */
//        System.out.println("This is video number 112");
//    }
//}


package com.company;

import java.io.*;
import java.util.Scanner;

class myDeprecated{
    @Deprecated
    @SuppressWarnings("unchecked")     //use for ignore specific warnings
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class AV_112_practiceSet {
    public static void main(String[] args) throws IOException {

        //problem 2---------------------------
//        myDeprecated d = new myDeprecated();
//        d.meth1();


        //problem 4--------------------------------------------

//        MyInt i0 = new MyInt() {
//            @Override
//            public void display() {
//                System.out.println("I am display");
//            }
//        };
//        i0.display();
        //------------------OR--------------
        //lambda expressions
//        MyInt i1 = () -> System.out.println("I am display with lambda");
//        i1.display();


        //problem 5---------------------------------------------

//        int i = 19;
//        String table = "";
//        for (int j = 0; j < 10; j++){
//            table += i + " X " + (j+1) + " = " + i*(j+1);
//            table += "\n";
//        }
//        try {
//            FileWriter myFile = new FileWriter("MaltiplicationTable.txt");
//            myFile.write(table);
//            myFile.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }


//        int i = 3;
//        String table = "";
//        for (int j = 0; j < 10; j++){
//            table += i + " X " + (j+1) + " = " + i*(j+1);
//            table += "\n";
//        }
//        try {
//            FileWriter myFile = new FileWriter("MaltiplicationTable3.txt");
//            myFile.write(table);
//            myFile.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        //Read the file
//        File myFile1 = new File("MaltiplicationTable.txt");
//        try {
//            Scanner sc = new Scanner(myFile1);
//            while (sc.hasNextLine()){
//                String st = sc.nextLine();
//                System.out.println(st);
//            }
//        } catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        }




    }
}
