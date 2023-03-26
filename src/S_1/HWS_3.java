package S_1;

//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HWS_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: "); // Вводим 1000 или другое
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> simpleNum = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                simpleNum.add(i);
            }
        }
        System.out.println("Простые числа: " + simpleNum);
    }
}