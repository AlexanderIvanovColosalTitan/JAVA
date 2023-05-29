
import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) {
        int[] pir =
                {3,
                        7, 4,
                        2, 4, 6,
                        8, 5, 9, 3
                };

        System.out.println("Max. summ.: " + findingMaxSumm(pir, 4));
    }

    public static int findingMaxSumm(int[] tree, int height) {
        int[] sums = new int[height + 1];
        fill(sums , 0);
        int element = height;
        int num = element - 1;
        int[] next_elements = new int[element];
        for(int i = tree.length - 1; i > -1 ; i--) {
            int left_max_path = sums[num];
            int right_max_path = sums[num + 1];
            next_elements[num] = max(right_max_path, left_max_path) + tree[i];
            num -= 1;
            if (num == -1) {
                element--;
                num = element - 1;
                sums = next_elements;
                next_elements = new int[sums.length - 1];
            }
        }
        return sums[0];
    }
}




