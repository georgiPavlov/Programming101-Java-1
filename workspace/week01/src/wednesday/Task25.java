package wednesday;

public class Task25 {
	
	double sumOfNumbers(String input) {
		int i = input.length()-1;
		int power = 0;
		double sum = 0;
		for(i=input.length()-1;i>=0;i--){
			if(!(Character.isDigit(input.charAt(i)))){
				power = 0;
			}
			else{
				sum =  sum + Character.getNumericValue(input.charAt(i)) * Math.pow(10, power);
				power++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task25 test = new Task25();

		System.out.println(test.sumOfNumbers("12 99 1"));

	}

}
