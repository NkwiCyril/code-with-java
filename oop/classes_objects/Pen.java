package classes_objects;


public class Pen {
    
    String inkType = "gel";
    String color = "black";
    String model = "schneider-2012";
    static boolean onClick = false;

    public static void click() {
        onClick = true;
    }

    public static void unClick() {
        onClick = false;
    }

}

