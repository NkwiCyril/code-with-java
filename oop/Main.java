import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int a = scanner.nextInt();
            System.out.println("Value: " + a);
        }
    }
}