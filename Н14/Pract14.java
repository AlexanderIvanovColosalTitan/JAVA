package Pract14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int[][] array;
    public Main(int size) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите элементы ячеек");
        array = new int[size][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = s.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array));
    }
    public int[][] array1(){
        Scanner s = new Scanner(System.in);


        int num = s.nextInt();
        int min = Integer.MAX_VALUE;
        int I = -1;
        int J = -1;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < 3;j++){
                if(array[i][j] < min){
                    min = array[i][j];
                    I = i;
                    J = j;

                }
            }
        }
        array[I][J] = num;
        return array;

    }
}
