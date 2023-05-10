import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float mtrx[][] = new float[3][2];
        int n = 1;
        for(int i = 0; i < 3; i++){
            System.out.println("Введите координаты " + n + " вершины треугольника");
            n++;
            for(int j = 0; j < 2; j++){
                mtrx[i][j] = in.nextInt();
            }
        }
        System.out.println("Барицентр треугольника \n" + "{" + (mtrx[0][0] + mtrx[1][0] + mtrx[2][0])/3 + ","+ (mtrx[0][1] + mtrx[1][1] + mtrx[2][1])/3 + "}");
    }
}