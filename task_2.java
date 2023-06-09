package seminar_java.seminar_dz_2;
import java.io.IOException;

import java.io.FileWriter;

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class task_2 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        sortBubble(array);
    }
    
    public static int[] sortBubble(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            writeLog(array);
        }
        return array;
    }

    public static void writeLog(int[] array) {
        try (FileWriter writer = new FileWriter("seminar_java\\seminar_dz_2\\logTask2.txt", true)) {
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + " ");
            }
            writer.write("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

   
}
