package modul_2.day_6.atrybuty.zad_1;

public class Main01 {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        String strDefault = accessModifier.defaultAttribute;
        String strProtected = accessModifier.protectedAttribute;
        String strPublic = accessModifier.publicAttribute;

        accessModifier.defaultAttribute = "Atrybut klasowy jest do ustawienia z tego miejsca";
        accessModifier.protectedAttribute = "Atrybut protected jest do ustawienia z tego miejsca";
        accessModifier.publicAttribute = "Atrybut publiczny jest do ustawienia z tego miejsca";

        System.out.println(accessModifier.defaultAttribute + "\n" +
                accessModifier.protectedAttribute + "\n" +
                accessModifier.publicAttribute);
    }
}
