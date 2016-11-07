import java.util.*;

public class BracketsStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while (sc.hasNext()) {
			String input = sc.next();

			// System.out.println(input);

			char[] array = input.toCharArray();
			boolean flag = false;
			
			Stack st = new Stack();
			for (char chArray : array) {
				if ((chArray == ')') || (chArray == ']') || (chArray == '}')) {
					if(!st.isEmpty())
						st.pop();
					else
					{
						System.out.println("false");
						flag = true;
						break;
					}
				} else {
					st.push(chArray);
				}

			}
			
			if(flag)
				continue;

			if (st.isEmpty())
				System.out.println("true");
			else
				System.out.println("false");
		}

		sc.close();

		// Complete the code

	}
}
