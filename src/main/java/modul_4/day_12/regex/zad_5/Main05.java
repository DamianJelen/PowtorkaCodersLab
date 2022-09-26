package modul_4.day_12.regex.zad_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main05 {
    public static void main(String[] args) {
        printList(readCorrectPerson("day_12/regex/people.csv"));
    }

    public static List<Person> readCorrectPerson(String fileName) {
        File file = new File(fileName);
        List<Person> result = new ArrayList<>();

        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] strArr = scanner.nextLine().split(",");
                if(strArr.length == 5 && checkPerson(strArr)) {
                   result.add(new Person(strArr[1], strArr[2], Integer.valueOf(strArr[3]), strArr[4]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }

    static boolean checkPerson(String[] strArr) {
        String regEmail = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        String regOnlyLetters = "[a-zA-Z]+";
        String regOnlyNumbers = "[0-9]+";
        boolean[] result = new boolean[3];

        Pattern patternMail = Pattern.compile(regEmail);
        Pattern patternNameCity = Pattern.compile(regOnlyLetters);
        Pattern patternAge = Pattern.compile(regOnlyNumbers);

        if(strArr.length == 5) {
            Matcher matcherMail = patternMail.matcher(strArr[0]);
            Matcher matcherNameCity = patternNameCity.matcher(strArr[1] + strArr[2] + strArr[4]);
            Matcher matcherAge = patternAge.matcher(strArr[3]);

            result[0] = matcherMail.matches();
            result[1] = matcherNameCity.matches();
            result[2] = matcherAge.matches();
            return result[0] && result[1] && result[2];
        }

        return false;
    }

    static void printList(List<Person> personList) {
        for(Person person : personList) {
            System.out.println(person.toString() + "\n-------------------------------------------------------------------------");
        }
        System.out.println(personList.size() + " persons on list\n-------------------------------------------------------------------------");
    }
}
