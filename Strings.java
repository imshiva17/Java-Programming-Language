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

import java.util.*;

public class Strings {
    public static float getShortestPath(String path){
        int x = 0, y=0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }


        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}