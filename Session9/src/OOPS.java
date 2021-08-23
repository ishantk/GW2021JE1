import java.util.Arrays;

/*
 		Think of Objects with its attributes :)
 		
 		Person: name, phone, email, address
 		
 		Restaurant: name, phone, email, address, operatingHours, ratings, reviews, pricePerPerson
 		Menu: title, numOfDishes, dishes
 		Dish: name, price, description, discount, category
 		Order: id, date, time, user, restaurant, valet
 		User: (Person)
 		Valet: (Person), workHours, area, currentLatitude, currentLongitude, vehicle
 		Vehicle: number, brand, registrationYear, isInsured
 */

// Restaurant: name, phone, email, address, operatingHours, ratings, reviews, pricePerPerson
// MODEL or POJO(Plain Old Java Object)
class Restaurant{
	
	// Attributes
	// Attributes belong to Object
	String name;
	String phone;
	String email;
	String address;
	String operatingHours;
	float ratings;
	String[] reviews;
	int pricePerPerson;
	
	// Constructor: Property of Object
	// Method with same name as that of class name
	// It has no inputs -> DEFAULT CONSTRUCTOR
	Restaurant(){
		name = "NA";
		phone = "NA";
		email = "NA";
		address = "NA";
		operatingHours = "10:00 to 20:00";
		ratings = 3.5f;
		reviews = new String[] {"Awesome"};
		pricePerPerson = 50;
		System.out.println("[DEFAULT] Object Initialized with Default Values\n");
	}
	
	// Parameterized Constructor or No Arg Constructor or Non Default Constructor
	Restaurant(String name, String phone, String email, String address,
			String operatingHours, float ratings, String[] reviews, int pricePerPerson){
		// LHS:this.name -> Property of Object
		// RHS name -> Input to the Constructor
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.operatingHours = operatingHours;
		this.ratings = ratings;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
		System.out.println("[PARAMETERIZED] Object Initialized with Custom Values\n");
	}
	
	// Method
	// Property of Object
	void showRetaurant() {
		System.out.println(name+" is loacted at "+address);
		System.out.println(name+ " is operational from "+operatingHours);
		System.out.println("Price Per Person is: \u20b9"+pricePerPerson+"\n");
	}
	
	
	
	// Setter
//	void setName(String name) {
//		this.name = name;
//	}
//	
	//Getter
//	String getName() {
//		return name;
//	}
	
	
	
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", operatingHours=" + operatingHours + ", ratings=" + ratings + ", reviews="
				+ Arrays.toString(reviews) + ", pricePerPerson=" + pricePerPerson + "]";
	}

	void setRestaurant(String name, String phone, String email, String address,
			String operatingHours, float ratings, String[] reviews, int pricePerPerson){
		// LHS:this.name -> Property of Object
		// RHS name -> Input to the Constructor
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.operatingHours = operatingHours;
		this.ratings = ratings;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
		System.out.println("Values Updated\n");
	}
	
	
	
}

class Menu{
	
	String title;
	int numOfDishes;
	Dish[] dishes;

		
	Menu() {
	}


	Menu(String title, int numOfDishes, Dish[] dishes) {
		this.title = title;
		this.numOfDishes = numOfDishes;
		this.dishes = dishes;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumOfDishes() {
		return numOfDishes;
	}


	public void setNumOfDishes(int numOfDishes) {
		this.numOfDishes = numOfDishes;
	}


	public Dish[] getDishes() {
		return dishes;
	}


	public void setDishes(Dish[] dishes) {
		this.dishes = dishes;
	}
	
	
	
}

class Dish{
	
	String name;
	int price;
	String description;
	
	
	
	Dish() {
		name = "NA";
		price = 0;
		description = "NA";
	}


	Dish(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	
	
}

public class OOPS {

	public static void main(String[] args) {
		
		// Object Construction Statement
		Restaurant restaurant1 = new Restaurant();
		Restaurant restaurant2 = new Restaurant("Burger King", "+91 99999 22222", "email@burgerking.com", 
				"Sarabha Nagar", "10:00 to 22:00", 4.7f,
				new String[]{"Very Awesome Burgers", "I found burger to be nice", "coke was fine"},
				120);
		
		Restaurant restaurant3 = restaurant1; // Reference Copy
		
		// restaurant1 and restaurant2 are NOT OBJECTS
		// They are REFERENCE VARIABLES
		
		/*restaurant1.name = "Mc Donalds";
		restaurant1.phone = "+91 99999 11111";
		restaurant1.email = "email@mcdonals.com";
		restaurant1.address = "Ansal Plaza";
		restaurant1.operatingHours = "10:00 to 22:00";
		restaurant1.ratings = 4.5f;
		restaurant1.reviews = new String[]{"Awesome Burgers", "I found burger to be good", "coke was out of fizz"};
		restaurant1.pricePerPerson = 100;
		
		restaurant2.name = "Burger King";
		restaurant2.phone = "+91 99999 22222";
		restaurant2.email = "email@burgerking.com";
		restaurant2.address = "Sarabha Nagar";
		restaurant2.operatingHours = "10:00 to 22:00";
		restaurant2.ratings = 4.7f;
		restaurant2.reviews = new String[]{"Very Awesome Burgers", "I found burger to be nice", "coke was fine"};
		restaurant2.pricePerPerson = 120;*/
		
		/*System.out.println(restaurant1.name+" is located at "+restaurant1.address);
		System.out.println(restaurant1.name+" is operational between "+restaurant1.operatingHours);
		System.out.println("Price Per Person is: \u20b9"+restaurant1.pricePerPerson);
		
		System.out.println();
		
		System.out.println(restaurant2.name+" is located at "+restaurant2.address);
		System.out.println(restaurant2.name+" is operational between "+restaurant2.operatingHours);
		System.out.println("Price Per Person is: \u20b9"+restaurant2.pricePerPerson);*/
		
		//restaurant3.name = "McDonalds";
		//restaurant1.setName("McDonalds");
		//restaurant1.setRestaurant(null, null, null, null, null, 0, args, 0);
		
		restaurant1.showRetaurant();
		restaurant2.showRetaurant();
		restaurant3.showRetaurant();
		
		//System.out.println("Name of restauran2 is: "+restaurant2.getName()); // InDirect Access
		System.out.println("Name of restauran2 is: "+restaurant2.name); // Direct Access
		
		System.out.println(restaurant1);
		System.out.println(restaurant2);
		System.out.println(restaurant3);
		
	}

}
