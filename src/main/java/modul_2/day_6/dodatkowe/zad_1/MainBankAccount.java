package modul_2.day_6.dodatkowe.zad_1;

import java.math.BigDecimal;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("571234000020547631");
        System.out.println(account1.toString());
        account1.depositCash(BigDecimal.valueOf(1500));
        System.out.println("dodano 1500:\n" + account1.toString());
        System.out.println("Pomniejszono o: " + account1.withdrawCash(BigDecimal.valueOf(800)));
        System.out.println(account1.toString());
        account1.depositCash(BigDecimal.valueOf(100));
        System.out.println("dodano 100:\n" + account1.toString());
        System.out.println("Pomniejszono o: " + account1.withdrawCash(BigDecimal.valueOf(1000)));
        System.out.println(account1.toString());

    }
}
