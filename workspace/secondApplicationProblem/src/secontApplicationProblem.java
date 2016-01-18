import java.util.List;
import java.util.*;


public class secontApplicationProblem {

	/**
	 * @param args
	 */
	public static int checkForwardHorizontally(int i,int j,char [][]array,String str){
		int b,matchingCharacters=0,wordcount=0;
		
		b=j;
		System.out.println("array["+i+"]["+b+"]=" + array[i][b] );
		while(array[i][b]==str.charAt(b%str.length())){
			System.out.println("array["+i+"]["+b+"]=" + array[i][b] );
			b++;
			matchingCharacters++;
			if(b==str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkForwardVertically(int i,int j,char [][]array,String str){
		int a=0,matchingCharacters=0,wordcount=0;
		System.out.println("i:"+a + "a:" + j + "str:" + str);
		
		a=i;
//		System.out.print("array["+a+"]["+j+"]=" + array[a][j] );
		while(array[a][j]==str.charAt(a%str.length())){
			System.out.println("array["+i+"]["+a+"]=" + array[a][j] );
			matchingCharacters++;
			a++;
			if(a==str.length())break;
		}
		a=0;
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkForwardBelowMajorDiagonall(int i,int j,char [][]array,String str){
		int a,b,matchingCharacters=0,wordcount=0;
		a=i;b=j;
		while(array[a][b]==str.charAt(a%str.length())){
			matchingCharacters++;
			a++;
			b++;
			if(a==str.length()||b==str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkForwardAboveMajorDiagonall(int i,int j,char [][]array,String str){
		int a,b,matchingCharacters=0,wordcount=0;
		a=i;
		b=j;
		while(array[a][b]==str.charAt(a%str.length())){
			matchingCharacters++;
			a++;
			b++;
			if(a==str.length()||b==str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkBackwardHorizontally(int i,int j,char [][]array,String str){
		int b=0,matchingCharacters=0,wordcount=0,n=0;
		b=j;
		System.out.println("b:" + b + "i:" + i);
		while(array[i][b]==str.charAt(n)){System.out.println("b:" + b + "j:" + j);
			
			matchingCharacters++;
			b--;
			n++;
			if(b==0)break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkBackwardVertically(int i,int j,char [][]array,String str){
		int a=0,matchingCharacters=0,wordcount=0,n=0;
		a=i;
		System.out.println("a:" + a + "j:-):" + j);
		while(array[a][j]==str.charAt(n)){
			System.out.println("a:" + a + "j:-)" + j);
			matchingCharacters++;
			a--;
			n++;
			if(a==0||a>str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
		
	}
	
	public static int checkBackwardBelowMajorDiagonall(int i,int j,char [][]array,String str){
		int a=0,b=0,n=0,matchingCharacters=0,wordcount=0;
		a=i;
		b=j;
		while(array[a][b]==str.charAt(n)){
			matchingCharacters++;
			a--;
			b--;
			n++;
			if(a==0||b==0||a>str.length()||b>str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static int checkBackwardAboveMajorDiagonall(int i,int j,char [][]array,String str){
		int a=0,b=0,matchingCharacters=0,wordcount=0,n=0;
		a=i;
		b=j;
		while(array[a][b]==str.charAt(n)){
			matchingCharacters++;
			a--;
			b--;
			n++;
			if(a==0||b==0||a>str.length()||b>str.length())break;
		}
		if(matchingCharacters==str.length()){
			wordcount++;
		}
		return wordcount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,x,max=0,n=0,a=0,b=0,count=0,wordcount=0,maxCharacters=0;
		
		String str;
		ArrayList<String> rows = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data to fill the talbe:");
		System.out.println("Each line is a row,and elements must be sepparated with a space,for instance:");
		System.out.println("i v a n");
		System.out.println("--- --- ---");
		System.out.println("e **v** **n** h");
		System.out.println("i n **a** v");
		System.out.println("m v **v** **n**");
		System.out.println("q r **i** t ");
		System.out.println("Will result in the following table:");
		System.out.println("| i    | v     | a     | n     |");
		System.out.println("|---   |---    |---    |---    |");
		System.out.println("| e    | **v** | **n** | h     |");
		System.out.println("| i    | n     | **a** | v     |");
		System.out.println("| m    | v     | **v** | **n** |");
		System.out.println("| q    | r     | **i** | t     |");
		System.out.println("You should chose row size prior to the data entry.");
		System.out.println("Enter number of rows:");
		x=input.nextInt();
		str=input.nextLine();
		for(i=0;i<x;i++){
			str=input.nextLine();			
			rows.add(str);
		}
		
		for(i=0;i<x;i++){
			System.out.println(rows.get(i));
		}
		for(i=0;i<x;i++){
			if(rows.get(i).length()>max){
				max=rows.get(i).length();
			}
		}
		int charactersPerRowArray[] = new int [x];
		for(i=0;i<x;i++)charactersPerRowArray[i]=0;
		for(i=0;i<x;i++){
		if(rows.get(i).length()==max){
			str=rows.get(i);
			for(j=0;j<max;j++){
				if(Character.isLetter(str.charAt(j))){
					charactersPerRowArray[i]++;
				}
			}
		}
	}
		for(i=0;i<x;i++){
			if(charactersPerRowArray[i]>maxCharacters)maxCharacters=charactersPerRowArray[i];
		}
		
	char table[][]= new char[x][maxCharacters];
	for(i=0;i<x;i++){
//		System.out.println("--" + rows.get(i));
//		System.out.println(max);
//		System.out.println(count);
		for(j=0;j<rows.get(i).length();j++){
			
			if(Character.isLetter(rows.get(i).charAt(j))){
				//System.out.print(rows.get(i).charAt(j));
				table[i][n]=rows.get(i).charAt(j);
		//		System.out.print(table[i][n] + ".");
				n++;
			}
			
		}n=0;
	}
	for(i=0;i<x;i++){
		for(j=0;j<maxCharacters;j++){
			System.out.print(table[i][j]);
		}
		System.out.println();
	}
	System.out.println("enter a word for search");
	str=input.nextLine();
	i=0;j=0;
	System.out.println("max:"+maxCharacters);
	for(i=0;i<x;i++){
		System.out.println("i:" + i + "j:" + j);
		if(i<maxCharacters&&j<maxCharacters)wordcount=wordcount + checkForwardVertically(i,j,table,str);
		if(i<maxCharacters&&j<maxCharacters)wordcount=wordcount + checkForwardBelowMajorDiagonall(i,j,table,str);
		for(j=0;j<maxCharacters;j++){
			if(j<maxCharacters&&i<maxCharacters)wordcount=wordcount + checkForwardHorizontally(i,j,table,str);
			if(j<maxCharacters&&i<maxCharacters)wordcount=wordcount + checkForwardAboveMajorDiagonall(i,j,table,str);
		}
	//	System.out.println("-");
	}
	j=maxCharacters-1;
	for(i=x-1;i>=0;i--){
		if((i-str.length())>=0)wordcount=wordcount + checkBackwardVertically(i,j,table,str);
		if((i-str.length())>=0)wordcount=wordcount + checkBackwardBelowMajorDiagonall(i,j,table,str);
		for(j=maxCharacters-1;j>=0;j--){
			if((j-str.length())>=0)wordcount=wordcount + checkBackwardHorizontally(i,j,table,str);
			if((j-str.length())>=0)wordcount=wordcount + checkBackwardAboveMajorDiagonall(i,j,table,str);
		}
		j=maxCharacters-1;
	}
	System.out.println("Word Count is:" + wordcount);
	}
}
