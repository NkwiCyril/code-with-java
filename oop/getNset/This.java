package getNset;

public class This {

    String food;
    char size;

    public void setData(String food, char size) {
        this.food = food;
        this.size = size; 

        // the this keyword does not work with static keywords
    }
     

    public static void main(String[] args) {

        This newThis = new This();

        newThis.setData("Water fufu", 'M');

        System.out.println(newThis.food);
        System.out.println(newThis.size);


    }

}
