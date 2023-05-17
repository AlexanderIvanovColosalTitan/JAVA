import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> num_player = new ArrayList<>();
    private static final ArrayList<Integer> retired = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество игроков: ");
        int n = scanner.nextInt();
        System.out.println("Начинаем с игрока: ");
        int start = scanner.nextInt() - 1;
        for (int i = 1; i <= n; i++) {
            num_player.add(i);
        }
        for(int j = 1; j < num_player.size() + 1; j++) {
            start = element_index(start);
        }
        System.out.println(retired.toString());

    }
    public static int element_index(int del_player) {
        if (del_player >= num_player.size()) {
            while (del_player >=  num_player.size()) {
                del_player -= num_player.size();
            }
        }
        retired.add(num_player.get(del_player));
        num_player.remove(del_player);
        return del_player + 2;
    }

}