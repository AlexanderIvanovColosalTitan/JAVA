public class Main {
    public static void main(String[] args){
        int func = func(555);
        System.out.println(func);

    }
    public static int func(int num){
        int count = 0;
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            while(num % 2 == 0){
                num/=2;
            }
            if(num % 3 > 0){count++;
                num-=2;
            }
        }
        if(num % 3 >= 0){
            while(num % 3 >= 0){count++;
                num-=2;
            }
        }
        if(num == 1){count++;
        }

        return count;

    }
}