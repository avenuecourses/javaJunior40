package lesson4;

public class Main1 {
    public static void main(String[] args) {
        // создать квадрат 9 на 9, заполненный 0
        // и весь напечатать на консоль

        int[][] nums = new int[9][9];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
