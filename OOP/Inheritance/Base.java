// package Inheritance;

public class Base {
     double len , breadth, height ;

    Base()
    {
        this.len = -1;
        this.breadth = -1;
        this.height = -1;
    }
    
    Base(double l, double b, double h)
    {
        super();  // Directly above current class.In this context this class refers to Object class
        this.len = l;
        this.breadth = b;
        this.height = h;
    }

    Base(double side)
    {
        this.len = side;
        this.breadth = side;
        this.height = side;
    }

    Base( Base old)
    {
        this.len = old.len;
        this.breadth = old.breadth;
        this.height = old.height;
    }

    void info()
    {
        System.out.println("Running The Base Class");
        System.out.println(this.len+ " | "+ this.breadth+" | "+ this.height);
    }

}
