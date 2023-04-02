package S_4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

public class HWS4_1 {
    public static LinkedList<Integer> randList(Integer n) {
        LinkedList<Integer> arr = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(rand.nextInt(1, 10));
        }
        System.out.println(arr + "\n");
        return arr;
    }

    public static Object lList(LinkedList<Integer> arr, Integer n) {
        LinkedList<Integer> arr_2 = new LinkedList<>();
        for (int j = 0; j < n; j++) {
            arr_2.addLast(arr.pollLast());
        }
        return arr_2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длину списка LinkedList: ");
        int number = s.nextInt();
        System.out.printf("%s\n", lList(randList(number), number));
        s.close();
    }
}
