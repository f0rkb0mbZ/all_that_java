1. A) Write a program to show the  numbers which are  prime in a given range using command line
  argument.

  ### Code:

  > ```java
  > /*
  > Prime Number finder program in java using the "Sieve of Eratosthenes" algorithm.
  > */
  > 
  > public class primeRange {
  >     public static void main(String[] args) {
  >         if (args.length < 2) {
  >             System.out.println("Usage: java primeRange <start> <end>");
  >             System.exit(0);
  >         } else {
  >             int srange = Integer.parseInt(args[0]);
  >             int erange = Integer.parseInt(args[1]);
  > 
  >             int len = erange + 1;
  >             boolean[] primes = new boolean[len];
  > 
  >             for (int i = 0; i < len; i++) {
  >                 primes[i] = true;
  >             }
  > 
  >             for (int p = 2; p * p <= erange; p++) {
  >                 if (primes[p]) {
  >                     for (int i = 2 * p; i <= erange; i += p) {
  >                         primes[i] = false;
  >                     }
  >                 }
  >             }
  > 
  >             for (int i = srange; i <= erange; i++) {
  >                 if (primes[i]) {
  >                     System.out.print(i + "\t");
  >                 }
  >             }
  >         }
  >     }
  > }
  > ```

  ### Output: 

  ```bash
  $ java primeRange 5 20
  5       7       11      13      17      19
  ```

  B) Take a String as input using command line argument and now check whether it is a palindrome or not.

  ### Code:

  > ```java
  > /*
  > Palindrome checker program using character array and for loop, no string reverse functions used!
  > */
  > 
  > public class palindromeFinder {
  >     private static boolean isPalindrome(String s) {
  >         char[] ch = s.toCharArray();
  >         char[] revch = new char[ch.length];
  >         int count = 0;
  >         for (int i = ch.length - 1; i >= 0; i--) {
  >             revch[count] = ch[i];
  >             count++;
  >         }
  >         String revs = new String(revch);
  >         return s.equals(revs);
  >     }
  > 
  >     public static void main(String[] args) {
  >         if (args.length < 1) {
  >             System.out.println("Usage: java palindromeFinder <string>");
  >         } else {
  >             String str = args[0];
  >             if (isPalindrome(str))
  >                 System.out.println("String is palindrome!");
  >             else
  >                 System.out.println("String is not palindrome!");
  >         }
  >     }
  > }
  > 
  > ```

  ### Output:

  ```bash
  $ java palindromeFinder racecar
  String is palindrome!
  ```

2. Write a program to arrange a set of integer numbers in ascending order where input will be taken through command line argument.

   ### Code:

   > ```java
   > /*
   > A java program to implement quicksort in ascending order with command line argument array input
   > Usage: java cmdQwikSort <array_length> <space_separated_array>
   >  */
   > import java.lang.System;
   > 
   > public class cmdQwikSort {
   >     private static int partition(int[] arr, int s, int e) {
   >         int pivot = arr[e];
   >         int partindex = s;
   >         for (int i = s; i < e; i++) {
   >             if (arr[i] <= pivot) {
   >                 //swap
   >                 int temp = arr[i];
   >                 arr[i] = arr[partindex];
   >                 arr[partindex] = temp;
   >                 partindex += 1;
   >             }
   >         }
   >         //swap pivot
   >         int temp = arr[partindex];
   >         arr[partindex] = arr[e];
   >         arr[e] = temp;
   > 
   >         return partindex;
   >     }
   > 
   >     private static void qsort(int[] arr, int s, int e) {
   >         if (s < e) {
   >             int pindex = partition(arr, s, e);
   >             qsort(arr, s, pindex - 1);
   >             qsort(arr, pindex + 1, e);
   >         }
   >     }
   >     public static void main(String[] args) {
   >         if(args.length < 1){
   >             System.out.println("Usage: java cmdQwikSort <array_length> <space_separated_array>");
   >             System.exit(0);
   >         }
   >         int len = Integer.parseInt(args[0]);
   >         int[] arr = new int[len];
   >         for (int i = 0; i < len; i++) {
   >             arr[i] = Integer.parseInt(args[i + 1]);
   >         }
   >         System.out.println("The un-sorted array: ");
   >         for (int i = 0; i < arr.length; i++) {
   >             System.out.print(arr[i] + "\t");
   >         }
   >         System.out.println();
   >         qsort(arr, 0, len - 1);
   > 
   >         System.out.println("The sorted array: ");
   >         for (int i = 0; i < arr.length; i++) {
   >             System.out.print(arr[i] + "\t");
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java cmdQwikSort 8 3 4 1 9 0 4 5 7
   The un-sorted array:
   3       4       1       9       0       4       5       7
   The sorted array:
   0       1       3       4       4       5       7       9
   ```

