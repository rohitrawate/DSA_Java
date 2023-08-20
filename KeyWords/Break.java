public class Break {

    // Using break as a Form of Goto
    public static void main(String[] args) {
        
        boolean t = true;
        first :{
            System.out.println("First : ");
        // }
        second: {
            System.out.printf("Second");
          third : {  

              if( t){
                  break first;
                }
                System.out.println("In Third : ");
            } 
             System.out.println(" This is under Secondd:"); 
         }
        }
    }
}
