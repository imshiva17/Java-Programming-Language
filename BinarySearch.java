//Search in array

// import java.util.*;

// public class BinarySearch {

//     public static int searchInArray(int arr[], int target) {

//         int start = 0, end = arr.length - 1;
//         while (start <= end) {
//             // int mid = (start + end) / 2; // this may exceed the int range in this formula

//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return -1;

//     }

//     public static void main(String args[]) {
//         int arr[] = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
//         int target = 12;

//         System.out.print(searchInArray(arr, target));

//     }
// }

//Order Agnostic Bianry Search

// import java.util.*;

// public class BinarySearch {

//     public static int agnosticSearchInArray(int arr[], int target) {

//         int start = 0, end = arr.length - 1;

//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr[start] < arr[end];

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (isAsc) {
//                 if (target > arr[mid]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             } else {
//                 if (target < arr[mid]) {

//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }

//         }

//         return -1;

//     }

//     public static void main(String args[]) {
//         int arr[] = { 90, 75, 18, 12, 6, 4, 3, 1 };
//         int target = 75;

//         System.out.print(agnosticSearchInArray(arr, target));

//     }
// }

//Binary search in sorted 2d matrix 

// import java.util.*;

// public class BinarySearch {

//     public static int[] search(int matrix[][], int target) {
//         int row = 0;
//         int col = matrix[0].length - 1;

//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == target) {
//                 return new int[] { row, col };
//             } else if (matrix[row][col] > target) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }

//         return new int[] { -1, -1 };
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 },
//         };

//         int target = 39;
//         System.out.print(Arrays.toString(search(matrix, target)));

//     }
// }