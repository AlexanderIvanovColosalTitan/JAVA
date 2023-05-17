import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] code = new int[4];
        for(int i = 0; i < 4; ++i) {
            code[i] = (int) (Math.random() * 10);
        }
        for(int j = 0; j < 20; j++) {
            int[] uncode = new int[4];
            int count = 0;
            for(int i = 0; i < 4; ++i) {
                uncode[i] = scanner.nextInt();
                if (uncode[i] == code[i]) {
                    count++;
                }
            }
            if(count == 4) {
                System.out.print("Код верный");
                return;
            }
            System.out.print("Кол-во совпадений: " + count);

        }
    }
}