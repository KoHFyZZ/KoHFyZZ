

public class Shoos extends Product{

	@Override
	public String toString() {
		return "Shoos " + getName() + ": " + Math.rint(getWeight()*100)/100;
	}

}
