//10) Написать программу решения уравнения ax3 + bх = 0 для произвольных а, b.
//x2=-b/a

public class Equation {
    public static void main(String[] args) {

        double a =1;//не равно 0
        double b=-4;
        double x;

        x=Math.sqrt(-b/a);

        System.out.println(x);

    }
}
