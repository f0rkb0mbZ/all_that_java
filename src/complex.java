public class complex {
    double real;
    double imaginary;

    private complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    private complex(double re, double im) {
        this.real = re;
        this.imaginary = im;
    }

    public complex add(complex a) {
        complex c = new complex();
        c.real = this.real + a.real;
        c.imaginary = this.imaginary + a.imaginary;
        return c;
    }

    public complex subtract(complex a) {
        complex c = new complex();
        c.real = this.real - a.real;
        c.imaginary = this.imaginary - a.imaginary;
        return c;
    }

    public complex multiply(complex a) {
        complex c = new complex();
        c.real = (this.real * a.real) - (this.imaginary * a.imaginary);
        c.imaginary = (this.imaginary * a.real) + (this.real * a.imaginary);
        return c;
    }

    private void show() {
        if (this.imaginary < 0.0)
            System.out.println(this.real + " - " + this.imaginary + "i");
        else
            System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        complex a = new complex(1.0, 2.0);
        complex b = new complex(3.0, 0.5);
        System.out.print("a: ");
        a.show();
        System.out.print("b: ");
        b.show();
        complex c = a.add(b);
        complex d = a.subtract(b);
        complex e = a.multiply(b);
        System.out.print("addition: ");
        c.show();
        System.out.print("subtraction: ");
        d.show();
        System.out.print("multiplication: ");
        e.show();
    }
}
