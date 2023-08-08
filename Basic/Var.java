public class Var {
    

    int inst_var = 9;      // Instance Variable
    static int stat = 5;   // Static Variable

    public static void main(String[] args) {
        
        String Local = "Local";
        System.out.println( Var.stat);

        Var obj1 = new Var();
        Var obj2 = new Var();

        obj1.inst_var = 909;
        System.out.println("Obj1  insta : "+ obj1.inst_var);
        System.out.println("Obj1  stat : " + obj1.stat);
        
        stat = Var.stat +100;
        System.out.println("obj2 insta : " + obj2.inst_var);
        System.out.println("obj2 stat : " +  obj2.stat);         
        
        System.out.println("Obj1  stat : " + obj1.stat);


 
         obj1.Method();
        System.out.println( Local);

    }

    void Method(){
        System.out.println();
    }

}
