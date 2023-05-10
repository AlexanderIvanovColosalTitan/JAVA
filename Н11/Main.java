import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        String str = string.nextLine();
        String[] chars = new String[] {"а","е","ё","и","о","у","ы","э","ю","я"};
        for(int i = 0; i < chars.length; i++){
            str = str.replace(chars[i],"");
        }
        System.out.println(str);

    }

}