
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User();	
		user1.setId(555);
		User user2=new User(747,"Mustafa");
		System.out.println(user2.getuName());
		
		Category category1=new Category();
		Category category2=new Category(86555,"Telefon");
		System.out.println(category2.getcName());
		
		Product product1=new Product(321,"Samsung",7.500);
		Product product2= new Product();
		product2.setId(0001);
		System.out.println(product2.getId());
		
		Order order1=new Order();
		Order order2=new Order(4,7);
		order1.setId(04147);
		order1.setQuantity(4);
		//System.out.println(order1.getId(),order1.getQuantity());
		System.out.println(order1.getId());
	
	
	
	
	
	
	
	}

}