3. Write a program to accept the following city names as argument in the command line and sort them in alphabetic order.

   ### Code:

   > ```java
   > public class cmdSortString {
   >     public static void main(String[] args) {
   >         if (args.length < 1) {
   >             System.out.println("Usage: java cmdSortString <number_of_inputs> <space_separated_input_strings>");
   >         } else {
   >             int len = Integer.parseInt(args[0]);
   >             String[] cities = new String[len];
   >             for (int i = 0; i < len; i++) {
   >                 cities[i] = args[i + 1];
   >             }
   > 
   >             for (int i = 0; i < len; i++) {
   >                 for (int j = i + 1; j < len; j++) {
   >                     if (cities[i].compareTo(cities[j]) > 0) {
   >                         String temp = cities[j];
   >                         cities[j] = cities[i];
   >                         cities[i] = temp;
   >                     }
   >                 }
   >             }
   >             System.out.println("The strings sorted alphabetically are: ");
   >             for (int i = 0; i < len; i++) {
   >                 System.out.print(cities[i] + "    ");
   >             }
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java cmdSortString 6 Kolkata Chennai Mumbai Delhi Bangalore Ahmedabad
   The strings sorted alphabetically are:
   Ahmedabad    Bangalore    Chennai    Delhi    Kolkata    Mumbai
   ```

4. Write a program to print the days of a month using two static arrays.

   ### Code:

   > ```java
   > import java.util.Scanner;
   > 
   > public class calendar {
   >     private static int dayOfWeek(int y, int m, int d) {
   >         int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
   >         y -= (m < 3) ? 1 : 0;
   >         return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
   >     }
   > 
   >     public static void main(String[] args) {
   >         String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
   >                 "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
   >         int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   >         Scanner sc = new Scanner(System.in);
   >         System.out.print("Enter the year and number of month (1-12) space separated: ");
   >         int y = sc.nextInt();
   >         int m = sc.nextInt();
   >         System.out.println(months[m - 1]);
   >         System.out.println(" M    T    W    T    F    S    S");
   >         int day = dayOfWeek(y, m, 1);
   >         for (int j = 0; j < day - 1; j++) {
   >             System.out.print("     ");
   >         }
   >         int count = 7 - day + 1;
   >         for (int i = 1; i <= daysInMonths[m - 1]; i++) {
   >             if(count == 0){
   >                 System.out.println();
   >                 count = 7;
   >             }
   >             if(String.valueOf(i).length() == 1)
   >                 System.out.print(" "+i+"   ");
   >             else
   >                 System.out.print(i+"   ");
   >             day = 0;
   >             count--;
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java calendar
   Enter the year and number of month (1-12) space separated: 2019 5
   MAY
    M    T    W    T    F    S    S
              1    2    3    4    5
    6    7    8    9   10   11   12
   13   14   15   16   17   18   19
   20   21   22   23   24   25   26
   27   28   29   30   31
   ```

5. A) Write a program on  2d-array to print the following pattern –

   ​	   1

   ​       1 0

   ​       1 0 1

   ​       1 0 1 0

   ### Code:

   > ```java
   > import java.util.Scanner;
   > 
   > public class binPattern {
   >     public static void main(String[] args) {
   >         Scanner sc = new Scanner(System.in);
   >         System.out.print("Enter the number of lines you want to print: ");
   >         int n = sc.nextInt();
   >         for (int i = 0; i < n; i++) {
   >             for (int j = 0; j <= i; j++) {
   >                 System.out.print((j+1)%2 + " ");
   >             }
   >             System.out.println();
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java binPattern
   Enter the number of lines you want to print: 4
   1
   1 0
   1 0 1
   1 0 1 0
   ```

   B) Write a java program on 2d-array to print

   ​         *

   ​         **

   ​         ***

   ​         …………………… up to n. where n will be User Input, taken from command line argument.

   ### Code:

   > ```java
   > public class starPattern {
   >     public static void main(String[] args) {
   >         int n = Integer.parseInt(args[0]);
   >         for (int i = 0; i < n; i++) {
   >             for (int j = 0; j <= i; j++) {
   >                 System.out.print("*");
   >             }
   >             System.out.println();
   >         }
   > 
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java starPattern 5
   *
   **
   ***
   ****
   *****
   ```

