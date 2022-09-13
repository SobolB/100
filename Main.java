public class Main {
    public static void main(String[] args) {
        int initialAccount = 3_000;
        int addend = 1340;

        int bonus;

        bonus = addend > 1000 ? addend / 100 : 0;

        int finalBonus = initialAccount + addend + bonus;

        System.out.println("Итог : " + finalBonus);
        System.out.println("Бонусные рубли : " + bonus);
    }
}
