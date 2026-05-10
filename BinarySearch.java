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

import java.util.*;

public class BinarySearch {

    public static int agnosticSearchInArray(int arr[], int target) {

        int start = 0, end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {

                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 90, 75, 18, 12, 6, 4, 3, 1 };
        int target = 75;

        System.out.print(agnosticSearchInArray(arr, target));

    }
}