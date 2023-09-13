package basics;

// variables


public class Main {

    // all the different datatypes used in java

  final static String name = "Nkwi";
  static boolean sleeping = false;
  static int age;
  static double netWorth = 23.24;
  static char sex = 'M';

    // working the print() and println() methods

    public static void main(String[] args) {

        System.out.println("Hello World!"); 
        /* inserts a new line at the end of output*/
        System.out.println("This is an interesting moment with java");
        /* no new line inserted in this case*/

        System.out.println(23 + 23);     
        System.out.println(23 * 3);

        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(netWorth);

        
    }
}