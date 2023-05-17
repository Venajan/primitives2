public class Main {

    public static void main(String[] args) {

        int balance = 500;
        int deposit = 5000;

        if (deposit > 1000) {

            int bonus = deposit / 100;
            int x = balance + deposit + bonus;

            System.out.println("Итоговый счёт:" + x);
            System.out.println("Бонус за пополнение:" + bonus);

        } else {

            int y = balance + deposit;

            System.out.println("Итоговый счёт:" + y);
            System.out.println("Бонус за пополнение:0");

        }
    }
}