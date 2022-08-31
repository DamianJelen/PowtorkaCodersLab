package modul_1.day_1.tablice;

public class Zad_1 {
    public static void main(String[] args) {
        int[] intArr = new int[50];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            if(i < 10) {
                System.out.print("0" + i + ", ");
            } else if(i % 10 == 0) {
                System.out.print("\n" + i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
