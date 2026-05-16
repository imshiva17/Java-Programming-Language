// //Bubble Sort

// import java.util.*;

// public class Sorting {
//     public static void bubbleSort(int arr[]) {
//         // run the steps n-1 times
//         for (int i = 0; i < arr.length-1; i++) {
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

// import java.util.*;

// public class Sorting {
//     public static void bubbleSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int swapped = 0;
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped++;
//                 }

//             }
//             // if you did not swap for a particular value of i, it means the array is
//             // already sorted

//             if (swapped == 0) {
//                 break;
//             }
//         }

//         // Printing Array

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//     }

//     public static void main(String[] args) {
//         int[] arr = { 3, 1, 5, 4, 2 };
//         bubbleSort(arr);
//     }
// }

// Selection Sort

// import java.util.*;

// public class Sorting {

//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length-1; i++) {
//             int maxIndex = 0;
//             for (int j = 1; j < arr.length - i; j++) {
//                 if (arr[j] > arr[maxIndex]) {
//                     maxIndex = j;
//                 }
//             }

//             int temp = arr[maxIndex];
//             arr[maxIndex] = arr[arr.length - i - 1];
//             arr[arr.length - i - 1] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 1, 2, 3 };
//         selectionSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//OR

// import java.util.*;

// public class Sorting {

//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minIndex] > arr[j]) {
//                     minIndex = j;
//                 }
//             }

//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;

//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 1, 2, 3 };
//         selectionSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Insertion Sort

// import java.util.*;

// public class Sorting {

//     public static void insertionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j > 0; j--) {
//                 if (arr[j] < arr[j - 1]) {
//                     int temp = arr[j - 1];
//                     arr[j - 1] = arr[j];
//                     arr[j] = temp;
//                 } else {
//                     break;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 1, 2, 3 };
//         insertionSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//OR

// import java.util.*;

// public class Sorting {

//     public static void insertionSort(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;

//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }

//             arr[prev + 1] = curr;
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 1, 2, 3 };
//         insertionSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//Inbuilt Sort

// import java.util.*;

// public class Sorting {
//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 1, 2, 3 };

//         // Direct Sort - O(nlogn)
//         // Arrays.sort(arr);
//         // System.out.println(Arrays.toString(arr));

//         // Sort in range
//         Arrays.sort(arr,0,3);
//         System.out.println(Arrays.toString(arr));

//     }
// }

// import java.util.*;

// public class Sorting {
//     public static void main(String[] args) {
//         //Collections works on Only object datatype
//         Integer arr[] = { 4, 5, 1, 2, 3 };

//         // Direct reverse Sort
//         // Arrays.sort(arr, Collections.reverseOrder());
//         // System.out.println(Arrays.toString(arr));

//         //  Reverse Sort in range
//         Arrays.sort(arr,0,3,  Collections.reverseOrder());
//         System.out.println(Arrays.toString(arr));

//     }
// }


//Cycle Sort

// import java.util.*;

// public class Sorting {

//     public static void cycleSort(int arr[]) {
//         // index = value-1

//         int i = 0;
//         while (i < arr.length) {
//             int correct = arr[i] - 1;
//             if (arr[i] != arr[correct]) {
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             } else {
//                 i++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 5, 2, 1, 4 };
//         cycleSort(arr);
//         System.out.println(Arrays.toString(arr));

//     }
// }