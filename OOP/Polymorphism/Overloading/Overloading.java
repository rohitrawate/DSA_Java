// package Polymorphism.Overloading;


class ChangePoly{ 
     public int  Change(int a , int b){
        int equal =a+ b;
        System.out.println("In Integer : "+ equal);
        return equal;
    }

    public int Change( double x, double y){
        double equal = x + y;
        System.out.println("In Double : "+ equal);
        // return (int)(x+y);   
        return  (int)equal;
    }
   }
public class Overloading {
    
    public static void main(String[] args) {
        
        System.out.println("--- Overloading ----");

        ChangePoly obj = new ChangePoly();
        
        obj.Change(12, 8);
        obj.Change(12.6, 4);
        
        Overloading.main();                    // Int Null Arguments Main() 
        Overloading.main("WITH STRING");   // Args in String : WITH STRING

        // Overloading.sum(90, 10);  //error: reference to sum is ambiguous

    }

    public static void main()
    {
        System.out.println( " Null Arguments Main() ");
    }

    public static void main(String args)
    {
        System.out.println("Args in String : "+args);
    }


    // --***-- Type Promotion in case of ambiguity --***--
    static void sum(int a,long b){System.out.println("a method invoked");}  
    static void sum(long a,int b){System.out.println("b method invoked");}  


}

  