public class Example1 extends Example2 {
//              ||              ||
//          base class      super class
    String name;

    // polymorphism
    public void sayName() {
        System.out.println("My name will be printed!");
    }

    public void sayName(String name) {
        System.out.println("This is my actual name " + name);
    }

    public void sayName(int age, String name) {
        System.out.println("I am " + name + " and I am " + age + " years old");
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.sayName();
        example1.sayName(
                23,
                "Nkwi");
        example1.sayName("Nkwi Cyril");
        example1.shout();

        example1.setAge(23);
        System.out.println(example1.getAge());
    }

}
