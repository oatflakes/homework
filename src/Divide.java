import java.util.Scanner;

//Написать программу которая вычисляет частное двух чисел.
//Программа должна проверять правильность введенных пользователем данных и,
//если они неверные (делитель равен нулю), выдавать сообщение об ошибке.

public class Divide {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите делимое");
        a=scanner.nextDouble();

        System.out.println("Введите делитель, неравный нулю");
        b=scanner.nextDouble();

        if (b==0) {
            System.out.println("Ошибка, на ноль делить нельзя");
        }
        else {
            System.out.println("Результат деления: " + a/b);
        }

    }
}
