//Creation of 2D array

// import java.util.*;

// public class TwoDArray {

//     // Search method in 2d array

//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("Element found at index: ( " + i + "," + j + " )");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Element not found in the matrix");
//         return false;
//     }

//     // To find largest element
//     public static void Max(int matrix[][]) {
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 max = Math.max(max, matrix[i][j]);
//             }
//         }

//         System.out.println("Max element: " + max);

//     }

//     // To fing smallest element
//     public static void Min(int matrix[][]) {
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 min = Math.min(matrix[i][j], min);
//             }
//         }
//         System.out.println("Smallest element: " + min);
//     }

//     // Creation of 2D array
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);

//         // Input of 2D array
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // Output of 2D array
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Search for an element in the 2D array
//         search(matrix, 5);

//         // To find Max element 
//         Max(matrix);

//         //To find the min element
//         Min(matrix);
//     }
// }

//Spiral Matrix

// import java.util.*;

// public class TwoDArray {

//     public static void spiralMatrix(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // bottom
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 }
//         };

//         spiralMatrix(matrix);
//     }
// }

//Diagonal Sum

// import java.util.*;

// public class TwoDArray {

//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 // primary diagonal
//                 if (i == j) {
//                     sum += matrix[i][j];
//                 }
//                 // secondary diagonal (i + j = n - 1)
//                 else if (i + j == matrix.length - 1) {
//                     sum += matrix[i][j];
//                 }
//             }
//         }

//         // Optimized Solution

//         // for (int i = 0; i < matrix.length; i++) {
//         //     // primary diagonal
//         //     sum += matrix[i][i];
//         //     // secondary diagonal (j = n - 1 - i)
//         //     if (i != matrix.length - 1 - i) {
//         //         sum += matrix[i][matrix.length - 1 - i];
//         //     }
//         // }

//         return sum;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 },
//         };

//         System.out.println(diagonalSum(matrix));
//     }
// }

//Search in sorted matrix(Staircase approach)

// import java.util.*;

// public class TwoDArray {

//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length - 1;
//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Key is found at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("Key is not found!");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 },
//         };

//         staircaseSearch(matrix, 33);
//     }
// }

//OR

// import java.util.*;

// public class TwoDArray {

//     public static boolean stairCaseSearch(int matrix[][], int key) {
//         int row = matrix.length - 1, col = 0;

//         while (row >= 0 && col < matrix[0].length) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Key is found at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 row--;
//             } else {
//                 col++;
//             }
//         }
//         System.out.println("Key is not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 },
//         };

//         stairCaseSearch(matrix, 30);
//     }
// }

//Question 1 :Print the number of 7’s that are in the 2d array

// import java.util.*;

// public class TwoDArray {
//     public static int totalCount(int matrix[][]) {
//         int count = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("Total no. of 7's : " + count);
//         return count;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 4, 7, 8 },
//                 { 8, 8, 7 },
//                 { 0, 3, 7 },
//         };
//         totalCount(matrix);
//     }
// }

//Question 2 :Print out the sum of the numbers in the second row of the “nums” array.

// import java.util.*;

// public class TwoDArray {
//     public static int rowSum(int matrix[][]) {
//         int sum = 0;

//         // for (int i = 1; i <= 1; i++) {
//         //     for (int j = 0; j < matrix[0].length; j++) {
//         //         sum += matrix[i][j];
//         //     }
//         // }

//         //OR

//         for (int j = 0; j < matrix[0].length; j++){
//             sum += matrix[1][j];
//         }

//         System.out.println("Total sum is: " + sum);
//         return sum;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 1, 4, 9 },
//                 { 11, 4, 3 },
//                 { 2, 2, 3 },
//         };

//         rowSum(matrix);
//     }
// }

//Question 3 :Write a program to Find Transpose of a Matrix.

import java.util.*;

public class TwoDArray {

    public static void transpose(int matrix[][]) {
        int row = matrix.length, col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };

        transpose(matrix);
    }
}