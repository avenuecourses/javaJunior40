package lesson5;

public class Main {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figuraqqq = ScannerUtil.getInputFigure(); // рекурсивный вызов

        int a = 9;

        if(figuraqqq.equals("1") || figuraqqq.equalsIgnoreCase("Круг")){
            String action = ScannerUtil.getAction(); // или площадь или перимерт
            int radius = ScannerUtil.getParametr("Введите радиус:");
            if(action.equalsIgnoreCase("площадь")){
                System.out.println("Площадь круга: " + 2 * 3.14 * radius);
            }else {
                System.out.println("Периметр круга: " + 3.14 * (radius * radius));
            }

        }
    }
}
