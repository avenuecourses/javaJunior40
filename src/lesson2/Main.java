package lesson2;

public class Main {
    public static void main(String[] args) {
        // управляющие конструкции
        // if
        // switch

        // Есть 3 стороны треугольника. Вывести на консоль какой это треугольник.
        // Разносторонний Ранобедренный или Равносторонний

        int a = 10;
        int b = 8;
        int c = 10;

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

    }
}
