public class AV_26_arrays {
    public static void main(String[] args) {

        /*classroom of 500 students - have to store marks of all students
        you have 2 option :
        1. Create 500 variables
        2. Use arrays
        */

//        int [] marks = new int[5];
//        ---------OR--------
        int [] marks;
        marks = new int[5];

        marks[0] = 92;
        marks[1] = 88;
        marks[2] = 65;
        marks[3] = 90;
        marks[4] = 97;
        System.out.println(marks[4]);

//        ------------OR-----------

        int [] array = {90,65,98,74,80};
        System.out.println(array[1]);

    }
}
