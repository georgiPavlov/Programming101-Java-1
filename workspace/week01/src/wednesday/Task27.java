package wednesday;

public class Task27 {

	boolean hasAnagramOf(String A, String B) throws Exception {
		
		boolean result = false;
		int i = 0;
		
		if(A.length()>B.length()){
			throw new Exception("IllegalArgumentException");
		}
		
		Task26 t = new Task26();
		for(i=0;i<(B.length()-A.length());i++){
			if(t.anagram(A, B.substring(i, i+A.length()))){
				result = true ; 
				break;
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		Task27 test = new Task27();
		System.out.println(test.hasAnagramOf("army", "asdfghj"));
		
	}
}
