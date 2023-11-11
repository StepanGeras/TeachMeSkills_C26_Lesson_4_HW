package com.TeachMeSkills.BasicHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_0 {

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int [] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = min + (int) (Math.random() * max);
        }

        System.out.println(Arrays.toString(numberArray));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for it in the array: ");
        int c = scanner.nextInt();

        Arrays.sort(numberArray);
        int index = Arrays.binarySearch(numberArray, c);

        if (index >= 0) {
            System.out.println("This number is included in the array");
        } else {
            System.out.println("There number is no included in the array");
        }

    }

}
