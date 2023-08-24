import javax.smartcardio.CardPermission;

class Complex {
      double re, im;

    Complex(double re , double im){
        this.re = re;
        this.im = im;
    }
    // Copy constructor
    Complex( Complex c){
        System.out.printf("Copy Constructor : ");
        re = c.re; 
        im = c.im;
    }
    @Override
     public String toString(){
        return "(" + re + " + " + im + "i)";
    }

}
public class Constructor {
    public static void main(String[] args) {
        Complex c1 = new Complex( 19 , 23);

        Complex c2 = new  Complex(c1);    //  involves a copy constructor call
    
        System.out.println(c1.toString());

        Complex c3 =  c1;
        System.out.println(c2.toString());
        c1.im = 88; 
        c1.re =909;
        // c1 = new Complex(11,11);
        System.out.println(c2.toString());   // NO changes in c2 as it is COpy const obj
    }
}
