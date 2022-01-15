import java.util.Scanner;

class var_Check{

         int instance_var;
         static int stat_var= 007;

}




public class Variables{
     
    public static void main(String args[]) {
         System.out.println(" Local Vs Instance V Static Variables");
         
        //  var_Check in = new Scanner(System.in);
          var_Check  obj = new var_Check();
          var_Check  obj2 = new var_Check();

          int instance_var1= obj.instance_var+5;
          int stat_var= obj.stat_var+100;

          System.out.println("instance Var :"+ obj.instance_var);
          System.out.println("New instance Var :"+ instance_var1);
          System.out.println("Static Var :"+ var_Check.stat_var);
          System.out.println("New Static Var :"+ stat_var);
          System.out.println("Obj 2 instance var :"+ obj2.instance_var+1);
          System.out.println("Obj 2 Static var :"+ obj2.stat_var);


    }


}