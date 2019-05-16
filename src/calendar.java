import java.util.Scanner;

public class calendar {
    private static int dayOfWeek(int y, int m, int d) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        y -= (m < 3) ? 1 : 0;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    public static void main(String[] args) {
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year and number of month (1-12) space separated: ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(months[m - 1]);
        System.out.println(" M    T    W    T    F    S    S");
        int day = dayOfWeek(y, m, 1);
        for (int j = 0; j < day - 1; j++) {
            System.out.print("     ");
        }
        int count = 7 - day + 1;
        for (int i = 1; i <= daysInMonths[m - 1]; i++) {
            if(count == 0){
                System.out.println();
                count = 7;
            }
            if(String.valueOf(i).length() == 1)
                System.out.print(" "+i+"   ");
            else
                System.out.print(i+"   ");
            day = 0;
            count--;
        }
    }
}
