package monday;

public class WordCountResult {
	private int mWordCount;
	private int mLinesCount;
	private int mCharactersCount;

	public WordCountResult() {
		this.mWordCount = 0;
		this.mLinesCount = 0;
		this.mCharactersCount = 0;
	}
	
	public WordCountResult(int wordCount,int linesCount,int charactersCount){
		this.mWordCount = wordCount;
		this.mLinesCount = linesCount;
		this.mCharactersCount = charactersCount;
	}
	

	public int getWordCount(){
		return mWordCount;
	}
	
	public int getLinesCount(){
		return mLinesCount;
	}
	
	public int getCharactersCount(){
		return mCharactersCount;
	}
	
	public void setWordCount(int wordCount){
		mWordCount = wordCount;
	}
	
	public void setLinesCount(int linesCount){
		mLinesCount = linesCount;
	}
	
	public void setCharactersCount(int charactersCount){
		mCharactersCount = charactersCount;
	}
	
	
}
