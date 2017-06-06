//Написать программу для вычисления стоимости покупки с учетом скидки.
//Скидка в 3% предоставляется, если сумма покупки больше 500 руб, в 5% — если
//сумма больше 1000 руб. Ниже приведён возможный вид экрана во время
//выполнения такой программы (Данные, вводимые пользователем, выделены
//полужирным шрифтом).
//Вычисление стоимости покупки с учетом скидки.
//-> 640
//Вам предоставляется скидка 3%
//Сумма с учетом скидки: 620.80 руб.

import java.util.Scanner;

public class StepDiscount {
    public static void main(String[] args) {

        double userPrice = 0;
        double myDiscount = 0;
        double myPrice = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите стоимость товара: ");
        userPrice = scanner.nextDouble();

        if (userPrice>1000) {
            myDiscount = 0.05;
        }
        else if (userPrice>500){
            myDiscount = 0.03;
        }
        else {
            myDiscount = 0;
        }

        myPrice = userPrice*(1-myDiscount);

        if (myDiscount==0) {
            System.out.println("Скидка не предоставляется. Стоимость товара: " + myPrice + " грн");
        }
        else{
            System.out.println("Вам предоставлена скидка: " + 100*myDiscount + "%");
            System.out.println("Стоимость товара с учетом скидки " + myPrice+" грн" );
        }

    }
}
