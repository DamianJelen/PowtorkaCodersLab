package modul_2.day_6.dodatkowe.zad_1;

import java.math.BigDecimal;

public class BankAccount {
    private String number;
    private BigDecimal cash;

    public BankAccount(String number) {
        this.number = number;
        cash = new BigDecimal(0);
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void depositCash(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(0)) > 0) {
            this.cash = this.cash.add(amount);
        } else {
            System.out.println("The amount should be greater than 0");
        }
    }

    public BigDecimal withdrawCash(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(0)) > 0) {
            if (amount.compareTo(this.cash) <= 0) {
                this.cash = this.cash.subtract(amount);
                return amount;
            } else {
                amount = amount.subtract(amount.subtract(this.cash));
                this.cash = this.cash.subtract(amount);
                return amount;
            }
        } else {
            System.out.println("The amount should be greater than 0");
            return  BigDecimal.valueOf(0);
        }
    }

    @Override
    public String toString() {
        return "BankAccount:\n" +
                "\tnumber: " + number + '\n' +
                "\tcash: " + cash + " EUR";
    }
}
