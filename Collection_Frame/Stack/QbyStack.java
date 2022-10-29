// package Stack;
import java.util.List;
import java.util.Stack;


 class MyStack{

    public List<Integer> st;
    MyStack()
    {
         st = new Stack<>();
        System.out.println(" Object Called :");
    }

    public void pushsh(int x)
    {
        // st.add(x);
        st.add(st.size(), x);
        // st.
        System.out.println("Added : "+x);
    }
     
    public int peek()
    {
        System.out.println("Peek : "+ st.get(0));
        return st.size();
    }
    public void print()
    {
        System.out.println(st);
        for(int i=0; i < st.size(); i++)
        {
            System.out.println("[ "+i+" = "+st.get(i)+" ]");

        }
    }
    
    public int pop()
    {
        int poped =0;
        if(st.size()>=0)
        {
           poped = st.remove(0);
           System.out.println( "Poped : "+poped);
        }
        else
        {
            System.exit(-1);
            System.out.println("Queue Empty " );
        }
        return poped;
      }
}



public class QbyStack
{
    public static void main(String[] args) {
        
        System.out.println(" --- Q using Stack --- ");

        MyStack Obj = new MyStack();

        Obj.pushsh(99);
        Obj.pushsh(44);
        Obj.pushsh(12);
        Obj.print();
        Obj.pop();
        Obj.pushsh(909);
        // Stack<Integer> st = new Stack<>();
        // System.out.println(st);

        Obj.peek();
        Obj.pop();
        Obj.pop();
        Obj.print();
        Obj.pop();

        Obj.print();
        // Obj.pop();


    }

}