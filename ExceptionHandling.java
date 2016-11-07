import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		try {
			x = sc.nextInt();
			y = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			return;
		}


		try {
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}