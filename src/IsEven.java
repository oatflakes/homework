import java.util.Scanner;

//Написать программу, которая проверяет, является ли введённое
//пользователем целое число четным. Ниже приведён возможный вид экрана
//программы во время выполнения такой программы (Данные, вводимые
//пользователем, выделены полужирным шрифтом).
//Введите целое число и нажмите <Enter>
//-> 23
//Число 23 — нечетное.

public class IsEven {
    public static void main(String[] args) {

        int a=0;
        int b=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для проверки: ");
        a=scanner.nextInt();
        b=a/2;

        //System.out.println(b);

        if (b*2==a){
            System.out.println("Число "+a+" четное");
        }
        else{
            System.out.println("Число "+a+" нечетное");
        }
    }
}
