package agents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import meals.CookRecipe;


public class MealAgent extends Agent{
	public List<CookRecipe> allRecipes = new ArrayList<CookRecipe>();
	public MealAgent(){
		CookRecipe c = new CookRecipe();
		c.init();
		allRecipes.add(c);		
		
	}

	protected void setup(){
		
		addBehaviour(new mealSearchBehaviour());
	}
}
