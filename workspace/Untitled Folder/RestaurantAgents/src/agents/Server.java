package agents;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;


public class Server extends Agent {
	protected void setup(){
	String name = "agent ";
	ContainerController c = getContainerController();
	try{
		AgentController a = c.createNewAgent(name, "agents.Cook", null);
		a.start();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
