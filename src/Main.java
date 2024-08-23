
public class Main {
    public static void main(String[] args) {

        int account = 100;    // начальный счет

        int sumAdded = 950;  // сумма пополнения

        int accountAdded = account + sumAdded; // пополненный счет

        int bonus; // итоговый бонус

        if (accountAdded > 1000) {
            bonus = accountAdded / 100;
        } else {
            bonus = 0;
        }

        int fullAccount = accountAdded + bonus; // итоговый счет

        System.out.println("Итоговый бонус: " + bonus);

        System.out.println("Итоговый счет: " + fullAccount);

    }
}