package modul_4.day_12.collections.zad_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main03 {
    public static void main(String[] args) {
        List<City> cityList = initialize();
        showList(cityList);
        System.out.println("\n========= sublist ================");
        showList(subList(cityList, 0, 5));
    }

    public static List<City> initialize() {
        List<City> result = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int population = random.nextInt(10) + 1;
            result.add(new City("City " + i, population * 1000));
        }

        return result;
    }

    public static void showList(List<City> cityList) {
        for(City city : cityList) {
            System.out.println(city.toString() + "\n--------------------------------------");
        }
    }

    public static List<City> subList(List<City> list, int start, int end) {
        return list.subList(start, end);
    }
}
