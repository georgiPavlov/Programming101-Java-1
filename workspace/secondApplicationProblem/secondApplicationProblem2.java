
public class secondApplicationProblem2 {
	
	public static int checkForwardHorizontally(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			b++;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
	}
	public static int checkForwardVertically(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			a++;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
	}
	public static int checkForwardDiagonally(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			a++;
			b++;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
		
	}
	public static int checkBackwardHorizontally(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			b--;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
	}
	public static int checkBaskwardVertically(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			a--;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
	}
	public static int checkBackwardDiagonally(int a,int b,String str,char [][]table){
		int x=0,wordcount=0,matchingCharacters=0;
		while(table[a][b]==str.charAt(x)){
			a--;
			b--;
			x++;
			matchingCharacters++;
		}
		if(matchingCharacters==str.length())wordcount++;
		
		return wordcount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,wordcount=0;
		char table[][] = {'a','n','a','a','n','a','a','n','a'};
		String str = "ana";
		for(i=0;i<3;i++){
			if((3-str.length())>=str.length()||(3-str.length())==0)wordcount=wordcount+checkForwardVertically(i,j,str,table);
			if((3-str.length())>=str.length()||(3-str.length())==0)wordcount=wordcount+checkForwardDiagonally(i,j,str,table);
			for(j=0;j<3;j++){
				if((3-str.length())>=str.length()||(3-str.length())==0)wordcount=wordcount+checkBackwardVertically(i,j,str,table);
				if((3-str.length())>=str.length()||(3-str.length())==0)wordcount=wordcount+checkBackwardDiagonally(i,j,str,table);
			}
		}
		System.out.println(wordcount);
	}

}
