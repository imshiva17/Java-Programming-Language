// if-else Statements

// public class Conditional {
//     public static void main(String[] args) {
//         int age = 20;
//         if(age>= 18){
//             System.out.println("You can vote.");
//         }else{
//             System.out.println("you can't vote.");
//         }
//     }
// }

//max of 2 no.

// public class Conditional {
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 4;

//         if (a > b) {
//             System.out.println("a is greater than b");
//         } else {
//             System.out.println("b is greater than a");
//         }
//     }
// }

// print if a number is odd or even

// import java.util.*;

// public class Conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println(num + " is even number");
//         } else {
//             System.out.println(num + " is odd number");
//         }

//     }
// }

// else-if Statements

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();
//         if (age >= 58) {
//             System.out.println("You are old");
//         } else if (age >= 18) {
//             System.out.println("You are adult");
//         } else {
//             System.out.println("you are teenager");
//         }
//     }
// }

// Income tax calculator

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income: ");
//         float income = sc.nextFloat();
//         float tax = 0;
//         if (income <= 500000) {
//             tax = 0;
//         } else if (income >= 500000 && income < 1000000) {
//             tax = income * 0.2f;
//         } else {
//             tax = income * 0.3f;
//         }

//         System.out.println("Your tax is: " + tax);
//     }
// }

// Print the largest of 3

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int c = sc.nextInt();

//         if (a >= b) {
//             if (a >= c) {
//                 System.out.println(a + " is greater than " + b + " and " + c);
//             } else {
//                 System.out.println(c + " is greater than " + a + " and " + b);
//             }
//         } else {
//             if (b >= c) {
//                 System.out.println(b + " is greater than " + a + " and " + c);
//             } else {
//                 System.out.println(c + " is greater than " + a + " and " + b);
//             }
//         }

//     }
// }

// OR

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter third number: ");
//         int c = sc.nextInt();

//         if (a >= b && a >= c) {
//             System.out.println(a + " is greater than " + b + " and " + c);
//         } else if (b >= c) {
//             System.out.println(b + " is greater than " + a + " and " + c);
//         } else {
//             System.out.println(c + " is greater than " + a + " and " + b);
//         }
//     }
// }

// Ternary Operators

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         String type = num % 2 == 0 ? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

// Check if a student will pass or fail

// Ternary Operators

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your marks: ");
//         int marks = sc.nextInt();
//         String result = marks >= 33 && marks <= 100 ? "Pass" : "Fail";
//         System.out.println(result);
//     }
// }

// Switch Statement

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         int num = 2;
//         switch (num) {
//             case 1:
//                 System.out.println("samosa");
//                 break;
//             case 2:
//                 System.out.println("burger");
//                 break;
//             case 3:
//                 System.out.println("pizza");
//                 break;
//             default:
//                 System.out.println("wake to reality");
//         }
//     }
// }

// Calculator

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         float a = sc.nextFloat();
//         System.out.print("Enter b: ");
//         float b = sc.nextFloat();
//         System.out.println("Enter operator: ");
//         char operator = sc.next().charAt(0); //.charAt() ka use kiye h string se charater mein convert ke liye

//         switch (operator) {
//             case '+':
//                 System.out.println(a + b);
//                 break;
//             case '-':
//                 System.out.println(a - b);
//                 break;
//             case '*':
//                 System.out.println(a * b);
//                 break;
//             case '/':
//                 System.out.println(a / b);
//                 break;
//             case '%':
//                 System.out.println(a % b);
//                 break;
//             default:
//                 System.out.println("wrong operator");
//         }
//     }
// }

// CONDITIONAL STATEMENTS QUESTIONS
// Question1: Write a Java program to get a number from the user and print
// whether it is positive or negative

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();

//         if (num > 0) {
//             System.out.println(num + " is a positive number");
//         } else {
//             System.out.println(num + " is a negative number");
//         }
//     }
// }

// Question2: Finish the following code so that it prints You have a fever if
// your temperature is above 100 and otherwise prints You don't have a fever.

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the temperature: ");
//         double temp = sc.nextDouble();

//         if (temp > 100) {
//             System.out.println("You have a fever");
//         } else {
//             System.out.println("You don't have a fever");
//         }
//     }
// }

// Question3: Write a Java program to input week number(1-7) and print day of
// week name using switch case.

// import java.util.*;

// public class Conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a week number: ");
//         int weekNum = sc.nextInt();

//         switch(weekNum){
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2:
//             System.out.println("Tuesday");
//             break;
//             case 3:
//             System.out.println("Wednesday");
//             break;
//             case 4:
//             System.out.println("Thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturday");
//             break;
//             case 7:
//             System.out.println("Sunday");
//             break;
//             default:
//             System.out.println("Week has only 7 days");
//         }
//     }
// }

// Question5: Write a Java program that takes a year from the user and print
// whether that year is a leap year or not.

// import java.util.*;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if (year % 400 == 0) {
//             System.out.println(year + " is a leap year");
//         } else if (year % 100 == 0) {
//             System.out.println(year + " is not a leap year");
//         } else if (year % 4 == 0) {
//             System.out.println(year + " is a leap year");
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }

//OR


// import java.util.Scanner;

// public class Conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//             System.out.println(year + " is a Leap Year.");
//         } else {
//             System.out.println(year + " is a Normal Year.");
//         }
//     }
// }

