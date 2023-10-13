package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // Задача: сколько мы заберем денег с банка,
        // если оставим 10 000 руб на 7 лет, под 9% годовых
        // помесячная капитализация

        int money = 1000000;
        int year = 5;
        int prosent = 9;

        for (int month = 0; month <= year * 12; month++) {
            money = money + ((money / 100 * prosent) / 12);
        }

        System.out.println(money);
    }
}
