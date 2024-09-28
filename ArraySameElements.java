package javaExercise.Ex04;

import java.util.ArrayList;

//04. Write Java program that checks if two arrays contain the same elements.

/*
           Summary of steps that we are going to take.
           1. Take the second array and use it as a base as it contains the least number of elements.
           2. Use an enhanced for loop to take elements one at a time from the second array and compare to all items in first array and then last array.
           3. If there is a match, it would be added to an empty array list.
           4. To ensure no duplicate elements are added, do a check first before adding.
*/

public class ArraySameElements {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        //Creating and initializing an array list that will be used to house unique array items that are present in all arrays
        ArrayList<Integer> sameItems = new ArrayList<>();

        //Comparing items in array 2 to those in array 1 and array 3
        for(int num: a2) {
            for (int number : a1) {
                //System.out.println("Looking at " + num + " from array2.");
                //System.out.println("Looking at " + number + " from array1.");
                if (num == number) {
                    if (!sameItems.contains(number)) {
                        System.out.println("Adding " + number + " to the list of elements that are found in both arrays");
                        sameItems.add(number);

                    } else {
                        System.out.println("Will not be " + number + " to the list of elements as it has already been collected");
                    }

                }

            }
            for(int numb: a3){
                //System.out.println("Looking at " + numb + " from array3.");
                if(num == numb){
                    if (!sameItems.contains(numb)) {
                        System.out.println("Adding " + numb + " to the list of elements that are found in both arrays");
                        sameItems.add(numb);
                    } else {
                        System.out.println("Will not be " + numb + " to the list of elements as it has already been collected");
                    }
                }
            }
        }
        System.out.println("Similar items that exist in all three arrays are " + sameItems);
    }
}
