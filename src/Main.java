public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int payment = 1100 + amount;
        int percent = 1;

        System.out.println("Баланс: " + payment);

        int bonus = payment * percent / 100;

        if (payment < 1100) {
            bonus = 0;
        }
        System.out.println("Бонус: " + bonus);

    }

}


