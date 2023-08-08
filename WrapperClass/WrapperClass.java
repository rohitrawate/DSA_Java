import java.util.ArrayList;

public class WrapperClass {
    
    public static void main(String[] args) {

    Double doubleValue = Double.valueOf("3.14"); // wrapping a string as a Double object
    double pi = doubleValue.doubleValue(); // converting the Double object back to a primitive double
    double db = doubleValue;  // Auto boxing
    System.out.println(db); // Output: 3.14


        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10); // autoboxing: adding primitive int directly to ArrayList
        numbersList.add(20);
        numbersList.add(30);

        int sum = 0;
        for (Integer num : numbersList) {
            sum += num; // unboxing: extracting the primitive int from the Integer object
        }
        System.out.println(sum); // Output: 60


        // In summary, wrapper classes in Java allow primitive data types to be used in scenarios where objects are 
        // required, such as collections, generics, and APIs designed to work with objects. They provide 
        // additional functionalities like converting between primitive data types and objects, and they 
        // are particularly useful when working with Java's extensive class libraries and APIs.


    }
}
