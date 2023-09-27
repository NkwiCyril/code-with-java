package access.package1;

public class Access2 {
    
    // default
    String shoe = "Scotch and Soda";
    String hair = "black";

    //public
    public String location = "Buea";
    public double height = 170.2;

    //private
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
