package javaExercise.Ex08;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * read JSON file and print its content "readJson Test.json" *
 *
 */
public class ReadJsonFile {
    public static void main(String args[]){
        //Define the file path
        String filePath = "titan-test/src/main/java/javaExercise/readJsonTest.json";

        //Use BufferedReader to read the file
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder jsonContent = new StringBuilder();
            String line;

            //Read file line by line
            while ((line = br.readLine()) != null) {
                jsonContent.append(line).append("\n");
            }

            //Print the JSON content
            System.out.println("JSON File Content:");
            System.out.println(jsonContent.toString());

        } catch (IOException e) {
            // Handle exceptions
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}