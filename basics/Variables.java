package basics;

public class Variables {
    public static void main(String[] args) {
        // concatenation of variables using the + character

        int age = 21; // single variable declaration
        int x = 2, y =3, z = 4; // multiple variable declaration

        String name = "Nkwi Cyril";
        System.out.println(name + " is " + age + " years old.");
        System.out.println(x+y+z);
        String firstName = "Nkwi ";
        String lastName = "Cyril";
        String finalName = firstName + lastName;

        System.out.println(finalName);

        double number = 3.34;
        float floatingNum = 3.34f;

        System.out.println((int)(number * floatingNum)); 
        // type casting the value gotten into an integer value
        
        double newNum = 2e2;
        // 2 times 10 raised to the power 2 (2 * 10^2)
        // raising a number to the power 10 or using the exponent (e)
        System.out.println(newNum);
    }
}
