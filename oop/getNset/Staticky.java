package getNset;

public class Staticky {

    static int a = 9; 
    // the static keyword makes this integer makes this integer 
    // to be used anywhere in the class without creating an object
    
    public static void main(String[] args) {
        int b = 4;

        System.out.println(a + b); 
    }

}
