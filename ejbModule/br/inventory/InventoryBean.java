package br.inventory;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class InventoryBean implements IInventoryBean {
	
	private List<Product> invetory = new ArrayList<Product>();
	
	public InventoryBean() {
		populateInvetory();
	}
	
	public void populateInvetory() {
		for (int i = 1; i <= 100; i++) {
			Product product = new Product();
			product.setName("Product " + i);
			product.setPrice(i * 2);
			this.invetory.add(product);
		}
	}

	@Override
	public List<Product> getInventory() {
		return this.invetory;
	}

	@Override
	public void removeFromInventory(Product product) {
		this.invetory.remove(product);
	}

	@Override
	public void addToInventory(Product product) {
		this.invetory.add(product);
	}
}
