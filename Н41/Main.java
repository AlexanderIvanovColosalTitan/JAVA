import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(time(num));
    }
    public static String time(int num) {
        int year = num / 31536000;
        num -= year * 31536000;
        int month = num / 2592000;
        num -= month * 2592000;
        int week = num / 604800;
        num -= week * 604800;
        int day = num / 86400;
        num -= day * 86400;
        int hour = num / 3600;
        num -= hour * 3600;
        int min = num / 60;
        num -= min * 60;

        StringBuilder strBox = new StringBuilder();
        if (year > 0) {
            strBox.append(endingNumber(year, "год", "года", "лет"));}
        if (month > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(month, "месяц", "месяца", "месяцев"));}
        if (week > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(week, "неделя", "недели", "недель"));}
        if (day > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(day, "день", "дня", "дней"));}
        if (hour > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(hour, "час", "часа", "часов"));}
        if (min > 0) {
            appendСomma(strBox);
            strBox.append(endingNumber(min, "минута", "минуты", "минут"));}
        if (num > 0) {
            appendAnd(strBox);
            strBox.append(endingNumber(num, "секунда", "секунды", "секунд"));}
        return strBox.toString();
    }
    static void appendСomma(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }
    static void appendAnd(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(" и ");
        }
    }
    static String endingNumber(int num, String... arr) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return String.format("%d %s", num, arr[2]);
        }

        int lastDigit = num % 10;
        switch (lastDigit) {
            case 1:
                return String.format("%d %s", num, arr[0]);
            case 2:
            case 3:
            case 4:
                return String.format("%d %s", num, arr[1]);
            default:
                return String.format("%d %s", num, arr[2]);
        }
    }
}