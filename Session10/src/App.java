// Main Class :)
public class App {

	// Execution begins from main
	public static void main(String[] args) {

		//User* user1 = new User(); C++ Dynamic Object Construction
		User user1 = new User();    // Java only has dynamic Object Construction
		User user2 = new User();
		
		//user1.name = "Kuch Bhi Naam";
		//user2.phone = "kuch bhi Phone";
		
		user1.setName("Kuch Bhi Name");
		user2.setPhone("9876512345");

		user1.showUser();
		user2.showUser();
		
	}

}
