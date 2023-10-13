package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA = {{2, 4, 6, 7},
                           {3, 6, 8, 4},
                           {4, 8, 5, 4}};

        double[][] forB = {{2, 2, 2, 2},
                           {4, 4, 4, 4},
                           {5, 5, 5, 5}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);

        IMatrix resultAdd = a.add(b);
        resultAdd.printToConsole();
    }
}
