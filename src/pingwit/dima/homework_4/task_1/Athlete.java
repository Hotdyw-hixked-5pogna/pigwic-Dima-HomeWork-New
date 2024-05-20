package pingwit.dima.homework_4.task_1;

public class Athlete {
    public static void main(String[] args) {
         //todo 7; 1.1; to variables
        double distanceIncrease = 1.1;
        double trainingDays = 7;
        double dailyDistanceKm = 10;
        double totalDistanceKm = dailyDistanceKm;
        for (int i = 1; i <= trainingDays; i++) {
            dailyDistanceKm = dailyDistanceKm * distanceIncrease;
            totalDistanceKm = totalDistanceKm + dailyDistanceKm;
            System.out.println(i);
        }
        System.out.println(totalDistanceKm);
    }
}



