package access.package1;

public class Access1 {

    public static void main(String[] args) {
        
        Access2 acc2 = new Access2();

        // access attributes with default as access specifier
        System.out.println(acc2.shoe);
        System.out.println(acc2.hair);

        acc2.setAge(24);
        acc2.setName("Nkwi Cyril");
        System.out.println(acc2.getAge());
        System.out.println(acc2.getName());

        // access attributes with public as access specifier
        System.out.println(acc2.location);
        System.out.println(acc2.height);

        // access attributes with private as access specifier ??
        // System.out.println(acc2.age);
        // System.out.println(acc2.name); 
        // properties can't be accessed by an external class since it is defined as a private property
    }

}