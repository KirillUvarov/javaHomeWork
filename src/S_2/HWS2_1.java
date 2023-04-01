package S_2;
//1.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//        (через FileWriter).

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HWS2_1 {

    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    public static int[] bubbleSort(int arr[]) throws IOException {
        Logger logger = Logger.getLogger(HWS2_1.class.getName()); // Присваиваем функцию логгирования
        FileHandler fHandler = new FileHandler("HWS2_1_logger.txt"); //Открываем файл для логгирования
        SimpleFormatter sFormatter = new SimpleFormatter(); //Упрощаем формат из xml в строки
        fHandler.setFormatter(sFormatter); //Устанавливаем формат
        logger.addHandler(fHandler);

        int temp;
        //for (int i = arr.length - 1; i >= 0; i--) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            logger.info(Arrays.toString(arr));
        }
        return arr;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        print(bubbleSort(randomArr()));
    }

}
