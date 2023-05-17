import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args){
        fibonacci(50);
    }
    public static void fibonacci(int n){
        if( 10 <= n && n <= 100000){

            BigInteger int1 = BigInteger.ONE;
            BigInteger int2 = BigInteger.ONE;
            BigInteger num = BigInteger.ONE;
            for (int i = 2; i < n;i++) {
                num = int1.add(int2);
                int2 = int1;
                int1 = num;
            }
            System.out.println(int1);
            int[] intTab = String.valueOf(int1).chars().map(Character::getNumericValue).toArray();
            HashMap<Integer, Integer> counting = new HashMap<>();
            for(int j : intTab) {
                if (counting.containsKey(j)){
                    counting.put(j, counting.get(j) + 1);
                }else{
                    counting.put(j, 1);
                }
            }
            int maxKey = 0;
            int maxVal = 0;
            for (Map.Entry<Integer, Integer> couples : counting.entrySet()) {
                if(couples.getValue() > maxVal){
                    maxVal = couples.getValue();
                }
                if(couples.getValue() == maxVal){
                    maxKey = couples.getKey();
                }
            }
            System.out.println(maxKey + " " + maxVal);

        }
    }
}