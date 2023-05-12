import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();

        int sum = 0;
        for(int i = 1; i <= num1;i++){
            if(i % num2 == 0||i % num3 == 0){
                sum += i;

            }
        }
        System.out.println(sum);

    }
}