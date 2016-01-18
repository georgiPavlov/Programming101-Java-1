package agents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import meals.CookRecipe;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class mealSearchBehaviour extends Behaviour{
	private boolean finished = true;
	private int round=0;
	public mealSearchBehaviour(){
		action();
		done();
	}
	@Override
	public void action() {
		System.out.println("enter recipe name:");
		Scanner input = new Scanner(System.in);
		String recipe;

		recipe = input.nextLine();
		MealAgent m = new MealAgent();
		int i=0;
		for(i=0;i<m.allRecipes.size();i++){
			System.out.println(m.allRecipes.get(i).getMealName());
			if(m.allRecipes.get(i).getMealName() == recipe ){
				System.out.println("ingredients:"+m.allRecipes.get(i).getIngredients());
				System.out.println("instructions:"+ m.allRecipes.get(i).getInstructions());
				
			}
		
		}
		System.out.println("Inside ACTION:: " + round++);
	}

	@Override
	public boolean done() {
	if(round == 20)return finished;
	else return false;
	}
}
