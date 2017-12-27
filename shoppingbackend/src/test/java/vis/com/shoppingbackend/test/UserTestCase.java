package vis.com.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vis.com.shoppingbackend.dao.UserDAO;
import vis.com.shoppingbackend.dto.Address;
import vis.com.shoppingbackend.dto.Cart;
import vis.com.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("vis.com.shoppingbackend");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
	}
	/*
	 * @Test public void testAddUser() {
	 * 
	 * user = new User(); user.setFirstName("Hrithik"); user.setLastName("Roshan");
	 * user.setEmail("hr@gmail.com"); user.setContactNumber("1234512345");
	 * user.setRole("CUSTOMER"); user.setPassword("12345");
	 * 
	 * // add the user assertEquals("Failed to add the user!", true,
	 * userDAO.addUser(user));
	 * 
	 * address = new Address();
	 * address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
	 * address.setAddressLineTwo("Near Kaabil Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); address.setBilling(true);
	 * 
	 * // link the user with the address using user id
	 * address.setUserId(user.getId());
	 * 
	 * // add the user address assertEquals("Failed to add the address!", true,
	 * userDAO.addAddress(address));
	 * 
	 * if(user.getRole().equals("USER")) {
	 * 
	 * // create a cart for this user cart = new Cart(); cart.setUser(user);
	 * assertEquals("Failed to add the cart!", true, userDAO.addCart(cart));
	 * 
	 * 
	 * // add a shipping address for this user address = new Address();
	 * address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
	 * address.setAddressLineTwo("Near Kudrat Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); // set shipping to true
	 * address.setShipping(true);
	 * 
	 * // link it with the user address.setUserId(user.getId());
	 * 
	 * // add the shipping address
	 * assertEquals("Failed to add the shipping address!", true,
	 * userDAO.addAddress(address));
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testAdd() {
	 * 
	 * user = new User(); user.setFirstName("Vishnu"); user.setLastName("Ramesh");
	 * user.setEmail("rdhanush07@gmail.com"); user.setContactNumber("9962540710");
	 * user.setRole("USER"); user.setPassword("220199");
	 * 
	 * if(user.getRole().equals("USER")) {
	 * 
	 * // create a cart for this user cart = new Cart();
	 * 
	 * cart.setUser(user);
	 * 
	 * // attach cart with the user user.setCart(cart);
	 * 
	 * } // add the user assertEquals("Failed to add the user!", true,
	 * userDAO.addUser(user));
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdateCart() {
	 * 
	 * // fetch the user by its email user =
	 * userDAO.getByEmail("rdhanush07@gmail.com");
	 * 
	 * // get the cart of the user cart = user.getCart();
	 * 
	 * cart.setGrandTotal(5555);
	 * 
	 * cart.setCartLines(2);
	 * 
	 * assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));
	 * 
	 * 
	 * }
	 */

	/*
	@Test
	public void testAddAddress() {

		// we need to add an user
		user = new User();
		user.setFirstName("Vishnu");
		user.setLastName("Ramesh");
		user.setEmail("rdhanush07@gmail.com");
		user.setContactNumber("9962540710");
		user.setRole("USER");
		user.setPassword("220199");

		assertEquals("Failed to add the user!", true, userDAO.addUser(user));

		// we are going to add address for billing
		address = new Address();
		address.setAddressLineOne("77, Alex Nagar, A Colony, Madhavaram Milk Colony");
		address.setAddressLineTwo("Near Vinayaga Templr");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setCountry("India");
		address.setPostalCode("600051");
		address.setBilling(true);

		// attach the user to the address
		address.setUser(user);

		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));

		// we are also going to add the shipping address
		address = new Address();
		address.setAddressLineOne("77/44, Alex Nagar, A Colony, Madhavaram Milk Colony");
		address.setAddressLineTwo("Near Vinayaga Temple");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setCountry("India");
		address.setPostalCode("6000051");
		// set shipping to true
		address.setShipping(true);

		// attach the user to the address
		address.setUser(user);

		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));

	}
	
	*/
	/*
	@Test
	public void testAddAddress() {
		
		user = userDAO.getByEmail("rdhanush07@gmail.com");
		
		// we are also going to add the shipping address
				address = new Address();
				address.setAddressLineOne("108, Alex Nagar, A Colony, Madhavaram Milk Colony");
				address.setAddressLineTwo("Near Vinayaga Temple");
				address.setCity("jfvj");
				address.setState("Andra");
				address.setCountry("India");
				address.setPostalCode("6000051");
				// set shipping to true
				address.setShipping(true);

				// attach the user to the address
				address.setUser(user);

				assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));

		
	}
	*/
	
	@Test
	public void testGetAddresses() {
		
		user = userDAO.getByEmail("rdhanush07@gmail.com");
		
		assertEquals("Failed to fetch the list of address and size does not match!", 2,
				userDAO.listShippingAddresses(user).size());
		
		assertEquals("Failed to fetch the list of billing address and size does not match!", "Chennai",
				userDAO.getBillingAddress(user).getCity());
		
		
	}
	

}