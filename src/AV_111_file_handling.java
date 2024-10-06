import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AV_111_file_handling {
    public static void main(String[] args) {

        //code to create a new file
//        File myFile = new File("av11.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e){
//            System.out.println("Unable to create this file");
////            throw new RuntimeException(e);
//            e.printStackTrace();
//        }

        //code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("av11.txt");
            fileWriter.write("This is a first file from this java course \nOkay now bye!");
            fileWriter.write("\n");
            fileWriter.write("This is a...bye!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading File
        File myFile = new File("av11.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Delete file
//        File myFile = new File("av11.txt");
//        if (myFile.delete()){
//            System.out.println("I have deleted : " + myFile.getName());
//        }
//        else {
//            System.out.println("Some problem occured while deleting a file");
//        }

    }
}
