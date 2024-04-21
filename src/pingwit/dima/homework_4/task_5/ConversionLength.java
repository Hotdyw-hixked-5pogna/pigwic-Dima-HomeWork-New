package pingwit.dima.homework_4.task_5;

public class ConversionLength {
    public static void main(String[] args) {
        double cen = 2.54;
        for (int inch = 1; inch <= 20; inch++) {
            System.out.println(inch + "д" + "-" + cen * inch + "см");
        }
    }
}