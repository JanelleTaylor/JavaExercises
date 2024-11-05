package javaExercise.Ex05;

//05. Show examples of overloading and overriding in Java.
public class OverloadingAndOverriding {
    /*
        Overloading examples:- Calculating the sum of x number of numbers.
    */

    static int calSum(int a, int b){
        return (a + b);
    }

    static int calSum(int a, int b, int c){
        return (a + b + c);
    }

    /*
    Overriding examples:- Calculating the number of x number of numbers.
    */
    static class Game{
        private void play(){
            System.out.println("Let's play a game");
        }
    }
    static class Board extends Game{
        private void play(){
            System.out.println("Break out the board games.");
        }
    }

    public static void main(String[] args){
        int numResult1 = calSum(6,7);
        System.out.println("The sum of the two numbers is " + numResult1);
        int numResult2 = calSum(25, 50, 75);
        System.out.println("The sum of the three numbers is " + numResult2);
        System.out.println(" ");
        Game uno = new Game();
        uno.play();
        Board checkers = new Board();
        checkers.play();
    }
}