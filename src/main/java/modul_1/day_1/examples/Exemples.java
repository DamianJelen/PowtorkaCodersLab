package modul_1.day_1.examples;

public class Exemples {
    public static void main(String[] args) {
        System.out.println("Przykład metody instIfElse " + instIfElse(2));
        System.out.println("Przykład metody instSwitch " + instSwitch("moto"));
        System.out.println("Przykład petli For: " + petlaFor(1, 10));
        System.out.println("Przykøad petli While: " + petlaWhile(5));
        System.out.println("Przykøad referencji:\n" + referencje(3));
        System.out.println("Przykøad 2 referencji: " + referencje());
    }

    protected static String instIfElse(int number) {
        if (number == 1) {
            return "poniedziałek";
        } else if(number == 2) {
            return "wtorek";
        } else {
            return "itd";
        }
    }

    protected static String instSwitch(String varStr) {
        String result = "";
        switch (varStr) {
            case "auto":  result = "Audi, BMW, Fiat, Opel, ...";
                break;
            case "moto": result = "Honda, Yamaha, Kawasaki, ...";
                break;
            default: result = "nie wybrano poprawnej wartości";
                break;
        }
        return result;
    }

    protected static String petlaFor(int zakres_od, int zakres_do) {
        String result = "";
        for (int i = zakres_od; i <= zakres_do; i++) {
            if (i < zakres_do) {
                result = result + i + " ";
            } else {
                result = result + i;
            };
        }
        return result;
    }

    protected static String petlaWhile(int number) {
        int i = 0;
        String result = "";
        while(i < number) {
            i++;
            result = result + i + " ";
        }
        return result;
    }

    protected static String referencje(int number) {
        int num1;
        int num2 = number;
        num1 = num2;
        num2 = number + 10;
        return "Num 1: " + num1 + "\n" +
                "Num 2: " + num2 + "\n" +
                "Num 1: " + num1;
    }

    protected static String referencje() {
        User user1 = new User("Damian", 25);
        User user2 = user1;
        user2.setAge(20);
        return user1.toString();
    }
}
