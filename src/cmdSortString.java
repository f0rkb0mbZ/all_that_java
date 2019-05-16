public class cmdSortString {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java cmdSortString <number_of_inputs> <space_separated_input_strings>");
        } else {
            int len = Integer.parseInt(args[0]);
            String[] cities = new String[len];
            for (int i = 0; i < len; i++) {
                cities[i] = args[i + 1];
            }

            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (cities[i].compareTo(cities[j]) > 0) {
                        String temp = cities[j];
                        cities[j] = cities[i];
                        cities[i] = temp;
                    }
                }
            }
            System.out.println("The strings sorted alphabetically are: ");
            for (int i = 0; i < len; i++) {
                System.out.print(cities[i] + "    ");
            }
        }
    }
}
