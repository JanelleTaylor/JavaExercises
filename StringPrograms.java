package javaExercise.Ex01;

//How do you reverse a string in Java?

public class StringPrograms {
    public static void main(String[] args) {
        String str = "123";
        /*
            Solution
            Summary of what steps will be taken to achieve reversing the string
            1. Create a new empty string to hold the newly reverse string.
            2. Use a for loop, to loop through each character in the string and re-assign that character to new string.
            3. Print newly reversed string.
        */

        //Creating new empty string to hold reversed string.
        String newStr = "";

        /*
            Variable to get the last position number of the string. Since position starts at zero (0), to get the
            last position it will be length of the string minus one (1).
         */
        int lastCharPos = str.length() - 1;
        System.out.println("This is the position of the last character in the string before going into the loop " + lastCharPos);

        //Creating a for loop to cycle through each character
        for (int i = lastCharPos; i >= 0; i--){
            System.out.print("At position " + i + " from the original string");
            newStr = newStr + str.charAt(i);
            System.out.print(" we are getting character " + str.charAt(i) + " and adding it to reserved string.");
            System.out.println(" ");
        }
        System.out.println("Old string was " + str + " and reverse string is " + newStr);
    }
}