package modul_1.day_1.tablice;

import java.util.Arrays;

public class Zad_6 {
    public static void main(String[] args) {
        int[] numbers = {46, 46, 36, 17, 67, 36, 85, 74, 4, 90};
        int[] secondNumbers = {70, 68, 4, 93, 73, 9, 21, 82, 85, 62};
        int[] sumOfTwoArrays = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            sumOfTwoArrays[i] = numbers[i] + secondNumbers[i];
        }

        System.out.println("numbers 1: " + Arrays.toString(numbers) + "\nnumbers 2: " + Arrays.toString(secondNumbers)
                + "\n-----------------------------------------------------------------"
                + "\nnumbers S: " + Arrays.toString(sumOfTwoArrays));
    }
}
