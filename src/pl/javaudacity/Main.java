package pl.javaudacity;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // write your code here
        System.out.println("Enter count:");
        //to retrieve this information:
        int count = scanner.nextInt();
        scanner.nextLine();

        //we save the returned array
        int[] returnedArray = readIntegers(count);
        //w save the returned method
        int returnedMin = findMin(returnedArray);

        System.out.println("minimum is: "+ returnedMin);

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (count == 1) {
                System.out.println("Enter " + count + " number:");
            } else {
                System.out.println("Enter " + count + " numbers: ");
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            //we record the name that has been entered
            array[i] = number;
            count--;
        }
        System.out.println("The array contains: " + Arrays.toString(array));
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                value = min;
            }
        }
        return min;
    }

}

