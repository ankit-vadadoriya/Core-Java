//import java.util.*;
//
//public class AV_91_arraylist {
//    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Integer> l2 = new ArrayList<>(5);
//        l2.add(15);
//        l2.add(28);
//        l2.add(0,19);
//        l2.add(88);
//        l2.add(73);
//
//        l1.add(7);
//        l1.add(5);
//        l1.add(7);
//        l1.add(0,2);
//        l1.add(0,8);
//
//        l1.addAll(l2);
////        l1.addAll(2,l2);
////        l1.addFirst(8520);
//        //---------or-------------
////        l1.addAll(0,l2);     //first print l2 after print l1
//
////        l1.clear();    //clear all array object
////        l1.remove(1);
//        l1.set(6,999);   //change element at index 6
//        System.out.println(l1.contains(28));  //28 is included in array or not
//        System.out.print("IndexOf : ");
//        System.out.println(l1.indexOf(7));
//        System.out.print("lastIndexOf : ");
//        System.out.println(l1.lastIndexOf(7));
//
//
//        for (int i = 0; i < l1.size(); i++){
//            System.out.print(l1.get(i));
//            System.out.print(" ");
//        }
//
////        l1.clear();
//        System.out.println();
//        if (l1.isEmpty()){
//            System.out.println("List is empty!");
//        }
//        else {
//            System.out.println("List is not empty.");
//        }
//    }
//}


import java.util.*;

public class AV_91_arraylist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.addLast(15);
        l1.add(11);
        l1.addFirst(150);
        System.out.println("Index of 15 : " + l1.lastIndexOf(15));

        for (int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
