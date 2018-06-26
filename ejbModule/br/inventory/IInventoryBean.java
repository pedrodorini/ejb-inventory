package br.inventory;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface IInventoryBean {
	
	List<Product> getInventory();
	void removeFromInventory(Product product);
	void addToInventory(Product product);

}
