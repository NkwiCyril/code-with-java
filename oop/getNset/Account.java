package getNset;

public class Account {
    
    String name;
    int age;

    public static void main(String[] args) {
        
        Account a = new Account();

        a.setAge(23);
        a.setName("Mr. Marcaroni");

        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printAccountDetails();

    }
    

    public void setName(String name) {
        this.name = name;
    } 

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public void printAccountDetails() { 
        System.out.println("New user is " + name + " and he is " + age);
    }

}
