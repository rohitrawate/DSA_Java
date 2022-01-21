


//  Compile Time    either the Number of Arguments or the Type of argument should be diffeerent
public class Overloading {
public static void main(String[] args) {
    
    add(12, 8);
    String me = "Rohit";
     name(me);
     System.out.println("In main method "+ me);
     
     
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

}
