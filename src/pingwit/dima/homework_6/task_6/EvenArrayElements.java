package pingwit.dima.homework_6.task_6;

import java.util.ArrayList;
import java.util.List;

public class EvenArrayElements {
    public static void main(String[] args) {
        int[] originalArray = {5, 3, 8, 1, 2, 4};
        List<Integer> evenNumbersList = new ArrayList<>(); // если знаешь что такое коллекции, то используй не здоровье, если не знаешь, то лучше пока без них

        for (int i = 0; i < originalArray.length; i++) {
            
            if (originalArray[i] % 2 == 0) {
                evenNumbersList.add(originalArray[i]);
            }
        }

        int[] evenNumbers = new int[evenNumbersList.size()];
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenNumbers[i] = evenNumbersList.get(i);
        }

        System.out.print("Чётные элементы массива: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}
