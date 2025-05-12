package am.picsartacademy.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        // Task1: Create an array and fill it with 2 number
        int[] myNumbers;
        myNumbers = new int[2];
        myNumbers[0] = 254;
        myNumbers[1] = 36;
        // or
        int[] myNumbers1 = {254, 36};

        // Task2: Create an array and fill it with numbers from 1:1000
        int[] altNumber = {1000};
        for(int i = 1; i <= 1000; i += 1) {
            System.out.println(i);
        }

        // Task3: Create an array and fill it with odd numbers from -20:20
        int[] oddNum = {20};
        for(int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
            }
        }

        // Task4: Create an array and fill it. Print all elements which can be divided by 5
        int[] altNumber2 = {5, 45, 72, 58, 30, 205, 91, 65, 27};
        for (int i : altNumber2) {
            if (i % 5 == 0) {
                System.out.println("The following number can be divided by 5: " + i);
            }
        }

        // Task5: Create an array and fill it. Print all elements which are between 24.12 and 467.23
        double[] myNumbers2 = {467.23};
        for (double i = 24.12; i <= 467.23; i += 0.1) {
            System.out.println(i);
        }

        // Task6: Create an array and fill it. Print count of elements which can be divided by 2
        int[] myNumbers3 = {257, 116, 450, 967, 440, 88, 42, 104, 602, 20, -86, 75, 34};
        int allCount = 0;
        for (int i : myNumbers3) {
            if (i % 2 == 0) {
                allCount = allCount + 1;

            }
        }
        System.out.println("The count of all elements: " + allCount);


        // Task7: Given an integer, 0<N<21 , print its first 10 multiples.
        // Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        int num = 2;
        int[] anArray = {10};
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }









    }
}
