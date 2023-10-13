package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // Есть 2 знаменателя
        // Нужно определить общий знаменатель

        int znam1 = 4;
        int znam2 = 8;


        int bigestZnam = znam1; // на bigestZnam сохранит БОЛЬШЕЕ из 2х чисел
        if(znam2 > znam1){
            bigestZnam = znam2;
        }

        for(int i = bigestZnam; i <= znam1 * znam2; i++){ // перебираем цифры от 8 до 40
            if(i % znam1 == 0 && i % znam2 == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
