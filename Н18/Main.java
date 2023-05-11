import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = new int[] {1,2,3,8,7,6,5};
        int[] array_left = leftArray(array);
        int[] array_right = rightArray(array);
        System.out.println("Начальный массив " + Arrays.toString(array));
        System.out.println(Arrays.toString(array_left) + "\n" + Arrays.toString(array_right));

    }
    public static int[] leftArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == Arrays.stream(array).max().getAsInt()){
                array = Arrays.copyOf(array,i);

            }
        }
        return array;

    }
    public static int[] rightArray(int[] arr){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == Arrays.stream(arr).max().getAsInt()){
                idx = i;
            }
        }
        int[] t = Arrays.copyOfRange(arr, idx+1, arr.length);
        return t;
    }
}