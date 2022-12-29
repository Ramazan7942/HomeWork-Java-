public class Main {
    public static void main(String[] args) {
        int сheck = 350;
        int replenishmentAmounts = 1550;
        int threshold = 1000;

        int bonus;
        if (replenishmentAmounts > threshold) {
            bonus = replenishmentAmounts / 100;
        } else {
            bonus = 0;
        }

        System.out.println(replenishmentAmounts + сheck);
        System.out.println(bonus);
    }
}