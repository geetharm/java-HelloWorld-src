import java.util.*;
import java.io.*;

class Maps{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map names = new HashMap();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         names.put(name, phone);
      }
      
      //System.out.println(names.size());
      
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(names.containsKey(s))
        	 System.out.println(s + "=" + names.get(s));
         else
        	 System.out.println("Not found");
      }
      
      in.close();
      

   }
}
