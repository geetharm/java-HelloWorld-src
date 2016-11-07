import java.util.*;

public class Anagrams {

	static boolean isAnagram(String A, String B) {
		// Complete the function
		if(A.length() != B.length())
			return false;
		
		List<Character> Achars = getCharList(A.toLowerCase());
		List<Character> Bchars = getCharList(B.toLowerCase());
		
		for(Character a:Achars)
		{
			if(Bchars.contains(a))
			{
				Bchars.remove(a);
			}
			else
				return false;
		}
		
		return true;
	}

	static List<Character> getCharList(String A) {
		char[] Achars = A.toCharArray();
		List<Character> AcharSet = new ArrayList<>();

		for (char a : Achars) {
			AcharSet.add(a);
		}
		return AcharSet;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

		sc.close();
	}
}