6. Write a program to compute perimeter of class Circle, Rectangle, Square using parameterized constructor with command line argument.

   ### Code:

   > ```java
   > import java.lang.Math;
   > 
   > class perimFuncs {
   >     float radius;
   >     float side;
   >     float height;
   >     float width;
   > 
   >     public float circlePerim() {
   >         return 2 * (float) Math.PI * this.radius;
   >     }
   > 
   >     public float rectPerim() {
   >         return 2 * (this.height + this.width);
   >     }
   > 
   >     public float sqPerim() {
   >         return 4 * this.side;
   >     }
   > 
   >     perimFuncs(float radius, float side, float height, float width) {
   >         this.radius = radius;
   >         this.side = side;
   >         this.height = height;
   >         this.width = width;
   >     }
   > }
   > 
   > public class calcPerimeter {
   >     public static void main(String[] args) {
   >         if (args.length < 4) {
   >             System.out.println("Usage: java calcPerimeter <radius> <side> <height> <width>");
   >             System.exit(0);
   >         } else {
   >             float radius = Float.parseFloat(args[0]);
   >             float side = Float.parseFloat(args[1]);
   >             float height = Float.parseFloat(args[2]);
   >             float width = Float.parseFloat(args[3]);
   >             perimFuncs perim = new perimFuncs(radius, side, height, width);
   >             float perimCirc = perim.circlePerim();
   >             float perimRect = perim.rectPerim();
   >             float perimSq = perim.sqPerim();
   >             System.out.println("Perimeter of circle: " + Float.toString(perimCirc));
   >             System.out.println("Perimeter of Rectangle: " + Float.toString(perimRect));
   >             System.out.println("Perimeter of Square: " + Float.toString(perimSq));
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java calcPerimeter 5 3 4 3
   Perimeter of circle: 31.415928
   Perimeter of Rectangle: 14.0
   Perimeter of Square: 12.0
   ```

7. Write a program to calculate the area of a Rectangle, a Circle & a square with parameterized constructor using **BufferedReader** class object.

   ### Code:

   > ```java
   > import java.io.*;
   > import java.lang.Math;
   > 
   > class areaFuncs {
   >     float radius;
   >     float side;
   >     float height;
   >     float width;
   > 
   >     public float circleArea() {
   >         return ((float) Math.PI * this.radius * this.radius);
   >     }
   > 
   >     public float rectArea() {
   >         return (this.height * this.width);
   >     }
   > 
   >     public float sqArea() {
   >         return (this.side * this.side);
   >     }
   > 
   >     areaFuncs(float radius, float side, float height, float width) {
   >         this.radius = radius;
   >         this.side = side;
   >         this.height = height;
   >         this.width = width;
   >     }
   > }
   > 
   > public class calcAreaBuff {
   >     public static void main(String[] args) throws IOException {
   >         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   >         System.out.print("Enter the radius: ");
   >         float radius = Float.parseFloat(br.readLine());
   >         System.out.print("Enter the side: ");
   >         float side = Float.parseFloat(br.readLine());
   >         System.out.print("Enter the height: ");
   >         float height = Float.parseFloat(br.readLine());
   >         System.out.print("Enter the width: ");
   >         float width = Float.parseFloat(br.readLine());
   >         areaFuncs area = new areaFuncs(radius, side, height, width);
   >         float areaCirc = area.circleArea();
   >         float areaRect = area.rectArea();
   >         float areaSq = area.sqArea();
   >         System.out.println("Area of circle: " + areaCirc);
   >         System.out.println("Area of Rectangle: " + areaRect);
   >         System.out.println("Area of Square: " + areaSq);
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java calcAreaBuff
   Enter the radius: 10
   Enter the side: 3
   Enter the height: 5
   Enter the width: 6
   Area of circle: 314.15927
   Area of Rectangle: 30.0
   Area of Square: 9.0
   ```

