package javaExercise.Ex02;

//2. How do you swap two numbers without using a third variable in Java?
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + " and b is " + b);
        /*
            First we will add the values of "b" and "a" together and re-assign that value to "b"
            Then we will assign "a" a new value of "b" minus "a"
            Finally we will assign "b" a new value of "b" minus "a"
        */
        System.out.println("This is Solution 1 using simple addition and subtraction calculations.");

        b =  b + a;
        System.out.println("The new value of b is " + b);

        a = b - a;
        System.out.println("The new value of a " + a);

        b = b - a;
        System.out.println("The new value of b is " + b);

        System.out.println("After swapping, a is " + a + " and b is " + b);

        /*
            First we will multiply the values of "b" and "a" and re-assign that value to "b"
            Then we will assign "b" a new value of "a" divided "b"
            Finally we will assign "b" a new value of "a" divided "b"
        */
        /* System.out.println("This is Solution 2 using multiplication and division");

        a =  a * b;
        System.out.println("The new value of b is " + a);

        b = a / b;
        System.out.println("The new value of a " + b);

        a = a / b;
        System.out.println("The new value of b is " + b);

        System.out.println("After swapping, a is " + a + " and b is " + b);*/
    }

}
