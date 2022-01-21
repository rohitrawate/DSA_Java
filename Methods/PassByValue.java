import java.util.Arrays;

import javafx.collections.ListChangeListener.Change;

// import java..util.Scanner;

public class PassByValue {

public static void main(String[] args) {
    
    String name = "Rohit R";
    changeName(name);

    System.out.println(name);

    System.out.println("Arrays Change with reference variable");
    int arr[] = {10, 20, 30, 40, 50};
    change(arr);
    System.out.println(Arrays.toString(arr));

  }

  // String are Final classes OR Immutable (Cannot be changed)  

  //  The Name changes only its
   static void changeName(String naam){     // Scope of variable defined in method remains in that method
    naam = "Pramod";     //   Creating a new object. 
   }

   //
   static void change(int nums[]){
      nums[0] = 99; //Refering to same object so Original object changes
   }    

}
