package javaExercise.Ex07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Read a "readMeTest.txt" file from resources
 * Print All
 * Filter entries starting with 'UNITED' and Print *
 */
public class ReadTxtFile {

    public static void main(String args[]){

        try{
            File myFile = new File("titan-test/src/main/java/javaExercise/readMeTest.txt");

            //Using the scanner class to read a file's contents and print it out
            Scanner myReader1 = new Scanner(myFile);
            System.out.println("The contents of the file are as follows: ");
            while(myReader1.hasNextLine()){
                String data1 = myReader1.nextLine();
                System.out.println(data1);
            }
            myReader1.close();

            //Using the scanner class to read a file's contents and filter out specific entries
            Scanner myReader2 = new Scanner(myFile);
            System.out.println('\n' + "The filter contents of the file are as follows");
            while(myReader2.hasNextLine()){
                String data2 = myReader2.nextLine();
                if(data2.startsWith("United")){
                    continue;
                }
                else{
                    System.out.println(data2);
                }
            }
            myReader2.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file you requested is invalid");
        }
    }
}
