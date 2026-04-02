// Print Star pattern
//  * 
//  *  *
//  *  *  *
//  *  *  *  *
//  *  *  *  *  *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// Print inverted star pattern

// * * * *
// * * *
// * *
// *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i + 1); j++) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// Print half-pyramid pattern

// 1
// 12
// 123
// 1234

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Print character pattern

// A
// BC
// DEF
// GHIJ

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         char ch = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// HOLLOW RECTANGLE pattern

// *****
// *   *
// *   *
// *****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int r = 4;
//         int c = 5;
//         for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                 if (i == 1 || i == r || j == 1 || j == c) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// INVERTED & ROTATED HALF-PYRAMID pattern

//    *
//   **
//  ***
// ****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             // print space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // print star
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// INVERTED HALF-PYRAMID with Numbers pattern

// 12345
// 1234
// 123
// 12
// 1

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// FLOYD'S TRIANGLE PATTERN

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// 0-1 Triangle pattern

// 1
// 01
// 101
// 0101
// 10101

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int value = (i % 2 == 0) ? 0 : 1; // start with 0 for even rows, 1 for odd
//             // rows
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(value);
//                 value = 1 - value; // toggle between 1 and 0
//             }
//             System.out.println();
//         }
//     }
// }

// OR

// 1
// 01
// 101
// 0101
// 10101

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// 0-1 Triangle pattern where line start with 1

// 1
// 10
// 101
// 1010
// 10101

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             int value = 1; // start each row with 1
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(value);
//                 value = 1 - value; // toggle between 1 and 0
//             }
//             System.out.println();
//         }
//     }
// }

// Butterfly pattern

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         // 1st half
//         for (int i = 1; i <= n; i++) {
//             // stars - i
//             for (int j = 1; j <= i; j++) {
//                 System.err.print("*");
//             }

//             // spaces - 2*(n-i)
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.err.print(" ");
//             }

//             // stars - i
//             for (int j = 1; j <= i; j++) {
//                 System.err.print("*");
//             }
//             System.out.println();
//         }

//         // 2nd half
//         for (int i = n; i >= 1; i--) {
//             // stars - i
//             for (int j = 1; j <= i; j++) {
//                 System.err.print("*");
//             }

//             // spaces - 2*(n-i)
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.err.print(" ");
//             }

//             // stars - i
//             for (int j = 1; j <= i; j++) {
//                 System.err.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// Solid Rhombus

//    ****
//   ****
//  ****
// ****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             // spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // stars
//             for (int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// Hollow Rhombus

//     *****
//    *   *
//   *   *
//  *   *
// *****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // stars
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Diamond pattern

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         // 1st half
//         for (int i = 1; i <= n; i++) {
//             // space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // star
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//         // 2nd half
//         for (int i = n; i >= 1; i--) {
//             // space
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // star
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

// Number Pyramid

//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // number
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// Palindromic Pattern with numbers

//     1
//    212
//   32123
//  4321234
// 543212345

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // descending numbers
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             // ascending numbers
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }
