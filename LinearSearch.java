//Linear Search Questions 

//Search a key

// import java.util.*;

// public class LinearSearch {

//     public static int linearSearch(int array[], int key) {
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == key) {
//                 System.out.println("Key is foun at: " + i);
//                 return i;
//             }
//         }
//         System.out.println("Key is not found");
//         return -1;
//     }

//     public static void main(String[] args) {
//         int array[] = { 18, 12, -7, 3, 14, 28 };
//         int key = 3;

//         linearSearch(array, key);
//     }
// }

//Search in range

// import java.util.*;

// public class LinearSearch {
//     public static int searchInRange(int array[], int key, int start, int end) {
//         for (int i = start; i <= end; i++) {
//             if (array[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int array[] = { 18, 12, -7, 3, 14, 28 };
//         int key = 3;
//         System.out.println(searchInRange(array, key, 1, 4));
//     }
// }

//Maximum Number

// import java.util.*;

// public class LinearSearch {
//     public static int max(int array[]) {
//         int max = Integer.MIN_VALUE;

//         //FOREACH METHOD
//         // for (int i : array) {
//         //     if (i > max) {
//         //         max = i;
//         //     }
//         // }

//         for (int i = 0; i < array.length; i++) {
//             max = Math.max(max, array[i]);
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int array[] = { 18, 12, -7, 3, 14, 28 };
//         System.out.println(max(array));
//     }
// }

//Minimum Number

// import java.util.*;

// public class LinearSearch {
//     public static int min(int array[]) {
//         int min = Integer.MAX_VALUE;

//         // FOREACH METHOD
//         for (int i : array) {
//             if (i < min) {
//                 min = i;
//             }
//         }

//         // for (int i = 0; i < array.length; i++) {
//         //     min = Math.min(min, array[i]);
//         // }
//         return min;
//     }

//     public static void main(String[] args) {
//         int array[] = { 18, 12, -7, 3, 14, 28 };
//         System.out.println(min(array));
//     }
// }

//Search in 2D array

// import java.util.*;

// public class LinearSearch{

//     // public static boolean search(int arr[][],int key){
//     //     for (int i = 0; i < arr.length; i++) {
//     //         for (int j = 0; j < arr[i].length; j++) {
//     //             if(arr[i][j] == key){
//     //                 System.out.println("Key is found at: ("+i+","+j+")");
//     //                 return true;
//     //             }
//     //         }
//     //     }

//     //     return false;
//     // }

//     public static int[] search(int arr[][],int key){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(arr[i][j] == key){
//                     System.out.println("Key is found at: ("+i+","+j+")");
//                     return new int[]{i,j};
//                 }
//             }
//         }

//         return new int[]{-1,-1} ;
//     }
//     public static void main(String[] args) {
//         int arr [][] = {
//             {23,4,1},
//             {18,12,3,9},
//             {78,99,34,56},
//             {18,12},
//         };

//         int key = 34;

//         search(arr, key);
//     }
// }

// //Max in 2D array

// import java.util.*;

// public class LinearSearch{
//     public static int max(int arr[][]){
//         int max = Integer.MIN_VALUE;
//         // for (int i = 0; i < arr.length; i++) {
//         //     for (int j = 0; j < arr[i].length; j++) {
//         //         max = Math.max(max, arr[i][j]);
//         //     }
//         // }
//          for (int[] row : arr) {
//             for (int element : row) {
//                 max = Math.max(max, element);
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int arr [][] = {
//             {23,4,1},
//             {18,12,3,9},
//             {78,99,34,56},
//             {18,12},
//         };

//         System.out.println(max(arr));

//     }
// }

//Min in 2D array

// import java.util.*;

// public class LinearSearch {
//     public static int min(int arr[][]) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 min = Math.min(min, arr[i][j]);
//             }
//         }
//         // for (int[] row : arr) {
//         //     for (int element : row) {
//         //         min = Math.min(min, element);
//         //     }
//         // }
//         return min;
//     }

//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 23, 4, 1 },
//                 { 18, 12, 3, 9 },
//                 { 78, 99, 34, 56 },
//                 { 18, 12 },
//         };

//         System.out.println(min(arr));

//     }
// }

//leetcode 1295. Given an array nums of integers, return how many of them contain an even number of digits

// import java.util.*;

// public class LinearSearch {

//     public static int totalEvenDigit(int arr[]) {
//         int even = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int count = 0;
//             int digit = arr[i];
//             int original = digit;

//             if (digit == 0) {
//                 count = 1;
//             }
//             while (digit > 0) {
//                 count++;
//                 digit = digit / 10;
//             }

//             // //to find digits(shortcut way)
//             // if (digit == 0) {
//             //     count = 1;
//             // } else {
//             //     count = (int)(Math.log10(digit)) + 1;  // shortcut
//             // }

//             System.out.println(original + " : " + count);

//             if (count % 2 == 0) {
//                 even++;
//             }

//         }
//         System.out.println("Total even no. of digits are: " + even);
//         return even;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 12, 345, 2, 6, 7896 };

//         totalEvenDigit(arr);
//     }
// }

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

import java.util.*;

public class LinearSearch {

    public static int wealth(int accounts[][]) {
        int wealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            System.out.println(sum);
            wealth = Math.max(wealth, sum);
        }

        System.out.println("Richest with wealth: " + wealth);
        return wealth;
    }

    public static void main(String[] args) {
        int accounts[][] = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 },
        };

        wealth(accounts);
    }
}