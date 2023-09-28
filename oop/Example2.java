public class Example2 implements Example3 {
// using interfaces to work with the concept of abstraction

    // encapsulation
    private int myAge;

    // using getters ans setters to set a private property 
    // without changing the variable since we cannot access it.

    void setAge(int myAge) {
        this.myAge = myAge;
    }

    int getAge() {
        return myAge;
    }

    public void shout() {
        System.out.println("GOD IS GOOD.");
    }

    public static void main(String[] args) {
        Example2 e2 = new Example2();

        e2.printName();
        e2.shout();

        StringBuilder build = new StringBuilder();
        build.append("Hello, I am ");
        build.append("20 years old.");

        String newString = build.toString();

        System.out.println(newString);

    }

    @Override
    public void printName() {
        System.out.println("My name is " + myNewName);
    }

}
