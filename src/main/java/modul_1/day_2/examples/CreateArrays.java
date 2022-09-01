package modul_1.day_2.examples;

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
}
