class CA{
	
	int a;
	static int b;
	
	CA(){
		System.out.println("CA Object Constructed");
		a = 10;
		b = 20;
	}
	
	void showObjectData() {
		System.out.println("a is: "+a);
	}
	
	static void showClassData() {
		System.out.println("b is: "+b);
	}
}

class CB extends CA{
	
	CB(){
		System.out.println("CB Object Constructed");
	}
}


public class InheritanceClassVsObject {

	public static void main(String[] args) {
		
		CB cb = new CB();
		
		cb.showObjectData();
		CB.showClassData();

	}

}
