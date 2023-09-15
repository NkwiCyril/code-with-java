package basics;

public class Conditions {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
        // long hand if...else

        String check = (a < b) ? "Greater" : "lesser";
        // ternary if...else condition (short hand)
        System.out.println(check);
        System.out.println();

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
