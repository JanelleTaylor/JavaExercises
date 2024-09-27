package javaExercise.Ex04;

import org.noggit.JSONUtil;

import java.util.ArrayList;

//04. Write Java program that checks if two arrays contain the same elements.

/*
           Summary of steps that we are going to take.
           1. Take the first array and use it as a base.
           2. Loop through the elements in the first and compare to the items in the second and third array elements.
           3. Take the third array and set it as a base.
           4. Loop through the elements in the second and compare to items against the third array.
*/
public class ArraySameElements {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        //Finding the lengths of the respective array
        int lengthArray1 = a1.length;
        int lengthArray2 = a2.length;
        int lengthArray3 = a3.length;

        //Initializing integer variables for individual array items
        int arrayItem1, arrayItem2, arrayItem3;

        //Creating and initializing an array list that will be used to house unique array items that are present in all arrays
        ArrayList<Integer> sameItems = new ArrayList<Integer>();

        //Comparing items in array 1 to those in array 2 and 3
        for(int i = 0; i < lengthArray1; i++){
            arrayItem1 = a1[i];
            System.out.print("This is the value " + arrayItem1 + " array item at position " + i);
            for(int j=0; j < lengthArray2; j++){
                if (arrayItem1 == a2[j]){
                    System.out.println("");
                    //System.out.print(a2[j]);
                    //System.out.println("... Yes");
                    if(!sameItems.contains(a2[j])){
                        System.out.println("Adding " + a2[j] + " to the list of elements that are found in both arrays");
                        sameItems.add(a2[j]);
                    }
                    else{
                        System.out.println("Will not be " + a2[j] + " to the list of elements as it has already been collected");
                    }
                    //break;
                }
                else{
                    System.out.println("");
                    System.out.print(a2[j]);
                    System.out.println("... No");

                }
            }
            for(int k=0; k < lengthArray3; k++){
                if (arrayItem1 == a3[k]){
                    //System.out.println("");
                    //System.out.print(a3[k]);
                    //System.out.println("... Yes");
                    //break;
                    if(!sameItems.contains(a3[k])){
                        System.out.println("Adding " + a3[k] + " to the list of elements that are found in both arrays");
                        sameItems.add(a3[k]);
                    }
                    else{
                        System.out.println("Will not be " + a3[k] + " to the list of elements as it has already been collected");
                    }
                }
                else{
                    System.out.println("");
                    System.out.print(a3[k]);
                    System.out.println("... No");
                }
            }
        }
        System.out.println(sameItems);
    }
}
