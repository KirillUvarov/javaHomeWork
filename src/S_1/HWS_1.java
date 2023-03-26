package S_1;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n),

import java.util.Scanner;

public class HWS_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n для вычисления треугольного числа: ");
        int n = iScanner.nextInt();
        System.out.printf("Результат: %d\n", numInput(n));
        iScanner.close();
    }

    public static int numInput(int n) {
        return (n * (n + 1)) / 2;
    }
}