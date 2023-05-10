import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        double[] tr = new double[3];
        for (int i = 0; i < 3;i++){
            tr[i] = n.nextInt();
            if (tr[0] + tr[1] > tr[2] & tr[1] + tr[2] > tr[0] & tr[0] + tr[2] > tr[1]){
                System.out.println("Составить треугольник возможно");
                double cos1 = (tr[0]*tr[0] + tr[1]*tr[1] - tr[2]*tr[2])/(2*tr[0]*tr[1]);
                double cos2 = (tr[1]*tr[1] + tr[2]*tr[2] - tr[0]*tr[0])/(2*tr[1]*tr[2]);
                double cos3 = (tr[0]*tr[0] + tr[2]*tr[2] - tr[1]*tr[1])/(2*tr[0]*tr[2]);
                double[] integers = new double[] {cos1,cos2,cos3};
                double max = Arrays.stream(integers).max().getAsDouble();
                double degrees = Math.acos(max);
                System.out.println(180 - degrees*180.0d/Math.PI);


            }

        }


    }

}