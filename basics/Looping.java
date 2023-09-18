package basics;

public class Looping {
    public static void main(String[] args) {
        int i = 0;
        int j;
        int k = 0;
        while (i < 5) {
            System.out.print( i + "\t");
            i++;
        } 

        for (j = 0 ; j < 5 ; j++ ) {
            System.out.println("Working with loops in Java");
        }

        do {
            System.out.println("this is a do-while loop");
            k++;
        } while (k < 7);
    }
}
