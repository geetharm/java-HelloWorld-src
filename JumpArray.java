import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();

		for (int count = 0; count < num; ++count) {
			String inputString = sc.nextLine();

			String[] s1 = inputString.split("\\s");

			int n = Integer.parseInt(s1[0]);
			int m = Integer.parseInt(s1[1]);
			int[] array = new int[n];

			String inputString1 = sc.nextLine();
			int cnt = 0;

			for (String s2 : inputString1.split("\\s")) {
				array[cnt] = Integer.parseInt(s2);
				++cnt;
			}

			int number = 0;
			boolean flag = false;
			boolean visitFlag = false;
			while (number < (array.length - 1)) {
				if (number + m >= array.length) {
					flag = true;
					break;

				} else if ((number + m < array.length) && (array[number + m] == 0)) {

					number += m;
					visitFlag = false;
					System.out.println("Inside +m" + number);

				} else if ((number - 1 >= 0) && (array[number - 1] == 0)) {

					number -= 1;
					visitFlag = true;
					System.out.println("Inside -1" + number);
				} else if ((number + 1 < array.length) && (array[number + 1] == 0)) {
					if (visitFlag)
						break;
					number += 1;
					visitFlag = false;
					System.out.println("Inside +1" + number);

				} else {
					System.out.println("In else case");
					break;
				}

			}
			if ((flag) || (number == (array.length - 1))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		sc.close();

	}
}