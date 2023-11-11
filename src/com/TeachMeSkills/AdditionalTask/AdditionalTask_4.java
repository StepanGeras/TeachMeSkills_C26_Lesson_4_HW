package com.TeachMeSkills.AdditionalTask;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask_4 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter array size from 5 to 10: ");
        int n = scanner.nextInt();

        while (n < 5 || n > 10){
            System.out.print("Enter array size from 5 to 10: ");
            n = scanner.nextInt();
        }

        int [] numberArray1 = new int[n];
        int min = 0;
        int max = 100;
        int m = 0;
        int numberOfEvenNumbers = 0;
        for (int i = 0; i < numberArray1.length; i++){
            numberArray1[i] = min + (int) (Math.random() * max);
        }

        for (int i = 0; i < n; i++) {
            if (numberArray1[i] % 2 == 0){
                numberOfEvenNumbers = numberOfEvenNumbers + 1;
            }
        }

        int [] numberArray2 = new int[numberOfEvenNumbers];

        for (int i = 0; i < numberOfEvenNumbers; i++) {
            for (int j = m; j < n; j++) {
                if (numberArray1[j] % 2 == 0){
                    numberArray2[i] = numberArray1[j];
                    m = j + 1;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));

    }

}
