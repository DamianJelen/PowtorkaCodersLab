package modul_1.day_2.napisy;

public class Zad_9 {
    public static void main(String[] args) {
        System.out.println(sentencesIntoWords("Ala ma kota, a kot ma Alę."));
    }

    public static String sentencesIntoWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(i + ": ").append(words[i]).append("\n");
        }
        return stringBuilder.toString();
    }
}
