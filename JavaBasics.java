// Boilerplate Code

// public class JavaBasics{
//     public static void main(String args[]) {

//     }
// }

//Output (print)

// public class JavaBasics{
//     public static void main(String args[]){
//         System.out.println("Hello World!");
//     }
// }

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.print("Hello World!");
//         System.out.print("Hello World!");
//         System.out.print("Hello World!");
//     }
// }

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("Hello World!");   //next line -> ln ki use se 
//         System.out.println("Hello World!");   //next line
//         System.out.println("Hello World!");   //next line
//     }
// }

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.print("Hello World!\n");
//         System.out.print("Hello World!\n");
//         System.out.print("Hello World!\n");

//         System.out.print("Hello World!\nHello \n Shiva");

//     }
// }

// public class JavaBasics{
//     public static void main(String args[]){
//         System.out.println("* * * *");
//         System.out.println("* * *");
//         System.out.println("* *");
//         System.out.println("*");
//     }
// }

//Variable in Java

// public class JavaBasics {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int sum = a + b;
//         System.out.print(sum);
//     }
// }

//Input in Java

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.next(); // space ke badh capture nhi krega
//         // System.out.println(name);

//         // String name = sc.nextLine(); // ye sab capture krta h
//         // System.out.println(name);

//         // int num = sc.nextInt(); // number store karne ke liye use krte h
//         // System.out.println(num);

//         // float n = sc.nextFloat(); // float value use krne ke liye
//         // System.out.println(n);

//         boolean turn = sc.nextBoolean(); // boolean ke use karte h
//         System.out.println(turn);

//         // System.out.println("Enter a number:");
//         // float n = sc.nextFloat();
//         // System.out.println(n);

//     }
// }

// add two numbers

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// multiple two numbers

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int mul = a * b;
//         System.out.println(mul);
//     }
// }

// area of circle

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area = 3.14f * rad * rad; // 3.14 abhi double but 3.14f is float value
//         System.out.println(area);
//     }
// }

// type conversion

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int num = sc.nextFloat(); // it will show lossy conversion error
//         // System.out.println(num);

//         float num = sc.nextInt(); // it convert int value into float
//         System.out.println(num);

//         // int a = 10;
//         // float b = a;
//         // System.out.println(b);
//     }
// }

// type casting

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // float a = 25.25f;
//         // int b = (int) a;
//         // System.out.println(b);

//         // float marks = 99.99f;
//         // int marks2 = (int) marks;
//         // System.out.println(marks2);

//         // int a = (int)156.55f;
//         // System.out.println(a);

//         float a = 12.56f;
//         short b = (short) a;
//         System.out.println(b);

//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // char ch = 'a';
//         // int num = ch;
//         // System.out.println(num);

//         int num1 = (int) 'a';
//         System.out.println(num1);

//         int num2 = (int) 'b';
//         System.out.println(num2);

//         int num3 = (int) 'A';
//         System.out.println(num3);

//         int num4 = (int) 'B';
//         System.out.println(num4);
//     }
// }

// type promotion

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {    
//         Scanner sc = new Scanner(System.in);

//         // char a='a';
//         // char b ='b';
//         // System.out.println((int)a);
//         // System.out.println((int)b);
//         // System.out.println(b-a); 

//         // short a = 5;
//         // byte b = 15;
//         // char c = 'c';
//         // byte bt = (byte)(a + b + c);
//         // System.out.println(bt);

//         // int a = 10;
//         // float b = 20.35f;
//         // long c = 25;
//         // double d = 30;
//         // double ans = a + b + c + d;
//         // System.out.println(ans);

//         byte a = 5;
//         byte b = (byte) (a * 2); //btye mein type cast kiya hua kyuki ye ek expression ban gya h aur a*2 int h aur int to byte convert nhi hota
//         System.out.println(b);
//     }
// }

// Question1:In a program,input 3 numbers:A,B and C.You have to output the
// average of these 3 numbers.

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avg = (a + b + c) / 3;
//         System.out.println("Average of 3 numbers is : " + avg);
//     }
// }

// Question2:In a program,input the side of a square.You have to output the area
// of the square.

// import java.util.*;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float side = sc.nextFloat();
//         float area = side * side;
//         System.out.println("Area of square is : " + area + " sq. m");
//     }
// }

// Question3:Enter cost of 3 items from the user(using float datatype)-a
// pencil,a pen and an eraser. You have to output the total cost of the items
// back to the user as their bill.

import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.println("Bill is : " + totalCost);

        // add 18% gst
        float gstBill = totalCost + (0.18f * totalCost);
        System.out.println("Bill with 18% gst is : " + gstBill);
    }
}