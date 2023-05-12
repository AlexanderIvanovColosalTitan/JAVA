import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(9) + 1;
        int b = random.nextInt(9) + 1;
        int c = random.nextInt(9) + 1;
        if((a+b)>c && (b+c)>a && (a+c)>b){
            double S = square(a,b,c);
            System.out.println("Стороны треугольника => " + a + " " + b + " " + c);
            System.out.println("Площадь => " + S);

        }
    }
    public static double square(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}