package wednesday;

public class Task17 {
	public String reverseMe(String argument){
		String reverseArgument="";
		int i=0;
		for(i=argument.length()-1;i>=0;i--){
			reverseArgument = reverseArgument+argument.charAt(i);
		}
		return reverseArgument;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task17 test = new Task17();
		System.out.println(test.reverseMe(" abcd "));
	}

}
 