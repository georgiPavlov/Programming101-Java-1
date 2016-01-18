package wednesday;

public class Task02 {
	
	public boolean isPrime(int n) {
		int i = 0;
		boolean result = true;
		for (i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task02 test = new Task02();
		System.out.println(test.isPrime(2));
	}

}
