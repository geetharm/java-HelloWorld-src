import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] array = A.toCharArray();
        boolean palindrome = true;

        int start = 0;
        int end = array.length -1;
        
        while(start < end){
        if(array[start] != array[end])
        {
        	palindrome = false;
        	break;
        }
    	++start;
    	--end;
        
        }

        System.out.println(palindrome? "Yes":"No");
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        
    }
}