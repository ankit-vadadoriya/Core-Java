import java.util.Random;
import java.util.Scanner;

class randomNumber{
    private int randomNo;
    private int noOfGuesses;
    public randomNumber(int n){
        randomNo = n;
    }
    public int getRandom(){
        return randomNo;
    }
}

public class AV_43_exercise3 {
    public static void main(String[] args) {
        /*
        Create a class game, which allows a user to play "guess the number"
        game once. game should have the following methods:
        1. constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        use properties such as noOfGuesses(int), etc to ger this task done!
         */

        Random rn = new Random();
        int rNumber = rn.nextInt(0,101);
        randomNumber random = new randomNumber(rNumber); //create object
//        System.out.println("random number : " + random.getRandom());

        Scanner av = new Scanner(System.in);

        int noOfGuesses = 0;

        while (true){
            System.out.print("User Input : ");
            int userInput = av.nextInt();
            noOfGuesses++;

            if (userInput == rNumber){
                System.out.println("Congratulations! You guessed the number in " + noOfGuesses + " tries.");
                break;
            }
            else if (userInput < rNumber){
                System.out.println("You guess is too low, try again!");
            }
            else {
                System.out.println("You guess is too high, try again!");
            }
        }



    }
}

