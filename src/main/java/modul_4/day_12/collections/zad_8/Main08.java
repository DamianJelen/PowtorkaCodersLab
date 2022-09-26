package modul_4.day_12.collections.zad_8;

import modul_4.day_12.regex.zad_5.Main05;
import modul_4.day_12.regex.zad_5.Person;

import java.util.*;

public class Main08 {
    public static void main(String[] args) {
        List<Person> personList = Main05.readCorrectPerson("day_12/regex/people.csv");
        Map<Integer, List<Person>> map = mapPeopleByAge(personList);
        printMapByAge(map);
    }

    static Map<Integer, List<Person>> mapPeopleByAge(List<Person> personList) {
        Map<Integer, List<Person>> result = new HashMap<>();

        for (Person person : personList) {
            if(result.get(person.getAge()) == null) {
                List<Person> people = new ArrayList<>();
                people.add(person);
                result.put(person.getAge(), people);
            } else {
                result.get(person.getAge()).add(person);
                result.put(person.getAge(), result.get(person.getAge()));
            }
        }

        return result;
    }

    static void printMapByAge(Map<Integer, List<Person>> mapPeopleByAge) {
        for(Map.Entry<Integer, List<Person>> mapEntry : mapPeopleByAge.entrySet()) {
            System.out.println("Age: " + mapEntry.getKey() + "\t\t\tPeople in this age group: " + mapEntry.getValue().size() +
                    "\n-----------------------------------------------------------------------------");
            System.out.println(Arrays.toString(mapEntry.getValue().toArray()) +
                    "\n=============================================================================");
        }
    }
}
