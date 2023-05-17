import java.util.*;

public class Main {
    private static final Deque<Integer> indexes = new LinkedList<>();
    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] ts = {58, 57, 56, 55, 50};
        int num = 163;
        int sum = choose_best_sum(num,3, ts);
        if(Collections.min(list) < num){
            for (int i = 0; i < 5; i++) {
                System.out.print(ts[i] + " ");
            }
            System.out.println("\n" + sum);
        }
    }

    public static int choose_best_sum(int num, int size, int[] array) {
        int sum = 0;
        if (indexes.size() == size) {
            for (Integer i : indexes) {
                sum +=array[i];
            }
            if(num <= sum) {
                sum = num;
                list.add(sum);
            }
            list.add(sum);
        }
        for (int i = 0; i < array.length; i++) {
            if (!indexes.contains(i)) {
                indexes.addLast(i);
                choose_best_sum(num, size,array);
                indexes.removeLast();
            }
        }
        return Collections.max(list);

    }
}