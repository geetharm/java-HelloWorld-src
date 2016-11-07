import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         *  Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] array = new int[num];
		int negativeArray = 0;

		sc.nextLine();
		String s = sc.nextLine();
		int cnt = 0;
		
		for(String s1 : s.split("\\s"))
		{
			array[cnt] = Integer.parseInt(s1);
			++cnt;
		}
		
		sc.close();
		

		for(int count = 0; count < array.length; ++count)
		{
			int sum = 0;
			for(int j = count; j < array.length; ++j)
			{
				sum += array[j];
				if(sum < 0)
					++negativeArray;
			}
		}
		
		System.out.println(negativeArray);
    }
}