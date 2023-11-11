package com.TeachMeSkills.AdditionalTask;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask_5 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int [] numberArray1 = new int[n];
        int [] numberArray2 = new int[n];
        int min = 0;
        int max = 100;

        for (int i = 0; i < numberArray1.length; i++){
            numberArray1[i] = min + (int) (Math.random() * max);
        }

        for (int i = 0; i < numberArray1.length; i++) {
            numberArray2[i] = numberArray1[i];
        }

        for (int i = 0; i < numberArray1.length; i++) {
            if (numberArray1[i] % 2 != 0){
                numberArray2[i] = 0;
            }
        }

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));

    }

}
