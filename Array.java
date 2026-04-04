// Creating arrays

// dataType arrayName = new dataType[size];

// import java.util.*;

// public class Array {
//     public static void main(String args[]) {
//         int marks[] = new int[50];

//         // OR

//         int numbers[] = { 1, 2, 4, 5 };
//         String fruits[] = { "apple", "mango", "banana" };
//     }
// }

// Input, Output, Update

// import java.util.*;

// public class Array {
//     public static void main(String args[]) {
//         int marks[] = new int[50];

//         Scanner sc = new Scanner(System.in);

//         //To find size of array i.e. arrayName.length is used
//         System.out.println(marks.length);

//         // Input
//         marks[0] = sc.nextInt(); // phy
//         marks[1] = sc.nextInt(); // chem
//         marks[2] = sc.nextInt(); // maths

//         // Output
//         System.out.println("Marks of phy: " + marks[0]);
//         System.out.println("Marks of chem: " + marks[1]);
//         System.out.println("Marks of maths: " + marks[2]);

//         // Update
//         marks[2] = marks[2] + 4;
//         System.out.println("Marks of maths: " + marks[2]);

//     }
// }

// Passing arrays as argument

// import java.util.*;

// public class Array {

//     public static void updateArray(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 2;
//         }
//     }

//     public static void main(String args[]) {
//         int marks[] = { 45, 56, 85 };
//         updateArray(marks);

//         // printing marks
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// Linear Search

// import java.util.*;

// public class Array {

//     public static int linearSearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 8, 10, 12, 14, 16 };
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Key is not found!");
//         } else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }

// Linear Search in Menu(String datatype)

// import java.util.*;

// public class Array {
//     public static int linearSearch(String menu[], String key) {
//         for (int i = 0; i < menu.length; i++) {
//             if (menu[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         String menu[] = { "coke", "samosa", "maggi", "pasta", "chowmine", "fruity", "chips" };
//         String key = "pasta";

//         int index = linearSearch(menu, key);

//         if (index == -1) {
//             System.out.println(key + " is not found!");
//         } else {
//             System.out.println(key + " is at index: " + index);
//         }
//     }
// }

// Largest Number

// import java.util.*;

// public class Array {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 6, 4, 5 };
//         System.out.println("Largest number is: " + getLargest(numbers));
//     }
// }

// Smallest Number 

// import java.util.*;

// public class Array {
//     public static int getSmallest(int numbers[]) {
//         int smallest = Integer.MAX_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }
//         }
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 6, 4, 5 };
//         System.out.println("Smallest number is: " + getSmallest(numbers));
//     }
// }

// Binary Search(only used in sorted data)

// import java.util.*;

// public class Array {

//     public static int binarySearch(int numbers[], int key) {
//         int start = 0, end = numbers.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             // comparison
//             if (numbers[mid] == key) {
//                 return mid;
//             }

//             if (numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
//         int key = 10;

//         System.out.println("Index of "+key+" is: "+binarySearch(numbers, key));
//     }
// }

// Reverse an array

// import java.util.*;

// public class Array {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;

//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10 };

//         reverse(numbers);
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//     }
// }

// Pairs in an array

// import java.util.*;

// public class Array {
//     public static void printPairs(int numbers[]) {
//         // to count total number of pairs
//         int tp = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i];
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total number of pairs: " + tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         printPairs(numbers);
//     }
// }

// Print Subarrays

// import java.util.*;

// public class Array {
//     public static void printSubarray(int num[]) {
//         // total subarrays
//         int ts = 0;
//         for (int i = 0; i < num.length; i++) {
//             int start = i;
//             for (int j = i; j < num.length; j++) {
//                 int end = j;
//                 for (int k = start; k <= end; k++) {
//                     System.out.print(num[k] + " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays: " + ts);
//     }

//     public static void main(String[] args) {
//         int num[] = { 2, 4, 6, 8, 10 };
//         printSubarray(num);
//     }
// }

// Max Subarray Sum (Brute Force)

// import java.util.*;

// public class Array {
//     public static void maxSubarraySum(int num[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < num.length; i++) {
//             int start = i;
//             for (int j = i; j < num.length; j++) {
//                 int last = j;
//                 currSum = 0;
//                 for (int k = start; k <= last; k++) {
//                     currSum += num[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Max sum: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int num[] = { 1, -2, 6, -1, 3 };
//         maxSubarraySum(num);
//     }
// }

// Max Subarray Sum(Prefix Sum)

// import java.util.*;

// public class Array {
//     public static void maxSubarraySum(int num[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         int prefix[] = new int[num.length];

//         prefix[0] = num[0];
//         // calculating prefix array

//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + num[i];
//         }

//         for (int i = 0; i < num.length; i++) {
//             int start = i;
//             for (int j = i; j < num.length; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Max sum is: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int num[] = { 1, -2, 6, -1, 3 };
//         maxSubarraySum(num);
//     }
// }

// Max Subarray Sum(Kadane's Algorithm)

// import java.util.*;

// public class Array {
//     public static void kadanes(int num[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for (int i = 0; i < num.length; i++) {
//             currSum = currSum + num[i];
//             if (currSum < 0) {
//                 currSum = 0;
//             }

//             maxSum = Math.max(maxSum, currSum);
//         }
//         System.out.println("Max Subarray Sum is: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         kadanes(num);
//     }
// }

// Trapping Rainwater

// import java.util.*;

// public class Array {
//     public static void trappedRainwater(int height[]) {
//         int n = height.length;

//         // calculate left max bounndary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         // calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         // loop
//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             // waterLevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             // trappedWater = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         System.out.println("Total water trapped is: " + trappedWater);
//     }

//     public static void main(String args[]) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         trappedRainwater(height);
//     }
// }

// Buy and Sell Stocks

// import java.util.*;

// public class Array {
//     public static void stocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i < prices.length; i++) { 
//             if (buyPrice < prices[i]) {    // profit
//                 int profit = prices[i] - buyPrice; // today's profit
//                 maxProfit = Math.max(maxProfit, profit); // Across all days
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         System.out.println("Total profit: " + maxProfit);
//     }

//     public static void main(String[] args) {
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         stocks(prices);
//     }
// }

// Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// import java.util.*;

// public class Array{
//     public static boolean duplicate(int nums[]){
//         for(int i=0;i<nums.length;i++){
//             for (int j = i+1; j < nums.length; j++) {
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,4};
//         System.out.println(duplicate(nums));
//     }
// }

// Question 2: Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// linear search method
// import java.util.*;

// public class Array{
//     public static int numIndex(int nums[],int target){
//         for (int i = 0; i < nums.length; i++) {
//             if(nums[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {4, 5, 6, 7, 1, 2};
//         int target = 0;
//         System.out.println(numIndex(nums,target));
//     }
// }

// Question 3: You are given an array prices where prices[i] is the price of a given stock on the i'th day. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// import java.util.*;

// public class Array { 
//     public static void stock(int prices[]) {
//         int maxProfit = 0;
//         int buyPrice = Integer.MAX_VALUE;
//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) {
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         System.out.println(maxProfit);
//     }

//     public static void main(String[] args) {
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         stock(prices);
//     }
// }

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// import java.util.*;

// public class Array {
//     public static void trappedRainwater(int height[]) {
//         int n = height.length;
//         // left array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
//         // right array
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }
//         // loop
//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             // waterlevel
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             // trappedwater
//             trappedWater += waterLevel - height[i];
//         }

//         System.out.println("trappedwater: " + trappedWater);
//     }

//     public static void main(String[] args) {
//         int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//         trappedRainwater(height);
//     }
// }