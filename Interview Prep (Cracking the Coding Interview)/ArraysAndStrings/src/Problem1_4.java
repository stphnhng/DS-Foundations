
public class Problem1_4 {
	
	public static void main(String[]args){
		Problem1_4 run = new Problem1_4();
		String result = run.addUnicode("Hello World World", 22);
		System.out.println(result);
	}
	
	
	public String addUnicode(String word, int length){
		char[] result = new char[length];
		for(int i = 0; i < word.length(); i++){
			result[i] = word.charAt(i);
		}
		for(int i = 0; i < length; i++){
			if(result[i] == ' '){
				result[i] = '%';
				for(int j = length-1; j > i; j--){
					result[j] = result[j-2];
				}
				result[i+1] = '2';
				result[i+2] = '0';
			}
		}
		return new String(result);
	}
}
