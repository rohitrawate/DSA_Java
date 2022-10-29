


//  Compile Time    either the Number of Arguments or the Type of argument should be diffeerent
public class Overloading {
public static void main(String[] args) {
    
    add(12, 8);         // add called
    String me = "Rohit";
     name(me);               //  name called
    //  System.out.println("In main method "+ me);
     
     compileTime("PrintJAVA");
     compileTime(8876);
  } 

  static void add(int a, int b){
    int c = a + b;
    System.out.println("Sum = "+c );
  }

  static void name(String author){
      author = "Hello " + author;
      author = author.toUpperCase();
     System.out.println(author);
  }

    static void compileTime(int a){
       System.out.println(  " Int type called() " +a);
     }

     static void compileTime(String java){
      System.out.println(" String type called() " + java);

    }
  

}
