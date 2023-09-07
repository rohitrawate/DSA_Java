
// Java Program to demonstrate Functional Interface ( Interface with Only one abstract method )
// Implementation of functional interface using lambda expressions

public class Test_Run {
        public static void main(String[] args) {
            
            // create anonymous Inner class Object
            new Thread( new Runnable() {
              public void run(){
                System.out.println("New Thread created");
              }   
            }).start();

            //Java 8 lambda Express
            new Thread ( () -> {
                System.out.println("calling abstract method Using lambda Express");
            }).start();
        }
}
