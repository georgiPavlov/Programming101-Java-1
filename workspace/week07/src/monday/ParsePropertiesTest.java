package monday;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ParsePropertiesTest {
	
	private Map<String,String> test1;
	private Map<String,String> test2;
	private Map<String,String> test3;
	private Map<String,String> test4;
	private Map<String,String> test5;
	private Map<String,String> test6;
	private Map<String,String> test7;
	
	@Before public void setUpTests(){
		test1.put("a1","b1");
		test2.put("a2", "b2");
		test3.put("a3","b3");
		test4.put("a4", "b4");
		test5.put("a5","b6=b7=b8");
		test6.put("a6", "b9");
		test7.put("a7", "=b10");
	}
	

	
}