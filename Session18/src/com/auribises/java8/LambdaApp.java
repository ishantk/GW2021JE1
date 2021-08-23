package com.auribises.java8;

@FunctionalInterface // Feature from Java8
interface MessageReceiver{
	void onMessageReceived(String message);
}


class WhatsAppGroup implements MessageReceiver{
	
	@Override
	public void onMessageReceived(String message) {
		System.out.println("A new Message");
		System.out.println(message);
	}
}

@FunctionalInterface
interface Comparison{
	int compareNumbers(int num1, int num2);
}

// Main Class
public class LambdaApp {

	// Main Method
	// From here our execution begins :)
	public static void main(String[] args) {
		
		//MessageReceiver refVar = new WhatsAppGroup();
		//refVar.onMessageReceived("Hello, Are you thr ?");
		
		// Anonymous class :) // SINGLETON
		// 1 and only 1 Object :)
		/*MessageReceiver refVar = new MessageReceiver() {
			@Override
			public void onMessageReceived(String message) {
				System.out.println("A new Message");
				System.out.println(message);
			}
		};
		
		refVar.onMessageReceived("Hello, Are you thr ?");*/
		
		// Lambda :) 
		MessageReceiver refVar = (text)-> {
			System.out.println("A new Message");
			System.out.println(text);
		};
		
		refVar.onMessageReceived("Hello, Are you thr ?");
		
		Comparison cRef = (a, b)->{
			/*if (a > b) {
				return a;
			}else {
				return b;
			}*/
			
			return a>b ? a : b;
		};

		System.out.println(cRef.compareNumbers(10, 20));
		
	}

}
