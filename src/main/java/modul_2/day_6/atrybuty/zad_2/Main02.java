package modul_2.day_6.atrybuty.zad_2;

import modul_2.day_6.atrybuty.zad_1.AccessModifier;

public class Main02 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "Atrybut publiczny jest do ustawienia z tego miejsca";
        System.out.println(testAttribute.publicAttribute);
    }
}
