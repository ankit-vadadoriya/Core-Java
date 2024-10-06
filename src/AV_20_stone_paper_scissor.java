import java.util.Scanner;
import java.util.Random;

public class AV_20_stone_paper_scissor {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter 1 for Stone, 2 for Paper, 3 for Scissor");
        int a = av.nextInt();
        if(a==1){
            System.out.println("You have picked stone");
        }
        if(a==2){
            System.out.println("You have picked paper");
        }
        if(a==3){
            System.out.println("You have picked scissor");
        }

        Random ran = new Random();
        int b = ran.nextInt(1,4);
        if(b==1){
            System.out.println("PC has picked stone");
        }
        if(b==2){
            System.out.println("PC has picked paper");
        }
        if(b==3){
            System.out.println("Pc has picked scissor");
        }

        if (a==1 & b==1){
            System.out.println("The game is draw!");
        }
        if (a==1 & b==2){
            System.out.println("PC is the winner!");
        }
        if (a==1 & b==3){
            System.out.println("You are the winner!");
        }
        if (a==2 & b==1){
            System.out.println("You are the winner!");
        }
        if (a==2 & b==2){
            System.out.println("The game is draw!");
        }
        if (a==2 & b==3){
            System.out.println("PC is the winner!");
        }
        if (a==3 & b==1){
            System.out.println("PC is the winner!");
        }
        if (a==3 & b==2){
            System.out.println("You are the winner!");
        }
        if (a==3 & b==3){
            System.out.println("The game is draw!");
        }

        //-------------------------------OR-------------------------------

//        Random comp = new Random();
//        Scanner scan = new Scanner(System.in);
//        int w = 0 , l = 0, d = 0 ;
//        for (int a = 0; a < 3; a++) {
//            System.out.println("Enter 1, 2 or 3 respectively for rock, paper, and scissors");
//            int i = scan.nextInt();
//            int j = comp.nextInt(3) + 1;
//            System.out.println("The computer choice = " + j);
//            if (i == j) {
//                System.out.println("Its a draw !"); d++;
//            } else if (j == 1) {
//                switch (i) {
//                    case 2 -> {
//                        System.out.println("YOU WON"); w++;
//                    }
//                    case 3 -> {
//                        System.out.println("YOU LOST"); l++;
//                    }
//                }
//            } else if (j == 2) {
//                switch (i) {
//                    case 3 -> {
//                        System.out.println("YOU WON"); w++;
//                    }
//                    case 1 -> {
//                        System.out.println("YOU LOST"); l++;
//                    }
//                }
//            } else if (j == 3) {
//                switch (i) {
//                    case 1 -> {
//                        System.out.println("YOU WON") ; w++;
//                    }
//                    case 2 -> {
//                        System.out.println("YOU LOST"); l++;
//                    }
//                }
//            }
//        }
//        System.out.println("Total wins = " +w +" Total loses = " +l +" Total draws = " +d);
//        if (w>l) {
//            System.out.print("OVERALL YOU WON !!");
//        }
//        else if (w<l) {
//            System.out.print("OVERALL YOU LOST ");
//        }


    }
}
