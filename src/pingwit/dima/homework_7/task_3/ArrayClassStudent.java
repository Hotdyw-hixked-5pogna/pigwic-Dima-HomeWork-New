package pingwit.dima.homework_7.task_3;

import pingwit.dima.homework_7.task_2.Student;

public class ArrayClassStudent {
    public static void main(String[] args) {
        Student[] people = new Student[1];
        people[0] = new Student("Oleg", 30);
        for (Student student : people) {
            System.out.println();
        }
    }
}
