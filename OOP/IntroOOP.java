

class Student{
    private int roll_no;           //int roll;
    private String name;           //String namee;
    private float marks;           //float markss;
    private double percentage;     //double percent;
                      // Constructor  has no return type  
    Student(){                                 //  Default Constructor :  with no parameters
        // Can Call Other Constructor in default/ other constructor
        this (133,"default person", 99, 65.54  ); 
         System.out.println("New Student Object Instantiated ! ");
     } 
    //Student  Pramod  = new  Student(144 , ) 
    Student(int roll, String naam , float mrks , double cent )     // Parameterised Constructor
    {
        this.roll_no = roll;
        this.name = naam;
        this.marks = mrks;
        this.percentage = cent;
        System.out.println("Attributes Set/Assigned ...");
    }

    Student(Student other)                  //  Student Constructor her shows/implements "Polymorphism"
    {                                       //   
        this.name = other.name;             //
        this.roll_no = other.roll_no;
        this.marks   =  other.marks ;
        this.percentage   = other.percentage;
    }

    void print()
    {
        System.out.println( roll_no+ " is "+ name + " scored "+ marks + " and Secured "+ percentage);
    }

    void increase_cent(double incre_cent)
    {
        // percentage = percentage + incre_cent;
         percentage += incre_cent;
         System.out.println("New "+percentage);
    }

}


public class IntroOOP {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Student student1 = new Student();         // Construct call
        Student stud2    = new Student( 123,"Rohit", 88, 95.7  );
        System.out.println(stud2);   //  => Student@7852e922
        // System.out.println(student1.namee);
        // System.out.println(student1.roll);
        // System.out.println(student1.markss);
        // System.out.println(student1.percent);

        // System.out.println(student1.print());
            // student1.print();                   // => 0 is null scored 0.0 and Secured 0.0
            stud2.print();
            stud2.increase_cent(1.3);
            stud2.print();

    }  
}