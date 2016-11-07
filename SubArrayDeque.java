import java.util.*;

public class SubArrayDeque {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int uniqueSize = 0;

		Set<Integer> st = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			
		
			deque.addLast(num);
			st.add(num);
			
			if(i >= (m -1))
			{
				if(uniqueSize < st.size())
				{
					uniqueSize = st.size();
				}				
				int first = deque.removeFirst();
				if (!deque.contains(first))
					st.remove(first);
			
			}
		}
		
		System.out.println(uniqueSize);
	}
}
