/*
 	TV: id, name, brand, color, price, size, technology
 	Mobile: id, name, brand, color, price, size, ram, memory
 	Shoe: id, name, brand, color, price, size
 	
 	Product: id, name, brand, color, price, size
 	TV extends Product     | technology
 	Mobile extends Product | ram, memory
 	Shoe extends Product 
 */

/*class TV{
	int id, price, size;
	String name, brand, color;
	String technology;
	
	TV(){
		
	}
	
	TV(int id, int price, int size, String name, String brand, String color, String technology) {
		this.id = id;
		this.price = price;
		this.size = size;
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.technology = technology;
	}
	
	void show() {
		System.out.println(id+" "+price+" "+size);
		System.out.println(name+" "+brand+" "+color);
		System.out.println(technology);
	}
	
}

class Mobile{
	int id, price, size, ram, memory;
	String name, brand, color;
	
	Mobile(){
		
	}
	
	Mobile(int id, int price, int size, int ram, int memory, String name, String brand, String color) {
		this.id = id;
		this.price = price;
		this.size = size;
		this.ram = ram;
		this.memory = memory;
		this.name = name;
		this.brand = brand;
		this.color = color;
	}
	
	void show() {
		System.out.println(id+" "+price+" "+size);
		System.out.println(name+" "+brand+" "+color);
		System.out.println(ram+" "+memory);
	}
	
	
}


class Shoe{
	int id, price, size;
	String name, brand, color;
}*/


class Product{
	
	int id, price, size;
	String name, brand, color;
	
	Product(){
		
	}
	
	
	Product(int id, int price, int size, String name, String brand, String color) {
		this.id = id;
		this.price = price;
		this.size = size;
		this.name = name;
		this.brand = brand;
		this.color = color;
	}


	void show() {
		System.out.println(id+" "+price+" "+size);
		System.out.println(name+" "+brand+" "+color);
	}
	
}

class TV extends Product{
	
	String technology;

	TV(){
		
	}
	
	TV(int id, int price, int size, String name, String brand, String color, String technology) {
		super(id, price, size, name, brand, color);
		this.technology = technology;
	}
	
	void show() {
		super.show();
		System.out.println(technology);
	}
	
	
	
}

class Mobile extends Product{
	
	int ram, memory;

	Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	Mobile(int id, int price, int size, String name, String brand, String color, int ram, int memory) {
		super(id, price, size, name, brand, color);
		this.ram = ram;
		this.memory = memory;
	}
	
	void show() {
		super.show();
		System.out.println(ram+" "+memory);
	}
	
	
}


public class WhyInheritance {

	public static void main(String[] args) {
		
		TV tv = new TV(101, 40000, 40, "Samsung LED TV", "Samsung", "Black", "OLED");
		tv.show();

	}

}
