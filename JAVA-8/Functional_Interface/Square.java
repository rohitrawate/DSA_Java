

@FunctionalInterface
 interface Square_Interface{
    int calculate(int x);  // abstract and final by Default
}

public class Square {
    public static void main(String[] args) {
        
        int a = 5;

        // lambda Express to define  calcu method
        Square_Interface s = ( int z ) -> z * z ;

        int ans = s.calculate(a);
        int ans1 = s.calculate(12);
        System.out.println("Ans : "+ans +"\n"+ ans1);
    }    
}
