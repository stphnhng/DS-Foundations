import java.util.Arrays;

public class Problem1_3 {

	public static void main(String[]args){
		Problem1_3 run = new Problem1_3();
		boolean result = run.isPermutation("Hello", "World");
		System.out.println(result); // is false
		result = run.isPermutation("Hello", "olelH");
		System.out.println(result); // is true
	}
	
	public boolean isPermutation(String word1, String word2){
		int[] arr1 = generateArray(word1);
		int[] arr2 = generateArray(word2);
		return(Arrays.equals(arr1, arr2));
	}
	
	public int[] generateArray(String word){
		int[] result = new int[256];
		for(char letter : word.toCharArray()){
			result[letter]++;
		}
		return result;
	}
}
