package pingwit.dima.homework_7.task_2;

public class NewStudent {
    public static void main(String[] args) {
        String name = "Oleg";
        int age = 30;

        Student student = new Student(name, age);
        System.out.println(student.name);
        System.out.println(student.age);
    }
}
