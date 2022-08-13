import javax.print.DocFlavor.STRING;

// import org.omg.CORBA.SystemException;

// package Static_keyword;

/*  Outter Classes CanNot be static as there is no other class to contain this static class
 * 
 */

public class OutterClass {

    public void mayBeStatic()
    {
        System.out.println(" heeheh");
    }


    static class InnerClass{
        static int num =33;
        String name;
        public InnerClass()
        {
            System.out.println("Default constructor as the parameterised cons.. is defined");
        }
        public InnerClass( String naam)
        {
            this.name = naam;
        }

        public String toString()
        {
            
        }
        public void  print(String line)
        {
            System.out.println("Line : " +  line);
        }

    }

    public static void main(String[] args) {

        InnerClass innObj = new InnerClass("Pramod");
        InnerClass innObj2 = new InnerClass("Pradeep");
        System.out.println(" Object Value : " + innObj);
        System.out.println("num : " + InnerClass.num  );


      //  NonStatic  non_obj =  new NonStatic();  // error: non-static variable this cannot be referenced from a static context
        // System.out.println("Non-Static obj : "+ non_obj);

        String linearg = "Hey! my name Is Sam.";
         innObj.print(linearg);
       
         OutterClass outObj = new OutterClass();
        //  outObj.mayBeStatic();

        
        System.out.println(innObj.name);
        System.out.println(innObj2.name);
   }
    
}

