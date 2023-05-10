import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args){

        String str = line("abc abc ab abc ab acs acs");
        System.out.println(str);
    }
    
    public static String line(String str){
        String string="";
        String[] array=str.split(" ");

        LinkedHashSet<String> spisok = new LinkedHashSet<String>();
        for (int i = 0; i < array.length; i++) {
            spisok.add(array[i]);
        }
        for(String s:spisok){
            string=string+s+" ";
        }

        return string;

    }

}