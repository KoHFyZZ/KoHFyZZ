

public class Pants extends Product{

	@Override
	public String toString() {
		return "Pants " + getName() + ": " + Math.rint(getWeight()*100)/100;
	}

}
