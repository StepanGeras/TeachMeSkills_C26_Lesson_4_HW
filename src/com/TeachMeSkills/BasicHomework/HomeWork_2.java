package com.TeachMeSkills.BasicHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_2 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arrayLength = scanner.nextInt();
        int min = 0;
        int max = 100;
        int sum = 0;
        int [] numberArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            numberArray[i] = min + (int) (Math.random() * max);
        }

        System.out.println(Arrays.toString(numberArray));
        Arrays.sort(numberArray);

        for (int i = 0; i < arrayLength; i++) {
            sum = sum + numberArray[i];
        }

        System.out.println("Max: " + numberArray[arrayLength - 1] + "\n" +
                "Min: " + numberArray[0] + "\n" +
                "Average value: " + (double) sum/arrayLength);

    }

}
