// while loop

// import java.util.*;

// public class Loops{
//     public static void main(String[] args) {
//         int i = 0;
//         while(i<=100){
//             System.out.println(i + " Hello Shiva");
//             i++;
//         }
//     }
// }

// Print number from 1 to 10

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// Print number from 1 to n

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n number: ");
//         int n = sc.nextInt();
//         int i = 1;
//         while (i <= n) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// Print sum of first n natural numbers

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n number: ");
//         int n = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while (i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum of n numbers is: " + sum);
//     }
// }

// for loop

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("hello shiva");
//         }
//     }
// }

// Print square pattern

import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // for(int i = 1; i <= 4; i++){
//         // System.out.println("* * * *");
//         // }

//         int i = 1;
//         while (i <= 4) {
//             System.out.println("* * * *");
//             i++;
//         }
//     }
// }

// Print reverse of a number

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 10899;
//         while (n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;
//         }
//         System.out.println();
//     }
// }

// Reverse the given number

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 10899;
//         int rev = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n = n / 10;  // n /= 10;
//         }
//         System.out.println(rev);
//     }
// }

// do while loop

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 1;
//         do {
//             System.out.println("hello shiva");
//             i++;
//         } while (i <= 5);
//     }
// }

// Break statement

import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//     }
// }

// Keep entering numbers till user enters a multiple of 10

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do {
//             System.out.print("Enter your number: ");
//             int n = sc.nextInt();

//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }

// Continue Statement

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// Display all numbers entered by user except multiples of 10

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do {
//             System.out.print("Enter your number: ");
//             int n = sc.nextInt();

//             if (n % 10 == 0) {
//                 System.out.println(n + " is multiple of 10, i will not print it.");
//                 continue;
//             }
//             System.out.println("Your number is: " + n);
//         } while (true);

//     }
// }

// Check if a number is prime or not

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();

//         if (n == 2) {
//             System.out.println(n + " is a prime number");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= n - 1; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }

//             if (isPrime == true) {
//                 System.out.println(n + " is a prime number");
//             } else {
//                 System.out.println(n + " is not a prime number");

//             }
//         }
//     }
// }

// OR

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         if (n == 2) {
//             System.out.println(n + " is a prime number");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(n); i++) { // Math.sqrt(n) is under root n
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }

//             if (isPrime) {
//                 System.out.println(n + " is a prime number");
//             } else {
//                 System.out.println(n + " is not a prime number");

//             }
//         }
//     }
// }

// Question1: Write a program that reads a set of integers, and then prints the
// sum of the even and odd integers.

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.print("Enter your number: ");
//             n = sc.nextInt();

//             if (n % 2 == 0) {
//                 evenSum += n;
//             } else {
//                 oddSum += n;
//             }

//             System.out.println("If you want to continue? press 1 for yes or 0 for no: ");
//             choice = sc.nextInt();
//         } while (choice == 1);

//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);

//     }
// }


// Question 2 :Write a program to find the factorial of any number entered by
// the user

// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         int fact = 1;

//         for (int i = 1; i <= n; i++) {
//             fact *= i;
//         }

//         System.out.println("Factorial: " + fact);
//     }
// }

// Question3: Write a program to print the multiplication table of a number
// N,entered by the user.

// import java.util.*;

// public class Loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " * " + i + " = " + i * n);
//         }
//     }
// }
