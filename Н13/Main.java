import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int i = 0;
        if(num1 < num2){
            if(num2 < num3){
                while(i < num3){
                    System.out.println(num1);
                    i++;
                    num1 += num2;

                }
            }

        }

    }
}