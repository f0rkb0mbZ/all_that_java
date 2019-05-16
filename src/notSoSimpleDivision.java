public class notSoSimpleDivision {
    public static void main(String[] args) {
        if (args.length < 1)
            System.out.println("Usage: java notSoSimpleDivision dividend(int) divisor(int)");
        else {
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            int quotient = -1;
            int remainder = 0;
            try {
                quotient = dividend / divisor;
                remainder = dividend % divisor;
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
            } finally {
                if(quotient == -1)
                    System.out.println("Exception occurred!");
                else
                    System.out.println("Quotient: "+quotient+" Remainder: "+remainder);
            }
        }
    }
}
