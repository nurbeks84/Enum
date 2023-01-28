import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String forDays = in.nextLine().toUpperCase();
        if (forDays.equals(Week.MONDAY.name())){
            System.out.println(Week.MONDAY.days);
        }else if (forDays.equals(Week.TUESDAY.name())) {
            System.out.println(Week.TUESDAY.days);
        } else if (forDays.equals(Week.WEDNESDAY.name())) {
            System.out.println(Week.WEDNESDAY.days);
    } else if (forDays.equals(Week.THURSDAY.name())){
            System.out.println(Week.THURSDAY.days);
        } else if (forDays.equals(Week.FRIDAY.name())) {
            System.out.println(Week.FRIDAY.days);
        } else if (forDays.equals(Week.SATURDAY.name())) {
            System.out.println(Week.SATURDAY.days);
        } else if (forDays.equals(Week.SUNDAY.name())) {
            System.out.println(Week.SUNDAY.days);
        }
    }
}