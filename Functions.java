// Simple Function syntax

// import java.util.*;

// public class Functions {
//     // Making function
//     public static void printHelloWorld() {
//         System.out.println("Hello World!");
//     }
//     public static void main(String args[]) {
//         printHelloWorld(); // function call
//     }
// }

// Syntax with parameters

// import java.util.*;

// public class Functions {
//     public static void calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         System.out.println("Sum is: " + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum(a, b);
//     }
// }

// OR

// import java.util.*;

// public class Functions {
//     public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("Sum is: " + sum);
//     }
// }

// find product of a & b

// import java.util.*;

// public class Functions {
//     public static int multiply(int a, int b) {
//         int product = a * b;
//         return product;
//     } 
//     public static void main(String[] args) {
//         int prod = multiply(3, 5);
//         System.out.println("a * b = " + prod);
//     }
// }

// Factorial of a number, n

// import java.util.*;

// public class Functions {
//     public static int factorial(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int Factorial = factorial(n);
//         System.out.println("Factorial of " + n + " : " + Factorial);
//     }
// }

// Binomial Coeffient

// import java.util.*;

// public class Functions {
//     public static int factorial(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f *= i;
//         }
//         return f;
//     }

//     public static int binCoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n - r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of r: ");
//         int r = sc.nextInt();
//         System.out.println("Binomial Coefficient of " + "n = " + n + " and " + "r = "
//                 + r + " is : " + binCoeff(n, r));

//         // System.out.println(binCoeff(5, 2));
//     }
// }

// Function Overloading Using Parameters

// import java.util.*;

// public class Functions {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3, 5, 1));
//     }
// }

// Function Overloading Using Data Types

// import java.util.*;

// public class Functions {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static float sum(float a, float b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3.5f, 3.5f));
//     }
// }

// Check if a number is Prime or not

// import java.util.*;

// public class Functions {
//     public static boolean isPrime(int n) {
//         boolean isPrime = true;

//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }

//     public static void main(String args[]) {

//         System.out.println(isPrime(13));
//     }
// }

// OR

// import java.util.*;

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }

//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]) {

//         System.out.println(isPrime(13));
//     }
// }

// Optimized Approach to check if a number is Prime or not

// import java.util.*;

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         System.out.println(isPrime(5));
//     }
// }

// OR

// import java.util.*;

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         } else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println(isPrime(n));
//     }
// }

// OR

// import java.util.*;

// public class Functions {
//     public static void isPrime(int n) {
//         boolean isPrime = true;
//         if (n == 2) {
//             System.out.println(n + " is prime number");
//         } else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % 2 == 0) {
//                     isPrime = false;
//                 }
//             }
//             if (isPrime == true) {
//                 System.out.println(n + " is prime number");
//             } else {
//                 System.out.println(n + " is not prime number");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         isPrime(n);
//     }
// }

// Print all Primes in a range

// import java.util.*;

// public class Functions {
//     public static boolean isPrime(int n) {
//         if (n == 2) {
//             return true;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primesInRange(int n) {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static void main(String args[]) {
//         primesInRange(20);
//     }
// }

// Convert from Binary to Decimal

// import java.util.*;

// public class Functions {
//     public static void binaryToDecimal(int n) {
//         int myNum = n;
//         int dec = 0;
//         int pow = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             dec = dec + (lastDigit * (int) Math.pow(2, pow));
//             pow++;
//             n = n / 10;
//         }
//         System.out.println("Decimal of " + myNum + " = " + dec);

//     }

//     public static void main(String[] args) {
//         binaryToDecimal(01);
//     }
// }

// Convert from Decimal to Binary

// import java.util.*;

// public class Functions {
//     public static void decimalToBinary(int n) {
//         int myNum = n;
//         int bin = 0;
//         int pow = 0;

//         while (n > 0) {
//             int rem = n % 2;
//             bin = bin + (rem * (int) Math.pow(10, pow));
//             pow++;
//             n = n / 2;
//         }
//         System.out.println("Binary of " + myNum + " = " + bin);

//     }

//     public static void main(String[] args) {
//         decimalToBinary(7);

//     }
// }

// Question 1 :Write a Java method to compute the average of three numbers.

// import java.util.*;

// public class Functions {
//     public static void avg(int a, int b, int c) {
//         int avg = (a + b + c) / 3;
//         System.out.println("Average of 3 numbers is : " + avg);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first value: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second value: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the third value: ");
//         int c = sc.nextInt();
//         avg(a, b, c);
//     }
// }

// Question2: Write a method named isEven that accepts an int argument. The
// method should return true if the argument is even, or false otherwise. Also
// write a program to test your method.

// import java.util.*;

// public class Functions {
//     public static void isEven(int n) {
//         if (n % 2 == 0) {
//             System.out.println(n + " is a even number");
//         } else {
//             System.out.println(n + " is odd number");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         isEven(n);
//     }
// }

// Question3: Write a Java program to check if a number is a palindrome in Java?

// import java.util.*;

// public class Functions {
//     public static void isPalindrome(int n) {
//         int myNum = n;
//         int rev = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n = n / 10;
//         }
//         // System.out.println(rev);

//         if (rev == myNum) {
//             System.out.println(myNum + " is a palindrome");
//         } else {
//             System.out.println(myNum + " is not a palindrome");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         isPalindrome(n);
//     }
// }

// Question 5 :Write a Java method to compute the sum of the digits in an
// integer.

// import java.util.*;

// public class Functions {
//     public static void sum(int n) {
//         int sum = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             sum += lastDigit;
//             n = n / 10;
//         }

//         System.out.println("Total sum is: " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         sum(n);
//     }
// }