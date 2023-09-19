package basics;

public class Methods {
    static void myMethod(int i) {
        System.out.println("This is a static method.");
        System.out.println("It cannot be accessed ny objects of this class.");
        System.out.println();
        String[] value = Array.phones;
        System.out.println("This is the random phone you have choosen: " + value[i]);
    }

    public static void main(String[] args) {
        myMethod(1);
        System.out.println();
    }

}
