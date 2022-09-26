package modul_4.day_13.maven.zad_2;

import com.google.common.collect.Lists;

import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);
    }
}
