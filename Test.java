
import java.util.*;

public class Test {
	
	public static void main (String args[])
	{
        Scanner sc=new Scanner(System.in);
        String A =sc.next();
        int length =sc.nextInt();

        String minString;
        String maxString;
        int endIndex = length;
        
		minString = maxString = A.substring(0, endIndex);    
        for(int count = 0; endIndex < A.length(); ++count)
        {
        	String sString;
        	endIndex = count + length;
        	
        	sString = A.substring(count, endIndex); 
        	if(sString.compareTo(maxString) >= 1)
        		maxString = sString;
        	else if(sString.compareTo(minString) <= 1)
        		minString = sString;
        }
        
        System.out.println(minString);
        System.out.println(maxString);
        
       sc.close();
        
	}
}