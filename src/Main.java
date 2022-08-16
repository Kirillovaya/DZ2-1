public class Main {
    public static void main(String[] args) {
        int price = 2500; // стоимость билета
        int bonusMiles = 1;
        int rubles = 20; // рублей для одной бонусной милли

        int totalBonus = price * bonusMiles / rubles;

        System.out.println(totalBonus);
    }
}