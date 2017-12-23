package vis.com.shoppingbackend.dao;

import vis.com.shoppingbackend.dto.Address;
import vis.com.shoppingbackend.dto.Cart;
import vis.com.shoppingbackend.dto.User;

public interface UserDAO {

	// add an user
	boolean addUser(User user);
	
	// add an address
	boolean addAddress(Address address);
	
	// add a cart
	boolean addCart(Cart cart);
	
}
