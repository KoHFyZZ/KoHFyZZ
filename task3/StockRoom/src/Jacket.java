

public class Jacket extends Product{

	@Override
	public String toString() {
		return "Jacket " + getName() + ": " + Math.rint(getWeight()*100)/100;
	}


}
