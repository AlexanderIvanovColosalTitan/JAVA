import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size1 = 4;
        int size2 = 4;

        int[][] matrix2 = new int[size1][size2];

        System.out.println("Начальная матрица");

        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                matrix2[j][i] = random.nextInt(10);
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Измененная матрица");

        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }




    }

}