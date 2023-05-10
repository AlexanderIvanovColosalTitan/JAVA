import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        boolean number = number(66);
        System.out.println(number);

    }
    public static boolean number(int x){
        int i = 2;
        while (x % i != 0){i++;
        }
        if (i == x){
            return true;
        }
        return false;





    }

}