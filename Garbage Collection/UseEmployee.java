
class Employee{
    private int age;
    private int ID;
    private String name;
    private static int nextId = 1;

    public Employee(String Name, int Age)
    {
        this.name =  Name;
        this.age = Age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println( "Id: "+ID+ "\nName: "+name+ "\nAge: "+age);
    }

    public static void showNextId()
    {
            System.out.println("NextId : "+ nextId);
    }
    protected void finalize()
    {
        System.out.println(" -- Finalize Called");
        --nextId;
        // gc will call finalize and Decreases nextId
    }

}

public class UseEmployee {
    public static void main(String[] args) 
    {
        Employee A = new Employee("E1", 22);
        Employee B = new Employee("E2", 24);
        Employee C = new Employee("E3", 22);

        A.show();
        B.show();
        C.show();
        Employee.showNextId();
        Employee.showNextId();
        Employee.showNextId();

        {
            Employee X = new Employee("Intern1" , 23);
            Employee Y = new Employee("Intern2", 25 );
            X.show();
            Y.show();
            System.out.println("Y in BLock "); 
            Y.showNextId();

            X = Y = null;
            System.gc();
            System.runFinalization();
            // Y.finalize(); Auto Called By gc
        }

        C.showNextId();

    }
}

