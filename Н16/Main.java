import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        String str = string.nextLine();
        String[] str2 = str.split("");
        int y = 0;
        for(int i = 0; i <  str2.length;i++){
            if(str2[i].equals(str2[i].toUpperCase())) {y++;
            }
            if(y > str2.length - y) {
                str = str.toUpperCase();
            }
            else {
                str = str.toLowerCase();
            }

        }
        System.out.println(str);

    }
}