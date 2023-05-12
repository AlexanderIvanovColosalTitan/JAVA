import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < num.length; i++){
            num1 = Integer.parseInt(num[0]);
            num2 = Integer.parseInt(num[1]);
        }
        for(int x1 = num1; x1 <= num2; x1++){
            List<Integer> nums = new ArrayList();
            for(int i = 2; i < num.length; i++){
                int x = Integer.parseInt(num[i].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    if(num[i].equals(str)){
                        nums.add(x1);
                    }
                }
            }
            Set<Integer> set = new HashSet(nums);
            nums.clear();
            nums.addAll(set);
            for(int g : set){
                sum += g;
            }
        }
        System.out.println(sum);

    }
}