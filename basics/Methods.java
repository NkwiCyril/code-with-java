package basics;

public class Methods {

    static void myMethod(int i) {
        System.out.println("This is a static method.");
        System.out.println("It cannot be accessed ny objects of this class.");
        System.out.println();
        String[] value = Array.phones;
        System.out.println("This is the random phone you have choosen: " + value[i]);
    }

    static String checkAge(int age) {
        String checker = (age >= 18) 
                        ? "Access Granted! You are the required age" 
                        : "Access Denied! You are not the required age";
        return checker;
    }

    // a recursive method or function is one that calls itself
    
    static int power(int base, int exponent ) {
        if (exponent == 0) return 1;
        else return (base * power(base, exponent - 1));
    }

    static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        else return (num * factorial(num - 1));
    }

    public static void main(String[] args) {
        myMethod(1);
        System.out.println();
        System.out.println(checkAge(0));

        System.out.println(power(2, 2));
        System.out.println(factorial(5));        
    }

}
