//ArrayList package

// import java.util.ArrayList;

// //OR (it includes everything all packages)

// // import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         // ClassName OjectName = new ClassName();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Boolean> list2 = new ArrayList<>();
//         ArrayList<Float> list3 = new ArrayList<>();
//     }
// }

//Operations

// import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Add element - O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         // OR
//         list.add(1, 9); // O(n)

//         System.out.println(list);

//         // // Get element - O(1)
//         // int element = list.get(2);
//         // System.out.println(element);

//         // // Remove element - O(n)
//         // list.remove(2);
//         // System.out.println(list);

//         // // Set element at index - O(n)
//         // list.set(2, 10);
//         // System.out.println(list);

//         // // Contains element - O(n)
//         // System.out.println(list.contains(1));
//         // System.out.println(list.contains(11));

//         // Size
//         System.out.println(list.size());

//     }
// }

// Print reverse of an arraylist

// import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         // Reverse print
//         for (int i = list.size() - 1; i >= 0; i--) {
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

//Find maximum in an arraylist

// import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < list.size(); i++) {
//             max = Math.max(max, list.get(i));
//         }

//         System.out.println(max);
//     }
// }

//Swap 2 numbers

// import java.util.*;

// public class ArrayLists {

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         int idx = 1, idx2 = 3;
//         System.out.println(list);
//         swap(list, idx, idx2);
//         System.out.println(list);

//     }
// }

//Sorting an ArrayList

// import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5); 
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         System.out.println(list);
//         // Ascending Order
//         Collections.sort(list);
//         System.out.println("Ascending Order : " + list);
//         // Descending Order
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println("Descending Order :" + list);
//     }
// }

//Multi-dimensional arraylist

// import java.util.*;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for (int i = 1; i <= 5; i++) {
//             list1.add(i * 1);
//             list2.add(i * 2);
//             list3.add(i * 3);
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);

//         // nested loop

//         for (int i = 0; i < mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Container with most water (Brute Force Approach)

// import java.util.*;

// public class ArrayLists {
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         int n = height.size();

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int minHeight = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int water = minHeight * width;

//                 maxWater = Math.max(maxWater, water);
//             }
//         }
//         return maxWater;
//     }

// public static void main(String[] args) {
//     ArrayList<Integer> height = new ArrayList<>();
//     height.add(1);
//     height.add(8);
//     height.add(6);
//     height.add(2);
//     height.add(5);
//     height.add(4);
//     height.add(8);
//     height.add(3);
//     height.add(7);

//     System.out.println(storeWater(height));
// }
// }

//Container with most water (Two Pointer Approach)

// import java.util.*;

// public class ArrayLists {
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         int lp = 0;
//         int rp = height.size() - 1;

//         while (lp < rp) {
//             // Calculate water area
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int width = rp - lp;
//             int water = ht * width;
//             maxWater = Math.max(maxWater, water);

//             // Update pointer
//             if (height.get(lp) < height.get(rp)) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }

//         return maxWater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storeWater(height));
//     }
// }

//Pair Sum - 1 (Brute Force Approach)

// import java.util.*;

// public class ArrayLists {
//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }

// public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
//     list.add(6);

//     int target = 5;

//     System.out.println(pairSum1(list, target));

// }
// }

//Pair Sum - 1 (Two Pointer Approach)

// import java.util.*;

// public class ArrayLists {
//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size() - 1;

//         while (lp < rp) {
//             if (list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }

//             if (list.get(lp) + list.get(rp) < target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);

//         int target = 5;

//         System.out.println(pairSum1(list, target));

//     }
// }

//Pair Sum - 2(Two Pointer Approach)

// import java.util.*;

// public class ArrayLists {
//     public static boolean pairSum2(ArrayList<Integer> list, int target) {
//         int pivot = -1; // breaking point
//         int n = list.size();

//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) > list.get(i + 1)) {
//                 pivot = i;
//                 break;
//             }
//         }

//         int lp = pivot + 1;
//         int rp = pivot;

//         while (lp != rp) {
//             if (list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }

//             if (list.get(lp) + list.get(rp) < target) {
//                 lp = (lp + 1) % n;
//             } else {
//                 rp = (rp + n - 1) % n;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);

//         int target = 16;
//         System.out.println(pairSum2(list, target));

//     }
// }

//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
//Sample Input 1: nums = [1,2,2,3] Sample Output 1: true
//Sample Input 2: nums = [6,5,4,4] Sample Output 2: true
//Sample Input 3: nums = [1,3,2] Sample Output 3: false

// import java.util.*;

// public class ArrayLists {
//     public static boolean monotonic(ArrayList<Integer> nums) {
//         boolean inc = true;
//         boolean dec = true;
//         for (int i = 0; i < nums.size() - 1; i++) {
//             if (nums.get(i) > nums.get(i + 1)) {
//                 inc = false;
//             }
//             if (nums.get(i) < nums.get(i + 1)) {
//                 dec = false;
//             }
//         }
//         return inc || dec;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();

//         nums.add(1);
//         nums.add(2);
//         nums.add(2);
//         nums.add(4);

//         System.out.println(monotonic(nums));
//     }
// }

//Question 2 :Lonely Numbers in ArrayList(MEDIUM)You are given an integer array list nums. A number x is lonely when it appears only once,and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.Return all lonely numbers in nums. You may return the answer in any order.
// Sample Input 1: nums = [10,6,5,8]   Sample Output 1: [10,8]

import java.util.*;

public class ArrayLists {
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(nums);

        for (int i = 1; i < nums.size() - 1; i++) {
            int curr = nums.get(i);
            if (nums.get(i - 1) + 1 < curr && curr < nums.get(i + 1) + 1) {
                list.add(curr);
            }

            if ((i > 0 && nums.get(i - 1) == curr) || (i < nums.size() - 1 && nums.get(i + 1) == curr)) {
                list.add(curr);
            }
        }

        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        //Array file hai folder mein isliye ye chal nhi yaha
        //ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 6, 5, 8));

        System.out.println(lonelyNumber(nums));
    }

}
