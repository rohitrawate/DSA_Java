public class breakState {
    public static void main(String[] args) {
        
        for( int i=0; i < 10; i++)
        {
            for (int j = 0; j < args.length; j++) {
                if( i == 7)
                {
                    break;
                }
                System.out.println("i : "+i +" j : " +j);
            }
            System.out.println(" --->  i : "+i );
        }
    }
}
