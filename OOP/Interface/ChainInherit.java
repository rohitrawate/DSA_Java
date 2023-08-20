// package Interface;


interface A {
    void method1();
    void method2();
}

interface B extends A{
    void method3();
    String toString();  // has Methods from Object Class

}

public class ChainInherit implements B {

    public static void main(String[] args) {
        ChainInherit obj = new ChainInherit();
        A  intObj = obj;        // reference Varof Interface 
        intObj.getClass();
        intObj.toString();
        obj.method1();
        obj.method2();
        obj.method3();
    }

    @Override
    public void method1() {
        System.out.println("Method-1");
        }

    @Override
    public void method2() {
        System.out.println("Method-2");
         }

    @Override
    public void method3() {
        System.out.println("Method-3");
      }
    
}
