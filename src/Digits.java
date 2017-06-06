//7). Дано трехзначное число. Определить, какая из его цифр больше:
//а) первая или последняя;
//б) первая или вторая;
//в) вторая или последняя.


import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        int xyz = 0;
        int x, y, z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        xyz = scanner.nextInt();

//Определяем цифры

        x = xyz / 100;
        y = xyz / 10 - x * 10;
        z = xyz - x * 100 - y * 10;

//проверяем первое условие задачи

        if (x > z) {
            System.out.println("Первая цифра больше, чем последняя");
        } else if (x == z) {
            System.out.println("Первая цифра равна последней");
        } else {
            System.out.println("Последняя цифра больше, чем первая");
        }


//проверяем второе условие задачи

        if (x > y) {
            System.out.println("Первая цифра больше, чем вторая");
        } else if (x == y) {
            System.out.println("Первая цифра равна второй");
        } else {
            System.out.println("Вторая цифра больше, чем первая");
        }

//третье условие
        if (y > z) {
            System.out.println("Вторая цифра больше, чем последняя");
        } else if (y == z) {
            System.out.println("Вторая цифра равна последней");
        } else {
            System.out.println("Последняя цифра больше, чем вторая");
        }

    }

}
