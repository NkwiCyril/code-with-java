package construction;

import java.util.Scanner;

public class ShirtMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input short color: ");
        String color = scanner.nextLine();

        System.out.print("Input shirt brand: ");
        String brand = scanner.nextLine();

        Shirt s1 = new Shirt(color, brand);
        Shirt s2 = new Shirt("green", "gucci");

        System.out.println(s1.color);
        System.out.println(s1.brand);
        System.out.println();
        System.out.println(s2.color);
        System.out.println(s2.brand);
    }
}
