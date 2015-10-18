import customer;

public class TestCustomer {
	public static void main(String[] args) {

		Customer Alfi = new Customer("James","jmsalvacion1@up.edu.ph",'m');
		
		System.out.println(Alfi.getName());
		System.out.println(Alfi.displayCustomerInfo());
		Alfi.setEmail("jams@yahoo.com");
		System.out.println(Alfi.getEmail());
		System.out.println(Alfi.formalLetterGreeting());

		Customer GenGen = new Customer("Generil","gengen@gmail.com",'f');
		System.out.println(GenGen.getName());


	}
}