
import java.util.ArrayList;
import java.util.Arrays;

public class Generics<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =  0 ; // also working as Index value

    public Generics()
    {
        data = new Object[DEFAULT_SIZE ];
    }

    public <T> void add( T num )
    {
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void resize()
    {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) 
        {
           temp[i] = (T)(data[i]);   
        }
          data = temp;
    }

    public boolean isFull()
    {
        return size == data.length;
    }

    public T remove()
    {
        T removed = (T) data[size--];
        return removed;
    }

    public int size()
    {
        return size;
    }
    public T get( int index)
    {
       return (T) data[index];
    }

    // public void set( int index, T value)
    // {
    //     data[index] = value;
    // }

    public <T> void print()
    {
       for (int i = 0; i < size; i++) 
       {
          System.out.println(data[i]);
       } 
    }

    
    public static void main(String[] args) {
        
        Generics list = new  Generics();
        Generics<Integer> list1 = new  Generics<>();
        System.out.println("WORking...");
        
        list.add(88);
        list.add(76);
        list.add(2);
        list.add(89);
        
        list.print();
        
        list.remove();
        System.out.println("Removed");
        list.print();
        System.out.println("Size : "+ list.size());
        ;
        System.out.println(list.get(1));
        // System.out.println( list.print()  );
    }
}
