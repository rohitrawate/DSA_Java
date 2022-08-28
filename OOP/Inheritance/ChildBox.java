// import java.sql.ClientInfoStatus;

//  package Inheritance;

public class ChildBox extends Base{

    double weight;
   
    public ChildBox()
    {
        double weight = -1;
    }
    
    public ChildBox(double l, double w, double h)
    {
        //super(l, w, h); // Directly above current class. To call the constructor
        this.weight = l * w * h;
    }

    public ChildBox(double l, double w, double h,  double weight)
    {
        super(l,w,h); // If there is no Super() to call to instant parent class the   
                   // `Default` Constructor/method in parent class will be called
        this.weight = weight; 
    }

    void info()
    {
        System.out.println("Running Inside ChildBox");
        System.out.println(this.len+ " | "+ this.breadth+" | "+ this.height+" | "+this.weight);
    }

}