8. A) Write a program to design a class Volume and then find out the volume of a Cube, Cylinder and Ellipsoid using method overloading using **BufferedReader** class object.

   ### Code:

   > ```java
   > import java.io.*;
   > 
   > class volFuncs {
   >     float calcVolume(float side) {
   >         return (float) Math.pow(side, 3.0);
   >     }
   > 
   >     float calcVolume(float radius, float height) {
   >         return (float) Math.PI * (float) Math.pow(radius, 2.0) * height;
   >     }
   > 
   >     float calcVolume(float a, float b, float c) {
   >         return (float) ((4.0 * Math.PI * a * b * c) / 3.0);
   >     }
   > }
   > 
   > public class calcVolumeBuff {
   >     public static void main(String[] args) throws IOException {
   >         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   >         System.out.print("Enter the side of cube: ");
   >         float side = Float.parseFloat(br.readLine());
   >         System.out.print("Enter the radius of cylinder: ");
   >         float radius = Float.parseFloat(br.readLine());
   >         System.out.print("Enter the height of cylinder: ");
   >         float height = Float.parseFloat(br.readLine());
   >         System.out.print("Enter a of ellipsoid: ");
   >         float a = Float.parseFloat(br.readLine());
   >         System.out.print("Enter b of ellipsoid: ");
   >         float b = Float.parseFloat(br.readLine());
   >         System.out.print("Enter c of ellipsoid: ");
   >         float c = Float.parseFloat(br.readLine());
   >         volFuncs vol = new volFuncs();
   >         System.out.println("Volume of cube: " + vol.calcVolume(side));
   >         System.out.println("Volume of cylinder: " + vol.calcVolume(radius, height));
   >         System.out.println("Volume of ellipsoid: " + vol.calcVolume(a, b, c));
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java calcVolumeBuff
   Enter the side of cube: 3
   Enter the radius of cylinder: 10
   Enter the height of cylinder: 5
   Enter a of ellipsoid: 2
   Enter b of ellipsoid: 4
   Enter c of ellipsoid: 3
   Volume of cube: 27.0
   Volume of cylinder: 1570.7964
   Volume of ellipsoid: 100.53097
   ```

   B) Write a program to design a class Volume and then find out the volume of a Cube, Cylinder and Ellipsoid using method overloading using **command line argument.**

   ### Code:

   > ```java
   > class volFuncs {
   >     float calcVolume(float side) {
   >         return (float) Math.pow(side, 3.0);
   >     }
   > 
   >     float calcVolume(float radius, float height) {
   >         return (float) Math.PI * (float) Math.pow(radius, 2.0) * height;
   >     }
   > 
   >     float calcVolume(float a, float b, float c) {
   >         return (float) ((4.0 * Math.PI * a * b * c) / 3.0);
   >     }
   > }
   > 
   > public class calcVolumeCmd {
   >     public static void main(String[] args) {
   >         if(args.length  < 6){
   >             System.out.println("Usage: java calcVolumeCmd <side> <radius> <height> <a> <b> <c>");
   >         } else {
   >             float side = Float.parseFloat(args[0]);
   >             float radius = Float.parseFloat(args[1]);
   >             float height = Float.parseFloat(args[2]);
   >             float a = Float.parseFloat(args[3]);
   >             float b = Float.parseFloat(args[4]);
   >             float c = Float.parseFloat(args[5]);
   >             volFuncs vol = new volFuncs();
   >             System.out.println("Volume of cube: " + vol.calcVolume(side));
   >             System.out.println("Volume of cylinder: " + vol.calcVolume(radius, height));
   >             System.out.println("Volume of ellipsoid: " + vol.calcVolume(a, b, c));
   >         }
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java calcVolumeCmd 5 5 5 1 1 1
   Volume of cube: 125.0
   Volume of cylinder: 392.6991
   Volume of ellipsoid: 4.1887903
   ```

