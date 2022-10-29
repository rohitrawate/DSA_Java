public class FirstBadVersion {

    public static void main(String[] args) {
        
        int ans = firstBadVersion(8);
      System.out.println("ANS : "+ ans);

    }
    public static boolean isBadVersion(int x)
    {
        if(x == 75 || x == 97|| x == 96)
          return true;
        
          return false;

    }
    
    public static int firstBadVersion(int n)
    {
        int start =1, end = n ,pointer = -1;
        //  int x = n;    
        //  System.out.println("n: "+x);
     while(start <= end)
     {
         int mid = (start+end) /2;
         System.out.println("Mid : "+mid);
         boolean checkV = isBadVersion(mid);
         System.out.println("checkV: "+checkV);
         if(checkV == false)
         {   start = mid+1;            //   mid = mid-1;
            System.out.println("start in if :start== "+start+" end:== "+end);
         }
         else
         {   end = mid-1;         // mid = mid+1;
        //    int pointer = mid;
            System.out.println("pointer  in esle: end== "+ end);
         } 
      }
      return pointer;
    }

}
