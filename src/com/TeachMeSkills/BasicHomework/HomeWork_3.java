package com.TeachMeSkills.BasicHomework;

import java.util.Arrays;

public class HomeWork_3 {

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int [] numberArray1 = new int[5];
        int [] numberArray2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double averageValue1;
        double averageValue2;

        for (int i = 0; i < numberArray1.length; i++){
            numberArray1[i] = min + (int) (Math.random() * max);
            numberArray2[i] = min + (int) (Math.random() * max);
        }

        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));

        for (int i = 0; i < numberArray1.length; i++) {
            sum1 = sum1 + numberArray1[i];
            sum2 = sum2 + numberArray2[i];
        }

        averageValue1 = (double) sum1 / numberArray1.length;
        averageValue2 = (double) sum2 / numberArray2.length;

        if(averageValue1 > averageValue2){
            System.out.println("The average of the first array is greater than the second");
        } else if (averageValue1 < averageValue2) {
            System.out.println("The average of the second array is greater than the first");
        } else {
            System.out.println("The average of the first and second array are equal");
        }

    }

}
