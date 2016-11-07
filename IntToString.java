
import java.util.*;
import java.security.*;
public class IntToString {
	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			int testCases = in.nextInt();
			
			for(int count = 0; count < testCases; ++count)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();

/*				if (n == 1) {
					int sum = 0;
					sum = a + b;
					System.out.println(sum);
					continue;
				}*/
				
				int[]array = new int[n];


					
			for(int i = 0; i < n; ++i)
			{
				int sum = 0;
				for(int j = 1; j <= i; ++j)
				{
					sum += Math.pow(2, j) * b;
				}

				//System.out.println("sum:" + sum);
				array[i] = sum + a + b; 
			}
			
			for(int num:array)
			{
				System.out.printf("%d\t", num);
			}
			System.out.printf("\n");
			}
			in.close();

			
	

	}
}

