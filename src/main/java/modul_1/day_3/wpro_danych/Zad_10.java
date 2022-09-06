package modul_1.day_3.wpro_danych;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad_10 {
    public static void main(String[] args) {
        System.out.println(retirement());
    }

    public static String retirement() {
        Set<Person> personSet = new LinkedHashSet<>();
        String[] etykiety = {"Imie", "Nazwisko", "Rok urodzenia", "Płeć M/K"};
        String tmpStr = "";
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime yearNow = LocalDateTime.now();
        int yearNowNum = Integer.valueOf(dateTimeFormatter.format(yearNow).toString());

        while(!tmpStr.equals("quit")) {
            Person person = new Person();
            for (int i = 0; i < etykiety.length; i++) {
                System.out.print(etykiety[i] + ": ");
                tmpStr = scanner.next();
                if (tmpStr.equals("quit")) {
                    i = 5;
                }
                switch (i) {
                    case 0: person.setName(tmpStr);
                    break;
                    case 1: person.setSurname(tmpStr);
                    break;
                    case 2: person.setBirthYear(Integer.parseInt(tmpStr));
                    break;
                    case 3: person.setSex(tmpStr.charAt(0));
                    break;
                }
            }
            if ((yearNowNum - person.getBirthYear() > 60 && person.getSex() == 'K') ||
                    (yearNowNum - person.getBirthYear() > 65 && person.getSex() == 'M')) {
                personSet.add(person);
            }
        }

        for (Person per : personSet) {
            stringBuilder.append(per.toString()).append("\n").append("------------------").append("\n");
        }

        return stringBuilder.toString();
    }
}
