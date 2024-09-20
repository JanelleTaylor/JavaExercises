package javaExercise.Ex03;

//3. Write a Java program to check if a vowel is present in a string.
public class StringContainsVowels {
    public static void main(String[] args) {
        String input01 = "Hello";
        String input02 = "Tv";

        /*
            Summary of steps that we are going to take.
            1. Find the length of each string and assign to variables.
            2. Use a for loop over the characters in the string.
            3. If a character at the particular position is found it will be added to a counter.
        */
        int strOneLength = input01.length();
        int strTwoLength = input02.length();

        // Initializing a global counter to be used.
        int counterA = 0;
        int counterB = 0;

        //Counting number of vowels in Sting 1 (input01)
        for(int i = 0; i < strOneLength; i++){
            if(input01.charAt(i) == 'a' || input01.charAt(i) == 'e' || input01.charAt(i) == 'i' || input01.charAt(i) == 'o' || input01.charAt(i) == 'u'){
                counterA += 1;
                System.out.println("At position " + i + " there is an " + input01.charAt(i));
            }
        }

        if (counterA > 0)
            System.out.println(input01 + " contains " + counterA + " vowels.");
        else
            System.out.println(input01 + " does not contain any vowels.");

        //Counting number of vowels in Sting 2 (input02)
        for(int i = 0; i < strTwoLength; i++){
            if(input02.charAt(i) == 'a' || input02.charAt(i) == 'e' || input02.charAt(i) == 'i' || input02.charAt(i) == 'o' || input02.charAt(i) == 'u'){
                counterB += 1;
                System.out.println("At position " + i + " there is an " + input02.charAt(i));
            }
        }

        if (counterB > 0)
            System.out.println(input02 + " contains " + counterB + " vowels.");
        else
            System.out.println(input02 + " does not contain any vowels.");
    }
    //vowels are a, e, i, o, and u

    //Code here


}
