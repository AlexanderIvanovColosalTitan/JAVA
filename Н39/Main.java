
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(numMax(num) > num){
            System.out.println(numMax(num));
        } else {
            System.out.println(-1);
        }
    }
    public static int numMax(int num){
        int[] arr = new int[10];
        String str = Integer.toString(num);
        for(int i= 0; i < str.length();i++){
            arr[str.charAt(i)-'0']++;

        }
        int max = 0;
        int compos = 1;
        for (int i = 0; i < 10; i++){
            while (arr[i] > 0) {
                max = max + (i * compos);
                arr[i]--;
                compos = compos * 10;
            }
        }
        return max;
    }

}