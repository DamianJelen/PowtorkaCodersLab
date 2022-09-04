package modul_1.day_2.napisy;

public class Zad_13 {
    protected static char[] alphabetAndNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'Ą', 'B', 'C', 'Ć', 'D', 'E', 'Ę', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ń', 'O', 'Ó', 'P', 'Q', 'R', 'S', 'Ś', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ź', 'Ż',
            'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ń', 'o', 'ó', 'p', 'q', 'r', 's', 'ś', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ź', 'ż'};

    public static void main(String[] args) {
        System.out.println("Damian Z -> " + encode("Damian Z"));
        System.out.println("Damian Z -> " + encode("Damian Z",7));
    }

    public static String encode(String str) {
        return encode(str, 3);
    }

    public static String encode(String str, int shift) {
        String result = "";

        char[] charsOfStr = str.toCharArray();

        for (int i = 0; i < charsOfStr.length; i++) {
            if (Character.isDigit(charsOfStr[i]) || Character.isLetter(charsOfStr[i])) {
                for (int j = 0; j < alphabetAndNum.length; j++) {
                    if(charsOfStr[i] == alphabetAndNum[j] && j + shift >= alphabetAndNum.length - 1) {
                        result += alphabetAndNum[j + shift - (alphabetAndNum.length - 1)];
                    } else if (charsOfStr[i] == alphabetAndNum[j]){
                        result += alphabetAndNum[j + shift];
                    }
                }
            } else {
                result += charsOfStr[i];
            }
        }
        return result;
    }

}
