// package Static_keyword;

public class Shadowing {
    // public class ShadowTest {

        public int x = 0;
    
        class FirstLevel {
    
            public int x = 1;
    
            void methodInFirstLevel(int x) {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);   //  this.x -> this refers to the class members
                
                System.out.println("ShadowTest.this.x = " + Shadowing.this.x);
            }
        }
    
        public static void main(String... args) {
            Shadowing st = new Shadowing();
            Shadowing.FirstLevel fl = st.new FirstLevel();
            fl.methodInFirstLevel(23);
        }
    // }
}
/*  --- OUTPUT ---
    x = 23
    this.x = 1
    ShadowTest.this.x = 0
 */