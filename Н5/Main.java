import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list;
        String string;
        String[] newstring;
        Scanner scan = new Scanner(System.in);
        string = scan.nextLine();
        newstring = string.split(" ");
        list = new int[newstring.length];
        int y = 0;
        for (int i = 0; i < newstring.length; i++){

            list[i] =  Integer.parseInt(newstring[i]);
            int t = list[i] * list[i];
            y += t;

        }
        System.out.println(y);

    }


}