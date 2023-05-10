import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        var worker = in.nextInt();
        int i = 0;

        if (worker < 2) {
            if(worker==1){i++;
                list.add("true");
            } else {
                list.add("false");
            }

        }

        while (worker < 2){
            worker = in.nextInt();
            if (worker == 1){i++;
                list.add("true");
            } else {
                list.add("false");

            }
        }
        int index = list.size() - 1;
        list.remove(index);
        System.out.println(list + "\n" + "Количество работников: " + i);

    }

}