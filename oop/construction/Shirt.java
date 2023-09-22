package construction;

public class Shirt {
    public String color;
    public String brand;

    Shirt ( String newColor, String newBrand) {
        color = newColor;
        brand = newBrand;
    }

    public static void shirtOn() {
        System.out.println("Shirt is on!");
    } 
    public static void shirtOff() {
        System.out.println("Shirt is off!");
    }

}
