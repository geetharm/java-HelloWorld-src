import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OrderArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	int count = sc.nextInt();
    	sc.nextLine();
    	ArrayList[] array = new ArrayList[count];
    	
    	for(int num = 0; num < count; ++num)
    	{
			ArrayList<Integer> list = new ArrayList<Integer>();
			array[num] = list;
			int aCount = sc.nextInt();
    		for(int n = 0; n < aCount; ++n)
    		{
    			list.add(sc.nextInt());  			
    		}
    		
    		//System.out.println(list.size());
    	}
    	
    	int query = sc.nextInt();
    	for(int num = 0; num < query; ++num)
    	{
    		int line = sc.nextInt();
    		int pos = sc.nextInt();
    		
    		line-=1;
    		pos-=1;
    		
    		//System.out.println(array[line].size());
    		if(pos < array[line].size())
    		{
    			System.out.println(array[line].get(pos));
    		}
    		else
    		{
    			System.out.println("ERROR!");
    		}
    	}
    }
}