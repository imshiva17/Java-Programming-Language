// //Bubble Sort

// import java.util.*;

// public class Sorting {
//     public static void bubbleSort(int arr[]) {
//         // run the steps n-1 times
//         for (int i = 0; i < arr.length; i++) {
//             int swapped = 0;
//             // for each step, max item will come at the last respective index
//             for (int j = 1; j < arr.length - i; j++) { // it can also be j <= arr.length - i - 1
//                 // swap if the item is smaller than the previous item
//                 if (arr[j] < arr[j - 1]) {

//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;

//                     swapped++;
//                 }
//             }

//             // if you did not swap for a particular value of i, it means the array is already sorted

//             if (swapped == 0) {
//                 break;
//             }

//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 3, 1, 5, 4, 2 };
//         bubbleSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//OR

//Bubble Sort

import java.util.*;

public class Sorting {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapped = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped++;
                }

            }
            // if you did not swap for a particular value of i, it means the array is
            // already sorted

            if (swapped == 0) {
                break;
            }
        }

        // Printing Array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        bubbleSort(arr);
    }
}
