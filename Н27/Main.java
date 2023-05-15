import java.util.Scanner;

public class Main {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static char right(char symbol, int indent){
        return alphabet.charAt((alphabet.indexOf(symbol)+indent) % alphabet.length());
    }
    private static char left(char symbol, int indent){
        if (alphabet.indexOf(symbol)-indent < 0){
            return alphabet.charAt(alphabet.length() + (alphabet.indexOf(symbol) - indent));
        } else {
            return alphabet.charAt(alphabet.indexOf(symbol)-indent);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Введите направление сдвига(l или r):");
        String direction = scan.nextLine();
        int num = scan.nextInt();
        char str1 = ' ';
        for (int j = 0; j < str.length(); j++) {
            for(int i=0;i < num+1;i++) {
                if (direction.equals("l")){
                    str1 = left(str.charAt(j), i);

                }
                if (direction.equals("r")){
                    str1 = right(str.charAt(j), i);

                }
            }
            System.out.print(str1);

        }
    }
}