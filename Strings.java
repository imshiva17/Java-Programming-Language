// Strings

// Syntax

// public class Strings {
//     public static void main(String[] args) {
//         // Syntax

//         String name; // Declaration

//         name = "Shiva"; // Initialization

//         System.out.println(name);
//     }
// }

// import java.util.*;

// public class Strings {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // String name = sc.next();
//         // System.out.println(name);
//         // // I/P: shiva rajak
//         // // O/P: shiva

//         String name = sc.nextLine();
//         System.out.println(name);
//         // I/P: shiva rajak
//         // O/P: shiva rajak
//     }
// }

//To find String length - length()

// import java.util.*;

// public class Strings {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String name = "Shiva Rajak";
//         int length = name.length();    //it count space also
//         System.out.println(length);
//     }
// }

//Concatenation: means joining two things

// public class Strings {

//     public static void main(String[] args) {
//         String firstName = "Shiva";
//         String lastName = "Rajak";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName);
//     }
// }

// charAt() Method

// public class Strings {

//     public static void main(String[] args) {
//         String fullName = "Shiva Rajak";

//         System.out.println(fullName.charAt(0));   //O/P: S
//         System.out.println(fullName.charAt(1));   //O/P: h

//         //for every charaters

//         for (int i = 0; i < fullName.length(); i++) {
//             System.out.print(fullName.charAt(i)+" ");  //O/P: S h i v a   R a j a k
//         }
//         System.out.println();
//     }
// }

//Check string is palindrome or not

// public class Strings {

//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }

//Shortest Route
// import java.util.*;

// public class Strings {
//     public static float getShortestPath(String path){
//         int x = 0, y=0;

//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);

//             //south
//             if(dir == 'S'){
//                 y--;
//             }
//             //north
//             else if(dir == 'N'){
//                 y++;
//             }
//             //west
//             else if(dir == 'W'){
//                 x--;
//             }
//             //east
//             else{
//                 x++;
//             }
//         }

//         int X2 = x*x;
//         int Y2 = y*y;

//         return (float)Math.sqrt(X2+Y2);

//     }

//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }

//String Function for compare - equals()

// import java.util.*;

// public class Strings{
//     public static void main(String[] args) {
//         String s1 = "Shiva";
//         String s2 = "Shiva";
//         String s3 = new String ("Shiva");

//         // if(s1 == s2){    // This will give equals
//         //     System.out.println("Equals");
//         // }else{
//         //     System.out.println("Not Equals");
//         // }

//         // if(s1 == s3){     // This will give not equals because of interning
//         //     System.out.println("Equals");
//         // }else{
//         //     System.out.println("Not Equals");
//         // }

//         if(s1.equals(s3)){   //This will give equals because equals() only compares value
//             System.out.println("Equals");
//         }else{
//             System.out.println("Not Equals");
//         }
//     }
// }

//SubString 

// import java.util.*;

// public class Strings {
//     public static String subString(String str, int start, int end) {
//         String substr = "";
//         for (int i = 0; i < end; i++) {
//             substr += str.charAt(i);
//         }

//         return substr;
//     }

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(subString(str, 0, 5));

//         //direct inbuilt function
//         System.out.println(str.substring(0, 5));
//     }
// }

//For a given set of Strings, print thr largest string

// public class Strings {

//     public static void main(String[] args) {
//         String fruits[] = { "apple", "mango", "banana" };

//         String largest = fruits[0];

//         for (int i = 1; i < fruits.length; i++) {
//             if (largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }

//         System.out.println(largest);
//     }
// }

//StringBuilder: Used to create and modify string without creating new object
//Syntax:
// StringBuilder sb = new StringBuilder("");

// Ex:

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}
