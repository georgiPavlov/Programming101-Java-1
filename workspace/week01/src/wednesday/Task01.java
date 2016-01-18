package wednesday;

public class Task01 {
	
	//Return whether n is an odd number

	boolean isOdd(int n) {
		return !(n % 2 == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task01 test = new Task01();
		System.out.println(test.isOdd(3));
	}

}
