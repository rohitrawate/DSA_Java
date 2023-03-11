
import java.util.*;;

public class UserArrayList {
    
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public UserArrayList(){      //
        data = new int[DEFAULT_SIZE];
        // System.out.println(data.length);
    }
    public void add(int num){
        if( this.isFull()){
            resize();           // If Full Increase The SIZE
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[DEFAULT_SIZE * 2];
        // copy current ele to New Array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
       boolean compare =  size == data.length;  // Comparison of SIZE var with The Length of Array
        return  compare;
    }
    public int remove(){
        int removed = data[size--];
        return removed;
    }


    public void println()
    {

       for( int i =0 ; i <this.size ; i++)
       {
         System.out.print( this.data[i] +" " );
       }

    }

     public static void main(String[] args) {
        System.out.println("Good");
        UserArrayList obj = new UserArrayList();
        
        // Iterator it = new Iterator<Integer>();

        obj.add(24);
        obj.add(4);
        obj.add(99);
        obj.add(7);
        obj.add(24);
        obj.add(4);
        obj.add(99);
       


        obj.println();

        System.out.println("obj.size : "+ obj.size);
        
        obj.remove();
        obj.println();
        System.out.println("obj.size : "+ obj.size);
    }
}
