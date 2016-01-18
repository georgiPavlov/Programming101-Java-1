package meals;

public class ingrediente {
	int measure;
	String unitOfMeasure;
	String name;
	

	
	public ingrediente(int m, String u, String n) {
		// TODO Auto-generated constructor stub
		measure=m;
		unitOfMeasure=u;
		name=n;
	}

	public String toString(){
		String str;
		str = measure + " " +unitOfMeasure + "\n" + name + "\n";
		return str;
	}
}
