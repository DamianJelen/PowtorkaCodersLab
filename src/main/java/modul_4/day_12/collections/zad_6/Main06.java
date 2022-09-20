package modul_4.day_12.collections.zad_6;

import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        Map<String, Country> stringCountryMap = getMap(initialize());

        for(Map.Entry<String, Country> entry : stringCountryMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }
    }

    public static List<Country> initialize(){
        List<Country> result = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            result.add(new Country("Country " + i, "Capital " + i));
        }
        
        return result;
    }

    public static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> resultMap = new HashMap<>();

        ListIterator<Country> iterator = list.listIterator();
        while(iterator.hasNext()) {
            Country country = iterator.next();
            resultMap.put(country.getCapital(), country);
        }

        return resultMap;
    }
}