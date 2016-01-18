package wednesday;

public class Task26 {
	boolean anagram(String A, String B) {
		boolean result = false;
		int equalCharactersCount=0;
		int i = 0;
		int j = 0;
		A=A.toLowerCase();
		B=B.toLowerCase();
		if (!(A.length() != B.length())) {

			for (i = 0; i < A.length(); i++) {
				for(j=0;j < A.length(); j++){
					if(A.charAt(i)==B.charAt(j)){
						equalCharactersCount++;
						break;
					}
				}
			}

		} else {
			return false;
		}
		if(equalCharactersCount==A.length()){
			result = true;
		}
		
		return result;
	}
	public static void main(String[] args) {
		Task26 test = new Task26();
		System.out.println(test.anagram("Mary","Army"));
		System.out.println(test.anagram("army", "aaaa"));
		
	}
}
