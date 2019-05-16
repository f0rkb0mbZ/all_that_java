import java.util.Scanner;

public class sumNumbers {
    public static int sumofNumbers(String str) {
        int sum = 0;
        str += "\0";
        String tempint = "0";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                tempint += ch;
            } else {
                sum += Integer.parseInt(tempint);
                tempint = "0";
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        int sum = sumNumbers.sumofNumbers(text);
        System.out.println(sum);
    }
}
