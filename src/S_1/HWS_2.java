package S_1;

//n! (произведение чисел от 1 до n)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HWS_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n для вычисления факториала (n!): ");
        int n = iScanner.nextInt();
        System.out.printf("Результат: %d\n", numInput(n));
        iScanner.close();
    }

    public static int numInput(int n) {
        int result = 1;
        for (int i = 1; i < n+1; i++) {
            result = i * result;
//            System.out.printf("!"+"%d"+"="+result + "\n", i); // Можно включить для контроля процесса
        }
        return result;
    }
}