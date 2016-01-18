package friday;

import wednesday.Task19;

public class Task29 {

	StringBuilder Binary(long x) {
		StringBuilder binNumber = new StringBuilder();

		do{
			if(x%2==0){
				binNumber.append('0');
			}
			else{
				binNumber.append('1');
			}
			x=x/2;
		}while(x!=0);

		return binNumber;
	}

	boolean hasOddNumberOfOnes(StringBuilder binNumber) {
		boolean result = false;
		int i = 0;
		int count = 0;
		for (i = 0; i < binNumber.length(); i++) {
			if (binNumber.charAt(i) == '1') {
				count++;
			}

		}
		if (!(count % 2 == 0)) {
			result = true;
		}
		return result;
	}

	boolean isHack(int n) {
		boolean result = false;
		Task19 t = new Task19();
		if(hasOddNumberOfOnes(Binary(n))&&(t.isPalindrome(Binary(n).toString()))){
			result = true;

		}
		return result;
	}
	
	int nextHack(int n){
		int result = n + 1;
		while(!isHack(result)){
			result++;
		}
		return result;
	}
	public static void main(String[] args) {
		Task29 test = new Task29();
		System.out.println(test.isHack(6));
		System.out.println(test.nextHack(7));
	}
}
