public class Main {
    public static void main(String[] args){
        boolean line = cor("(())(()))");
        System.out.println(line);
    }
    public static boolean cor(String str){
        while (str.contains("()")) {
            str = str.replaceAll("\\(\\)", "");
        }
        return (str.length() == 0);
    }
}