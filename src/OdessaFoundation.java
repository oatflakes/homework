import java.util.Scanner;

//Написать программу для проверки знания даты основания Одессы. В случае
//неправильного ответа пользователя, программа должна выводить правильный
//ответ. Ниже приведён возможный вид экрана во время выполнения такой
//программы (Данные, вводимые пользователем, выделены полужирным
//шрифтом).


public class OdessaFoundation {
    public static void main (String[] args){
        int yearCity = 1794;
        int q = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("В каком году была основана Одесса?");
        q=scanner.nextInt();

        if (q == yearCity) {
            System.out.println("Правильно!");
        }
        else if (q>yearCity){
            System.out.println("Неправильно, Одесса была основана раньше - в " + yearCity + " году");
        }
        else {
            System.out.println("Неправильно, Одесса была основана позже - в " + yearCity + " году");
        }
    }
}
