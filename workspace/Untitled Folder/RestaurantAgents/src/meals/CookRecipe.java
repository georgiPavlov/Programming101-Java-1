package meals;

import java.util.ArrayList;
import java.util.List;

import jade.util.*;

public class CookRecipe {
	
	String name;
	List<ingrediente> ingredienteList = new ArrayList<ingrediente>();
	String instructions;
	
	public void addIngrediente(ingrediente i){
		ingredienteList.add(i);
	}
	public String getMealName(){
		return name;
	}
	
	public String getInstructions(){
		return instructions;
	}
	
	public String getIngredients(){
		int i=0;
		String s = null;
		for(i=0;i<ingredienteList.size();i++){
			s=ingredienteList.get(i).toString() + "\n";
		}
		
		return s;
	}
	public void init(){
		name="apple something";
		instructions="do this than do that";
		ingrediente i = new ingrediente(1,"kg","apples");
		addIngrediente(i);
	}
}
