package basics;

public class Strings {
    public static void main(String[] args) {
        String string = "This might be a very long string";
        System.out.println(string);

        System.out.println("The length of the string above is " + string.length());
        // using length() method to output the length of a string

        System.out.println("The string to uppercase is " + string.toUpperCase());
        // toUpperCase() converts the string to uppercase

        System.out.println("The string to lowercase is  " + string.toLowerCase()); 
        // toLowerCase() converts the string to lowercase

        System.out.println("Hello world".indexOf('e'));
        // indexOf() outputs the position of char or string put as argument

        System.out.println(string.concat(". I will reduce it soon"));
        // using the concat() method to concatenate strings

    }
}
