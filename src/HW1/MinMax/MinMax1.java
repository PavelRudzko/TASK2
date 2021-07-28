package HW1.MinMax;

import java.util.Scanner;
import java.lang.System;

public class MinMax1 {
    public static void main(String[] args) {


        int numsElongation1;
        int numsElongation2;
        System.out.println("Задайте количество чисел ");
        Scanner in = new Scanner(System.in);


        int numssize = in.nextInt();
        long[] nums = new long[numssize];
        for (int i = 0; i < numssize; i++) {
            System.out.print("Введите  число1: ");
            nums[i] = in.nextLong();
        }

        long min = nums[0];
        for (long num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
        System.out.println();

        numsElongation1 = String.valueOf(Math.abs(min)).length();


        long max = nums[0];
        for (long num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Минимальное число " + " " + min + " " + "Максимальное число " + " " + max);
        System.out.println();

        numsElongation2 = String.valueOf(Math.abs(max)).length();

        System.out.println(" Количество цифр в минимальном числе " + " " + min + " " + numsElongation1);

        System.out.println(" Количество цифр в максимальном  числе " + " " + max + " " + numsElongation2);


    }
}
