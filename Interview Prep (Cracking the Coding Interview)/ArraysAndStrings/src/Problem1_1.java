import java.util.HashSet;
import java.util.Set;

public class Problem1_1 {
	
	public static void main(String[]args){
		Problem1_1 run = new Problem1_1();
		boolean result = run.hasUnique("asdf");
		System.out.println(result); // is true
		result = run.hasUnique("asdff");
		System.out.println(result); // is false
	}
	
	
	public boolean hasUnique(String word){
		Set<Character> charList = new HashSet<Character>();
		for(char a : word.toCharArray()){
			if(charList.contains(a)){
				return false;
			}
			charList.add(a);
		}
		return true;
	}
}
