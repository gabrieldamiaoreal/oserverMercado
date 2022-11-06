package subscribers;

import java.util.List;

import domain.Product;
import publisher.IPublisher;

public class Cashier implements ISubscriber {

	private IPublisher publisher; //os subscribers conhecem o publisher
	private List<Product> cashierProducts;
	
	public Cashier(IPublisher publisher){
		this.publisher = publisher;
		this.publisher.add(this);
	}
	
	@Override
	public void update(List<Product> products) {
		this.setCashierProducts(products);
	}

	public List<Product> getCashierProducts() {
		return cashierProducts;
	}

	public void setCashierProducts(List<Product> cashierProducts) {
		this.cashierProducts = cashierProducts;
	}
}
