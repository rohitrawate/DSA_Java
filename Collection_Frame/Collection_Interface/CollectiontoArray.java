import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Stream; 


// public class JavaCollectcionToArrayExample2 {  
public class CollectiontoArray {

    public static void main(String[] args) {  

        Collection<Integer> collection = new ConcurrentLinkedQueue();  

        System.out.println("List of even numbers in our collection.");  
        for (int i=1;i<=10;i++) {  
            collection.add(i);  
        }  
        Integer[] a = new Integer[5];  
        Integer[] b =  collection.toArray(a);  

        // Object[] obj = collection.toArray(null);
        System.out.println("++++++++++++++++++");
        // for (int i = 0; i < obj.length; i++) {
        //     System.out.println( "Elements : "+ obj[i] );
        // }

        collection.toArray(a);
        for (int i=0;i<a.length;i++) {  
            System.out.println(a[i]+" ");  
        }

        System.out.println("-------");  
        for (int i = 0; i <b.length; i++) {  
        if (b[i] %2==0) {  
        System.out.println(b[i]+" ");  
                    }  
                } 
                
        ToArray   obj1 = new ToArray();   

        obj1.convertToArr();
    }
}

class ToArray {

    public void convertToArr(){
        System.out.println("------- Convert To Array -------");
        Collection<String> strList = new ArrayList<>();
        // Collection strList2 = new ArrayList<>();
        
        strList.add("Hello,");
        strList.add("Code");
        strList.add("to");
        strList.add("Convert");
        strList.add("Collection");
        strList.add("toArray");
        int x = 999;
        // strList.add(x);  // Can be added to this list as The generics Type is Not defined
        

        System.out.println(strList);
        // strList2.add("Hello,");
        
        // Boolean equal = strList.equals(strList);

        Stream<String> strm = strList.stream();
        Spliterator<String> split =  strList.spliterator(); 
        // System.out.println( "equal : " +  split.forEachRemaining( System.out.println() ) ) ;
        System.out.println( split.estimateSize() );
        System.out.println( split.getExactSizeIfKnown() );
        // System.out.println( strm.characteristics() );

        // Spliterator<String> splitr2 = strList.trySplit();

        // if(splitr2 != null) { 
        // System.out.println("Output from splitr2: "); 
        // System.out.println("Output from splitr2: "); 
        // splitr2.forEachRemaining((n) -> System.out.println(n)); 
        // } 

        System.out.println( "HashCode : " + strList.hashCode());
    }

}