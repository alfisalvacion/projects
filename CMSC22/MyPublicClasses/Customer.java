package customer;


class Customer { 

		
	private String name;
	private String email;
	private char gender;

	public Customer(String name, String email, char gender) {
		this.name = new String(name);
		this.email = new String(email);
		this.gender = gender;
	}

	public void setEmail(String name) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getGender() {
		return this.gender;
	}

	public String displayCustomerInfo() {
		String ans = new String(this.name + " (" + this.gender + ") " + "at " + this.email);
		return ans;
	}

	public formatLetterGreeting() {
		String ans;

		if(this.gender == 'm')
			ans = new String("Dear Mr. " + this.name);

		else
		if(this.gender == 'f')
			ans = new String("Dear Ms. " + this.name);

		else
			ans = new String("Dear Mr/Ms. " + this.name);

	}

}