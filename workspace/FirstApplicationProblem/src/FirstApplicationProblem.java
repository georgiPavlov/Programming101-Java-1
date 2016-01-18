import java.util.Scanner;


public class FirstApplicationProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,x,currentx,y,currenty;
		String str;
		boolean flag=false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string(example:>>>+<~>>>~^^^)");;
		str=input.next();
		System.out.println("Enter x:");
		x=input.nextInt();
		System.out.println("Enter y:");
		y=input.nextInt();

		for(i=0;i<str.length();i++){
			if(!flag){
				if(str.charAt(i)=='>')x++;
				if(str.charAt(i)=='<')x--;
				if(str.charAt(i)=='v')y++;
				if(str.charAt(i)=='^')y--;
				if(str.charAt(i)=='~')flag=true;

			}
			else{
				if(str.charAt(i)=='>')x--;
				if(str.charAt(i)=='<')x++;
				if(str.charAt(i)=='v')y--;
				if(str.charAt(i)=='^')y++;
				if(str.charAt(i)=='~')flag=false;
			}
		}

		System.out.println("final position:("+x+","+y+")");;


		}
	}

