
public class Run {

	public static void main(String[] args) {
		Storage storage = new Storage(10);
		
		
		storage.fillStorage();
		System.out.println("Products on stock:\nName  &  Weight");
		for (Product product : storage.getProducts()) {
			System.out.println(product);
		}
		//double TotalWeight=storage.calculateTotalWeight();
		System.out.printf("TotalWeight: %.2f",storage.calculateTotalWeight());
	}

}
