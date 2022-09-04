package modul_1.day_2.examples;

public class Examples {
    public static void main(String[] args) {
        stringBuilder("Przykład");
        stringBuilderReverse("Przykład reverse w StringBuilder");
    }

    private static void stringBuilder(String simpleStr_x10) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(simpleStr_x10).append(" ").append(i + 1).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    private static void stringBuilderReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse().append(" dodane po odwroceniu poprzedniego stringa");
        System.out.println(stringBuilder.toString());
    }

    private static void showAlphabetAndNumbers() {
        for (Character i = '0'; i <= 'z'; i++) {
            if (Character.isDigit(i) || Character.isLetter(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}
