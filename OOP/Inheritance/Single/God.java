// package Inheritance.Single;


class Parent {
protected void weekend(){
    System.out.println(" Learn Java ");
}
}
class Children extends Parent{
    protected void weekend(){
        System.out.println(" Learn Java + Spring Boot");
    }

}
public class God {
  public static void main(String[] args) {
    
    // Children child =  new Children();
    Parent child =  new Children();
    child.weekend();   // -->  Learn Java + Spring Boot
  }   
}
