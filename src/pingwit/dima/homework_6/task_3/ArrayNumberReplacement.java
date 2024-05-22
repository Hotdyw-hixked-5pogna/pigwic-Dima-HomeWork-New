package pingwit.dima.homework_6.task_3;

// отформатируй код
public class ArrayNumberReplacement {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 10, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }
                for (int number : numbers) {
                    System.out.println(number + " "); // а зачем + " "?
                }
            }
        }
