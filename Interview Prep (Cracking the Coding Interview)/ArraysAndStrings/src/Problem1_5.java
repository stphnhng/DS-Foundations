import java.util.HashMap;
import java.util.Set;

public class Problem1_5 {
	
	public static void main(String[]args){
		Problem1_5 run = new Problem1_5();
		String result = run.compressString("aabcccccaaa");
		System.out.println(result);
	}
	
	public String compressString(String word){
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for(int i = 0; i < word.length(); i++){
			String letter = word.charAt(i) + "";
			if(!countMap.containsKey(letter)){
				countMap.put(letter, 0);
			}
			countMap.put(letter, countMap.get(letter) + 1);
		}
		String result = "";
		for(String key : countMap.keySet()){
			result += key + Integer.toString(countMap.get(key));
		}
		if(result.length() == word.length()){
			return word;
		}
		return result;
	}
	
	
}
