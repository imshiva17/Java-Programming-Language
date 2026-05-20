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

public class Strings {

    public static void main(String[] args) {
        String firstName = "Shiva";
        String lastName = "Rajak";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
