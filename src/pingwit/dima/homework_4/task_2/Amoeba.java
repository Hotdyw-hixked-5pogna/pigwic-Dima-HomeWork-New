package pingwit.dima.homework_4.task_2;

public class Amoeba {
    public static void main(String[] args) {
        //todo rename "quantityCells", new vars
        int dailyCells = 1;
        int timeDivision = 24; // timeDivision -> hours
        int increaseCell = 2;
        int totalCells = dailyCells;
        for (int i = 0; i <= timeDivision; i += 3) {
            dailyCells = dailyCells * increaseCell;
            totalCells = totalCells + dailyCells;
            System.out.println(dailyCells);
        }
        System.out.println(totalCells); // На экран выводит 1023, это нечетное число, а клетка каждый раз делится на две, т.е. финальное число должно делиться на 2


        // пример решения задачи
        int hours = 9;
        int amoebas = 1;
        for (int i = 3; i <= hours; i += 3) {
            amoebas *= 2;
            System.out.println(amoebas);
        }
    }
}
