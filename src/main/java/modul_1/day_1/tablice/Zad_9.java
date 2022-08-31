package modul_1.day_1.tablice;

import java.util.Arrays;

public class Zad_9 {
    public static void main(String[] args) {
        int[] intArr = {1,1,2,3,3,4};
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(returnUnique(intArr)));
    }

    protected static int[] returnUnique(int[] arr) {
        int[] resultIntArr = Arrays.copyOf(arr, 1);
        Arrays.sort(arr);
        int positionResultIntArr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                resultIntArr = Arrays.copyOf(resultIntArr, ++positionResultIntArr + 1);
                resultIntArr[positionResultIntArr] = arr[i + 1];
            }
        }

        return resultIntArr;
    }
}
