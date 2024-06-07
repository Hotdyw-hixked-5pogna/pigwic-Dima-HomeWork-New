package pingwit.dima.homework_4.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int amoebas = 1;
        for (int hours = 3; hours <= 24; hours += 3) {
            amoebas *= 2;
            System.out.println("Количество амёб спустя" + " " + hours + " " + "часов:" + amoebas);
        }
    }
}


