//8). Дано трехзначное число. Определить, равен ли квадрат этого числа сумме
//кубов его цифр.

//квадрат минимального трехзначного числа 100*100=10000
//сумма кубов цифр максимального трехзначного числа 999 = 729*3 = 2187
//для трехзначного числа невыполнимое условие в задаче

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {

        int xyz ;
        int x, y, z;
        double digitsCube;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        xyz = scanner.nextInt();

//Определяем цифры

        x = xyz / 100;
        y = xyz / 10 - x * 10;
        z = xyz - x * 100 - y * 10;

//проверяем условие задачи

        digitsCube = Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3);

        if (xyz*xyz == digitsCube) {
            System.out.println("Условие задачи выполнено");
        }
        else {
            System.out.println("Условие задачи не выполнено");
        }

    }

}