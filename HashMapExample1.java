package javaExercise.Ex06;
import java.util.HashMap;
import java.util.Map;

/** HasMap Example
 - Create a Hashmap for Countries and their Capitals
 - Ex: - USA - Washington, CANADA - OTTAWA, INDIA - DELHI, CHINA - BEIJING, FRANCE PARISE, ITALLY - ROME, JAPAN - TOKYO
 - Print them in loop
 - Remove Country starting with "C" from list and print them.
*/
public class HashMapExample1 {

    public static void main(String args[]) {
        //creating a hashmap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Canada", "Ottawa");
        capitalCities.put("India", "Delhi");
        capitalCities.put("China", "Beijing");
        capitalCities.put("France", "Paris");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Japan", "Tokyo");

        //Looping through the hashmap and printing contents
        System.out.println("Original Country-Capital Map:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        //Creating a newHashmap
        HashMap<String, String> newCapitalCities = new HashMap<String, String>();

        //Finding countries that begin with letter C, skipping over them and adding the others to the new hashmap
        for (String capital : capitalCities.keySet()) {
            if(capital.startsWith("C")){
                System.out.println("Removing " + capital + " as it begins with the letter C.");
            }
            else{
                newCapitalCities.put(capital, capitalCities.get(capital));
            }
        }

        //Printing out the new hashmap minus the countries beginning with the letter C
        System.out.println("\nUpdated Country-Capital Map (after removing countries starting with 'C'):");
        for (Map.Entry<String, String> entry : newCapitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}