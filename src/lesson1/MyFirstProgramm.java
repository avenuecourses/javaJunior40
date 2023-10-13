
// package - указание папки в которой мы сейчас
package lesson1;

// public - открытый, общедоступный внутри всего проекта
// class - "кусочек текста (кода) который имеет одну смысловую нагрузку"
public class MyFirstProgramm {

    // тело
    // точка начала нашей программы
    public static void main(String[] args) {
        // Есть 3 стороны треугольника: 6, 10, 7. Нужно посчитать перимерт
        int a = 6;
        int b = 10;
        int c = 7;


        int perimetr = a + b + c;
        // вывод на консоль sout
        System.out.println(perimetr);
    }


}

