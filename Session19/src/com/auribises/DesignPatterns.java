package com.auribises;

class Connection{
	
	private static Connection ref = new Connection();
	
	private Connection(){
		System.out.println("Connection Object Created");
		System.out.println("Reference is: "+this);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	public static Connection getConnection() {
		return ref;
	}
	
}

// Assignment: Decorator Design Pattern :)

// State Design Pattern
interface State{
	String getState();
}

class Placed implements State{
	public String getState() {
		return "Order is Placed";
	}
}

class Transit implements State{
	public String getState() {
		return "Order is in Transition";
	}
}

class Delivered implements State{
	public String getState() {
		return "Order is Delivered";
	}
}


class Order{
	
	// HAS-A Relationship 1 to 1
	State state;
	int oid;
	int total;
	
	void changeState(State state) {
		this.state = state;
	}
}

public class DesignPatterns {

	public static void main(String[] args) {
		
		/*Connection con1 = new Connection();
		Connection con2 = new Connection();*/
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);
		
		Placed placed = new Placed();
		Transit transit = new Transit();
		Delivered delivered = new Delivered();
		
		Order order = new Order();
		order.changeState(placed);
		
		System.out.println(order.state.getState());
		
		order.changeState(transit);
		System.out.println(order.state.getState());
		
		order.changeState(delivered);
		System.out.println(order.state.getState());
		
	}

}
