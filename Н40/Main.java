import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        int N = rand.nextInt(20);
        ArrayList<Integer> arrayList = new ArrayList<>(rand.nextInt(20));
        while (arrayList.size() < N) {
            int i = rand.nextInt(60) - 30;
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        int[] randomArray = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray) + "\n" + range(randomArray));
    }
    static String range(int[] array) {
        StringBuilder box = new StringBuilder();
        int min = array[0];
        int max = array[0];
        for (int i : array){
            if ( max == i ){
                continue;
            }
            if(Math.abs(max-i) > 1){
                if(box.length() > 1){
                    box.append(",");
                }
                box.append(max == min ? min : min + "-" + max);
                min = i;
                max = i;
            } else{
                max = i;
            }
        }
        if (box.length() > 1){
            box.append(",");
        }
        box.append(max == min ? min : min + "-"+max);

        return box.toString();
    }
}