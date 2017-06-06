//Написать программу для вычисления стоимости разговора по телефону с
//учетом 20% скидки, предоставляемой по субботам и воскресеньям. Ниже
//приведён возможный вид экрана программы во время её работы (Данные,
//вводимые пользователем, выделены полужирным шрифтом).
//Вычисление стоимости разговора по телефону.
//Введите исходные данные:
//Длительность разговора (целое количество минут) -> 3
//День недели (1 — понедельник, ... 7 — воскресенье) -> б
//Предоставляется скидка 20%.
//Стоимость разговора: 5.52 грн.

import java.util.Scanner;

public class MobileDiscount {
    public static void main(String[] args) {

        int duration, weekday;
        double discount = 0, sum;
        String dClaim = "Скидка не предоставляется";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходные данные:");
        System.out.println("Длительность разговора (целое количество минут) ->");
        duration = scanner.nextInt();
        System.out.println("День недели (1 — понедельник, ... 7 — воскресенье) ->");
        weekday = scanner.nextInt();

        if (weekday > 5 && weekday < 8) {
            discount = 0.2;
            dClaim = "Предоставляется скидка " + 100 * discount + "%";
        }

        sum = 5.52 * duration * (1 - discount);

        System.out.println(dClaim);
        System.out.println("Стоимость разговора " + sum + " грн");
    }
}
