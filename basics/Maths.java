package basics;

public class Maths {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        double c = -21.34;
         
        System.out.println(Math.max(a, b)); // => 7
        System.out.println(Math.min(a, b)); // => 6
        System.out.println((float)Math.sqrt(7)); // square root of 7
        System.out.println((int)(Math.random() * 100)); // outputs random integers between 0 and 99 

        System.out.println(Math.abs(c)); 
        // returns the absolute(positive) value of c
        System.out.println(Math.pow(a, b)); // => 7^6

        System.out.println(a > b);
    }   

}
