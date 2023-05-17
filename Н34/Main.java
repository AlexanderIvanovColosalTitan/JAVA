import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] str = new String[] {"56", "65", "74", "100", "99", "68", "86", "180", "90"};
        for(int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(str, Comparator.comparingInt(Main::sum_of_digits));
        for(String i: str){
            System.out.print(i + " ");
        }
    }
    public static int sum_of_digits(String numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length(); ++i) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }
        return sum;

    }
}