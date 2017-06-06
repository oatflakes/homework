//9). Даны вещественные числа х и у, не равные друг другу. Меньшее из этих
//двух чисел заменить половиной их суммы, а большее — их удвоенным
//произведением.

import java.util.Scanner;

public class HalfSumDoubleProduct {
    public static void main(String[] args) {

        double x = 0;
        double y = 0;
        double min = 0;
        double max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        x = scanner.nextDouble();

        System.out.print("Введите y: ");
        y = scanner.nextDouble();

        min = (x + y) / 2;
        max = 2 * x * y;

        if (x == y) {
            System.out.println("x=y, невозможно заменить");
        } else if (x > y) {
            x = max;
            y = min;
        } else {
            x = min;
            y = max;
        }
        System.out.println("x: " + x + "; y: " + y);

    }
}