9. Create a class named complex with data members as real and imaginary. Overload three   constructors to initialize the data members (i.e. default, normal, and through object initialization). Provide methods which returns object of the complex class as the result     for addition, subtraction, multiplication of two complex numbers.

   ### Code:

   > ```java
   > public class complex {
   >     double real;
   >     double imaginary;
   > 
   >     private complex() {
   >         this.real = 0.0;
   >         this.imaginary = 0.0;
   >     }
   > 
   >     private complex(double re, double im) {
   >         this.real = re;
   >         this.imaginary = im;
   >     }
   > 
   >     public complex add(complex a) {
   >         complex c = new complex();
   >         c.real = this.real + a.real;
   >         c.imaginary = this.imaginary + a.imaginary;
   >         return c;
   >     }
   > 
   >     public complex subtract(complex a) {
   >         complex c = new complex();
   >         c.real = this.real - a.real;
   >         c.imaginary = this.imaginary - a.imaginary;
   >         return c;
   >     }
   > 
   >     public complex multiply(complex a) {
   >         complex c = new complex();
   >         c.real = (this.real * a.real) - (this.imaginary * a.imaginary);
   >         c.imaginary = (this.imaginary * a.real) + (this.real * a.imaginary);
   >         return c;
   >     }
   > 
   >     private void show() {
   >         if (this.imaginary < 0.0)
   >             System.out.println(this.real + " - " + this.imaginary + "i");
   >         else
   >             System.out.println(this.real + " + " + this.imaginary + "i");
   >     }
   > 
   >     public static void main(String[] args) {
   >         complex a = new complex(1.0, 2.0);
   >         complex b = new complex(3.0, 0.5);
   >         System.out.print("a: ");
   >         a.show();
   >         System.out.print("b: ");
   >         b.show();
   >         complex c = a.add(b);
   >         complex d = a.subtract(b);
   >         complex e = a.multiply(b);
   >         System.out.print("addition: ");
   >         c.show();
   >         System.out.print("subtraction: ");
   >         d.show();
   >         System.out.print("multiplication: ");
   >         e.show();
   >     }
   > }
   > ```

   ### Output:

   ```bash
   $ java complex
   a: 1.0 + 2.0i
   b: 3.0 + 0.5i
   addition: 4.0 + 2.5i
   subtraction: -2.0 + 1.5i
   multiplication: 2.0 + 6.5i
   ```

10. Write a java class which consists of 5 integer data. Overload constructor (Default & normal) to initialize those integer data members. Provide a method which sorts those integer data members using bubble sort.

    ### Code:

    > ```java
    > class fiveInt {
    >     int[] arr = new int[5];
    > 
    >     fiveInt() {
    >         for (int i = 0; i < this.arr.length; i++) {
    >             this.arr[i] = 0;
    >         }
    >     }
    > 
    >     fiveInt(int a, int b, int c, int d, int e) {
    >         this.arr[0] = a;
    >         this.arr[1] = b;
    >         this.arr[2] = c;
    >         this.arr[3] = d;
    >         this.arr[4] = e;
    >     }
    > 
    >     void showall() {
    >         for (int i = 0; i < this.arr.length; i++) {
    >             System.out.print(arr[i] + " ");
    >         }
    >     }
    > 
    >     void sort() {
    >         int n = this.arr.length;
    >         for (int i = 0; i < n - 1; i++) {
    >             for (int j = 0; j < n - i - 1; j++) {
    >                 if(arr[j]  > arr[j+1]){
    >                     int temp = arr[j];
    >                     arr[j] = arr[j+1];
    >                     arr[j+1] = temp;
    >                 }
    >             }
    >         }
    >     }
    > 
    > }
    > 
    > public class sortFive {
    >     public static void main(String[] args) {
    >         if (args.length < 5){
    >             System.out.println("Usage: java sortFive <five_space_separated_integers>");
    >         }
    >         int a = Integer.parseInt(args[0]);
    >         int b = Integer.parseInt(args[1]);
    >         int c = Integer.parseInt(args[2]);
    >         int d = Integer.parseInt(args[3]);
    >         int e = Integer.parseInt(args[4]);
    >         fiveInt arr = new fiveInt(a, b, c, d, e);
    >         System.out.println("Before sorting: ");
    >         arr.showall();
    >         arr.sort();
    >         System.out.println("\nAfter sorting: ");
    >         arr.showall();
    >     }
    > }
    > ```

    ### Output:

    ```bash
    $ java sortFive 5 7 4 2 3
    Before sorting:
    5 7 4 2 3
    After sorting:
    2 3 4 5 7
    ```

    