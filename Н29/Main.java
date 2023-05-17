import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int int_num1 = Integer.parseInt(num1.trim());
        int num2 = scan.nextInt() - 1;
        int sum = 0;
        String[] nums = num1.split("");
        for(int i = 0; i < nums.length; i++){
            num2++;
            int n = Integer.parseInt(nums[i].trim ());
            sum += Math.pow(n,num2);
        }

        if(sum % int_num1 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}