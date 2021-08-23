
class FlightBooking{
	
	String from;
	String to;
	String departureDate;
	int numOfTraverllers;
	String travelClass;
	
	FlightBooking(){
		
	}
	
	FlightBooking(String from, String to, String departureDate, int numOfTraverllers, String travelClass) {
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numOfTraverllers = numOfTraverllers;
		this.travelClass = travelClass;
	}
	
	void show() {
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("FLIGHT DETAILS");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("FROM: "+from+" TO: "+to);
		System.out.println("DEPARTURE: "+departureDate);
		System.out.println("TRAVELLERS: "+numOfTraverllers+" CLASS: "+travelClass);	
	}
	
}

// RoundTripFlightBooking IS-A FlightBooking

class RoundTripFlightBooking extends FlightBooking{
	
	String returnDate;

	RoundTripFlightBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	RoundTripFlightBooking(String from, String to, String departureDate, int numOfTraverllers, String travelClass, String returnDate) {
		super(from, to, departureDate, numOfTraverllers, travelClass);
		this.returnDate = returnDate;
	}
	
	void show() {
		super.show();
		System.out.println("RETURN: "+returnDate);
	}
	
}

public class WhyInheritanceMMT {

	public static void main(String[] args) {
		
		FlightBooking oneWay = new FlightBooking("Delhi", "Bangalore", "7 Aug 2021", 1, "economy");
		oneWay.show();
		
		
		// Direct Object Construction
		//RoundTripFlightBooking twoWay = new RoundTripFlightBooking(null, null, null, 0, null, null);
		
		// Polymorphic Object COntruction
		// Reference of Parent can refer to the Object of Child :)
		// But Vice Versa is not possible
		FlightBooking twoWay = new RoundTripFlightBooking("Delhi", "Bangalore", "7 Aug 2021", 1, "economy", "8 Aug 2021");
		twoWay.show();
		
		// Assignment: Code Inheritance Use Case from PayTM: https://paytm.com/recharge-bill-payment
	}

}
