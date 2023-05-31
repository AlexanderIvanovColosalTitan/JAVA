import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int num_a = Integer.parseInt(a);
        int num_b = Integer.parseInt(b);
        int sum = num_a + num_b;
        System.out.println("" + sum);

    }
}