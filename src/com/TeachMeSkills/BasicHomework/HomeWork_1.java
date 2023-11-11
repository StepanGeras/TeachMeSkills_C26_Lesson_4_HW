package com.TeachMeSkills.BasicHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int m = 0;
        int q = 0;
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int [] numberArray1 = new int[n];
        for (int i = 0; i < numberArray1.length; i++){
            numberArray1[i] = min + (int) (Math.random() * max);
        }

        System.out.println(Arrays.toString(numberArray1));
        System.out.print("Enter the number to be removed from the array: ");
        int c = scanner.nextInt();

        for (int i = 0; i < numberArray1.length; i++) {
            if (numberArray1[i] == c){
                m = n - 1;
                break;
            } else {
                m = n;
            }
        }

        int[] numberArray2 = new int[m];

        for (int i = 0; i < numberArray2.length; i++) {
            for (int j = q; j < numberArray1.length; j++) {
                if (numberArray1[j] != c) {
                    numberArray2[i] = numberArray1[j];
                    q = j + 1;
                    break;
                }

            }
        }




        System.out.println(Arrays.toString(numberArray2));

    }

}
