//Написать программу, которая проверяет, делится ли на три введённое с
//клавиатуры целое число. Ниже приведён возможный вид экрана программы во
//время её работы (Данные, вводимые пользователем, выделены полужирным
//шрифтом).
//-> 451
//Число 451 нацело на три не делится.


import java.util.Scanner;

public class DivisionByThree {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для проверки: ");

        a = scanner.nextInt();
        b = a / 3;
        c = b * 3;

        if (c == a) {
            System.out.println("Число " + a + " делится на три");
        } else {
            System.out.println("Число " + a + " не делится на три");
        }
    }
}
