
import java.util.*;

public class HelloWorld {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println(sc.nextInt()); System.out.println(sc.nextInt());
		 * System.out.println(sc.nextInt());
		 */

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s", s1);
            System.out.printf("%03d\n", x);
            //Complete this line
        }
        System.out.println("================================");

		
		sc.close();
	}
}
