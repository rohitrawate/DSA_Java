public class WrapperClass {

    public static void main(String[] args) {
        
        int a = 10;
        A Pradeep = new A("Pradeep");
           Pradeep.name = "Other Name";
          Pradeep.print(); 
        // A Pradeep = A("new Object");   // Error for Assinging new Value To old Object 

        A obj;
        for (int i = 0; i < 2000000; i++) {
             obj = new A("Random Object to Same reference");
        }

    }
}

//  When Non-Primitive like Classes is final  

class A {
    final int num = 10;
    String name;

    A(String name)
    {
        this.name = name;
        // System.out.println("Name is : "+name);
    }
    void print(){
        System.out.println("Curr_name : "+name);
    } 

    @Override
    protected void finalize() throws Throwable {
        // super.finalize();         / TODO Auto-generated method stub
        System.out.println("Object is Destroyed");
    }

}