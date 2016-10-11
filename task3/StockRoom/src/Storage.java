
import java.util.Random;

public class Storage {
	private Product[] products;

	private Random random = new Random();

	private final static int PRODUCTS_TYPE_COUNT = 3;

	public Storage(int size) {
		this.products = new Product[size];
	}

	public void fillStorage() {
		for (int i = 0; i < products.length; i++) {
			Product product = getRandomAvailableProduct();
			product.setName(Integer.toString(i + 1));
			products[i] = product;
		}
	}

	public Product getRandomAvailableProduct() {
		int randomIndex = random.nextInt(PRODUCTS_TYPE_COUNT);

		Product product = null;
		if (randomIndex == 0) {
			product = new Shoos();
		} else if (randomIndex == 1) {
			product = new Pants();
		} else {
			product = new Jacket();
		}

		product.setWeight(random.nextDouble() * 100);
		return product;
	}

	public double calculateTotalWeight() {
		double sumWeight = 0;
		for (Product product : products) {
			if (product != null)
				sumWeight += product.getWeight();
		}
		return sumWeight;
	}

	public Product[] getProducts() {
		return products;
	}
}
