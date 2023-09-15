package basics;

public class Typecast {
    
    public static void main(String[] args) {
        
        // there are 2 types of type casting namely,
        // Narrowing (manual) casting, convert from a larger type to a smaller type
        // double -> float -> long -> int -> char -> short -> byte
        
        double num = 34.90;
        int newNum = (int)num; // type cast integer value into a double

        System.out.println(num); // -> 34.9
        System.out.println(newNum); // -> 34

        // Widening (automatic) casting, convert from a smaller type to a larger type
        // byte -> short -> char -> int -> long -> float -> double

        int myInt = 23;
        double myDouble = myInt; // -> 23.0 , converts the int into a double
        
        System.out.println(myInt);      
        System.out.println(myDouble);

    };

};
