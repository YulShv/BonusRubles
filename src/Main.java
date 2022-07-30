public class Main {
    public static void main(String[] args) {

        int beginBalance = 200;
        int value = 1100;
        int endBalance = beginBalance + value;
        int bonusRubles = 0;

        if  (value > 1000) {
            bonusRubles = value / 100;
            endBalance = endBalance + bonusRubles;
        }

        System.out.println("Бонусные рубли: " + bonusRubles);
        System.out.println("Итоговая сумма: " + endBalance);

    }
}
