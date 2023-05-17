import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Александр\\Desktop\\Pract38.txt");
        Scanner sc = new Scanner(file);
        String text = "";
        while (sc.hasNextLine()) {
            text += sc.nextLine();
        }
        String[] ar = text.split(" ");
        String[] str;
        for(int i = 0; i < ar.length; i++){

            str = ar[i].split("");
            ar[i] += (str[0] + "ауч");
            ar[i] = ar[i].substring(1);
        }
        for (String j: ar){
            System.out.print(j + " ");
        }
    }
}