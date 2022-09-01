package modul_1.day_2.examples;

import java.util.Arrays;
import java.util.Random;

public class CreateArrays {
    public int[] createArrayOneDimension(int lengthArray) {
        int[] resulInttArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            Random random = new Random();
            resulInttArray[i] = random.nextInt(100) + 1;
        }
        return resulInttArray;
    }

    public int[][] createArraysTwoDimension(int firstLength, int secondLength) {
        int[][] resultIntArray = new int[firstLength][secondLength];
        for (int i = 0; i < firstLength; i++) {
            resultIntArray[i] = createArrayOneDimension(secondLength);
        }
        return resultIntArray;
    }

    public int[][] createArraysTwoDimensionRandomSecLength(int firstLength) {
        int[][] resultIntArray = new int[firstLength][];
        for (int i = 0; i < firstLength; i++) {
            Random random = new Random();
            resultIntArray[i] = createArrayOneDimension(random.nextInt(21));
        }
        return resultIntArray;
    }

    public void showArrayOneDimension(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    }

    public void showArraysTwoDimension(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            showArrayOneDimension(intArray[i]);
        }
    }

    public int sumElemArrayOneDimension(int[] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            result += intArray[i];
        }
        return  result;
    }

    public int sumElemArraysTwoDimension(int[][] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            result += sumElemArrayOneDimension(intArray[i]);
        }
        return result;
    }
}
