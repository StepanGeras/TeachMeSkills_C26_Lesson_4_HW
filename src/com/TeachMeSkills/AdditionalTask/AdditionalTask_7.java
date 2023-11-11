package com.TeachMeSkills.AdditionalTask;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask_7 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int [] numberArray = new int[n];
        int min = 0;
        int max = 10000;

        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = min + (int) (Math.random() * max);
        }
        int a;
        System.out.println(Arrays.toString(numberArray));

        for (int i = numberArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(numberArray[j] > numberArray[j + 1]){
                    a = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = a;
                }
            }
        }

        System.out.println(Arrays.toString(numberArray));

    }

}
