

class Temp
{
   {
        System.out.println("init");
    }
    Temp()
    {
        System.out.println("default");
    }
    Temp(int x)
    {
        System.out.println(x);
    }
 
    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }

}
public class initBlock {
    public static void main(String[] args) {
        
        new Temp();
        // init block
        // second
        // default

        new Temp(123);
        // init block
        // second
        // 123
    }
   
}
