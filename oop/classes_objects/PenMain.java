package classes_objects;

public class PenMain {
    public static void main(String[] args) {
        
        Pen pen = new Pen();

        System.out.println(pen.inkType);
        System.out.println(pen.color);
        System.out.println(pen.model);

        Pen.click();
        System.out.println(Pen.onClick);
        
        Pen.unClick();
        System.out.println(Pen.onClick);

    }
}
