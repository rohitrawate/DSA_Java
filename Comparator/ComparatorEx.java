
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class Student{

    int roll_no;
    String name;

    public Student( int roll_no, String name)
    {
        this.name = name;
        this.roll_no = roll_no;
    }


    public String toString()
    {
        return "Cust = "+ "Name : "+ name + " ;  Roll_no : "+roll_no;
    }
}

// class SortingComparator implements Comparator<Student> 
 class SortingComparator implements Comparator<Student> { 

    public int compare(Student stud1, Student stud2)
    {
        int NameCompare = stud1.name.compareTo(stud2.name);

        int RollCompare =  stud1.roll_no - stud2.roll_no;

        return NameCompare == 0 ? RollCompare : NameCompare;
    }

   

}

public class ComparatorEx {
    public static void main(String[] args) {
        
        List<Student> al = new ArrayList<Student>();
        
        al.add( new Student(111 , "Pradeep"));

        Student obj1 = new Student(131, "Ritesh");
        Student obj2 = new Student(121, "Rohit");
        Student obj3 = new Student(102, "Ajay");
        Student obj4 = new Student(100, "Mayank");
        Student obj5 = new Student(101, "Ajay");

        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);


        Iterator<Student> studIterator =  al.iterator();

        while( studIterator.hasNext())
        {
            System.out.println(studIterator.next());
        }

        Collections.sort(al, new SortingComparator());
        
        System.out.println("After Sorting");
    
        for (Student Customer : al) {
            System.out.println(Customer);
        }
    }
}
