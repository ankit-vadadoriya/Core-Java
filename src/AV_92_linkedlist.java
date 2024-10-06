import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

        public class AV_92_linkedlist {
            public static void main(String[] args) {
                LinkedList<Integer> l1 = new LinkedList<>();
                LinkedList<Integer> l2 = new LinkedList<>();
                l2.add(15);
                l2.add(28);
//                l2.add(0,19);
                l2.add(88);
                l2.add(73);

                l1.add(7);
                l1.add(5);
                l1.add(2);
//                l1.add(0,2);
//                l1.add(0,8);

//                l1.addFirst(99);
//                l1.addLast(50);
//                l1.offer(555);  //add element

                l1.addAll(l2);
                //---------or-------------
//        l1.addAll(0,l2);     //first print l2 after print l1

//        l1.clear();    /clear all array object
//        l1.remove(1);
                l1.set(4,999);  //change element at index 5
                System.out.println(l1.contains(28));  //28 is included in array or not
                System.out.print("IndexOf : ");
                System.out.println(l1.indexOf(7));
                System.out.print("lastIndexOf : ");
                System.out.println(l1.lastIndexOf(7));

                System.out.println("linkedlist : " + l1);

                System.out.print("l1(for loop) : ");
                for (int i = 0; i < l1.size(); i++){
                    System.out.print(l1.get(i));
                    System.out.print(" ");
                }

//        l1.clear();
                System.out.println();
                if (l1.isEmpty()){
                    System.out.println("List is empty!");
                }
                else {
                    System.out.println("List is not empty.");
                }
            }
        }