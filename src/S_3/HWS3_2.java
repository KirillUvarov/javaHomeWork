package S_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

public class HWS3_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr  = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(1, 10);
            arr.add(value);
        }
        System.out.printf("Список: \n %s" + "\n", arr);
        int i = 0;
        while (i < arr.size()) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без чётных чисел: \n %s\n", arr);
    }
}
