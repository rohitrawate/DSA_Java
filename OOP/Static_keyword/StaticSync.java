// package Static_keyword;

// import DSA_JAVA.Basic.FirstClass.java;

public class StaticSync {
    public static void main(String[] args) {
        
        System.out.println("Use of Static( Class variable )");
        Human raj = new Human(20, "Raj", 12000, true);
        System.out.println(" Initial people "+Human.population);
        Human shubham = new Human(20, "Shubham", 10000, false);
        Human pranav = new Human(20, "Raj", 24000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
    
}

class Human{
    private int age;
    private String name;
    private int salary;
    private boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population  += 1;
    }
}
