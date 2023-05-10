import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();
        boolean str = first.endsWith(second);
        System.out.println(str);
    }




}