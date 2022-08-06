public class Repetition {
    public static void main(String[] args) {
        
     CountOccurrnce.countrep( 00000000000000000000000000001011, 1 );


    }
}

 class CountOccurrnce {
   
    static int countrep(int x, int num)
    {
        int count = 0;
        while(x > 0)
        {
            System.out.println("x = "+x);
            long r = x % 10;
            if( r == num ) 
              count++;
              x /= 10;
              System.out.println("x /= "+x);
        }
        System.out.println("count of "+num +" = "+count);
        return count;
     
    }

}
