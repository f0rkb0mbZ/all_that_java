class fiveInt {
    int[] arr = new int[5];

    fiveInt() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = 0;
        }
    }

    fiveInt(int a, int b, int c, int d, int e) {
        this.arr[0] = a;
        this.arr[1] = b;
        this.arr[2] = c;
        this.arr[3] = d;
        this.arr[4] = e;
    }

    void showall() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void sort() {
        int n = this.arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j]  > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}

public class sortFive {
    public static void main(String[] args) {
        if (args.length < 5){
            System.out.println("Usage: java sortFive <five_space_separated_integers>");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        fiveInt arr = new fiveInt(a, b, c, d, e);
        System.out.println("\nBefore sorting: ");
        arr.showall();
        arr.sort();
        System.out.println("\nAfter sorting: ");
        arr.showall();
    }
}
