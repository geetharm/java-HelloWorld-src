import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniqueSet {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		HashSet<String> hSet = new HashSet<String>();

		for (int num = 0; num < count; ++num) {
			hSet.add(sc.nextLine());
			//hSet.add(sc.next());

			System.out.println(hSet.size());
		}

	}
}