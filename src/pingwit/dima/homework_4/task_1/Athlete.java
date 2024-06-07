package pingwit.dima.homework_4.task_1;

public class Athlete {
    public static void main(String[] args) {
        double initialDistance = 10.0;
        double totalDistance = 0.0;
        double dailyDistance = initialDistance;
        for (int day = 1; day <= 7; day++) {
            totalDistance += dailyDistance;
            dailyDistance *= 1.10;
        }

        System.out.println("Общая дистанцыя которую пробежал спортсмен: " + totalDistance);
    }
}



