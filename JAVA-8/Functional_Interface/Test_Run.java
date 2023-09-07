
// Java Program to demonstrate Functional Interface ( Interface with Only one abstract method )

public class Test_Run {
        public static void main(String[] args) {
            
            // create anonymous Inner class Object
            new Thread( new Runnable() {
              public void run(){
                System.out.println("New Thread created");
              }   
            }).start();
        }
}
