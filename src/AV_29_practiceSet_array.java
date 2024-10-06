public class AV_29_practiceSet_array {
    public static void main(String[] args) {

        //(1).create array of 5 floats and calculate their sum

//        float [] array = {45.5f, 10.4f, 78.45f, 23.12f, 91.99f};
//        float sum=0;
//        for (int i=0; i<array.length; i++){
//            sum = sum + array[i];
//        }
//        System.out.println(sum);

        //----------OR----------

//        for (float result : array){
//            sum = sum + result;
//        }
//        System.out.println(sum);

        //(2).given int number is include in array or not

        int [] array = {45, 10, 78, 23, 91};
        int num=11;
        boolean isInArray = false;
        for (float element : array){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }else {
            System.out.println("The value is not present in the array");
        }

        //(3).calculate the average marks of student

//        float [] marks = {88, 95, 65, 78, 80, 91};
//        float sum=0;
//        float avg=0;
//        for (float result: marks){
//            sum = sum + result;
//            avg = sum/ marks.length;
//        }
//        System.out.println(avg);

        //(4).add two matraces of sign 2X3

//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                         {6, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                           {0, 0, 0}};
//        for (int i=0; i<mat1.length; i++){ // row number of time
//            for (int j=0; j<mat1[i].length; j++){  // column number of time
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //(5).reverce an array

//        String [] abc = {"a", "n", "k", "i", "t"};

//        for (int i= abc.length-1; i>=0; i--){
//            System.out.print(abc[i] + ", ");
//        }

        //-----------------OR---------------

//        int [] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//
//        int n = Math.floorDiv(l, 2);  //This line calculates the index of the middle element in the array
//        //-----or----
////        int n = l/2;

//        int temp;
//        for (int i=0; i<n; i++){
//            // swap arr[i] and arr[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int element : arr){
//            System.out.print(element + ", ");
//        }
//        //----------or----------
////        for (int i=0; i<l; i++){
////            System.out.print(arr[i] + ", ");
////        }

        //(6).find the maximum element in array

//        int [] arr = {1, 55, 87, 74, 23, 65, 101, 11};
////        int max=0;
//        //------or------
//        int max = Integer.MIN_VALUE;
//        for (int e : arr){
//            if (e>max){
//                max = e;
//            }
//        }
//        System.out.println("Maximum value in array is : " + max);

        //(7).find the minimun element in array

//        int [] arr = {1000, 8, 55, 87, 74, 23, 65, 101, 11};
//        int min = Integer.MAX_VALUE;
//        for (int e : arr){
//            if (e<min){
//                min = e;
//            }
//        }
//        System.out.println("Minimum value in array is : " + min);

        //(8).array is sorted or not

//        int [] arr = {1, 5, 58, 60, 99};
//        boolean isSorted = true;
//        for (int i=0; i<arr.length-1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("Array is sorted");
//        }else {
//            System.out.println("Array is not sorted");
//        }


    }
}
