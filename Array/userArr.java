import java.util.Scanner;


class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class userArr {
    public static void main(String[] args) {
       
        Student[] arr;

       arr = new Student[5];          // allocating memory for 5 objects of type Student.

        arr[0] = new Student(1 , "Aman");   // initialize the first elements of the array
        arr[1] = new Student(2,"vaibhav");
        arr[2] = new Student(3,"shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);
        }
        

}
}
    

