package agents;

import jade.core.Agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import meals.CookRecipe;

public class Cook extends Agent{
	
	protected void setup(){
		System.out.println("enter recipe name:");
		Scanner input = new Scanner(System.in);
		String recipe;

		recipe = input.nextLine();
		List<CookRecipe> allRecipes = new ArrayList<CookRecipe>();
		CookRecipe ck = new CookRecipe();
		allRecipes.add(ck);
		
		int i=0;
		for(i=0;i<allRecipes.size();i++){
			//System.out.println(allRecipes.get(i).getMealName());
			if(allRecipes.get(i).getMealName() == recipe ){
				System.out.println("ingredients:"+allRecipes.get(i).getIngredients());
				System.out.println("instructions:"+ allRecipes.get(i).getInstructions());
				
			}
		
		}
		
		
		
	}
}
