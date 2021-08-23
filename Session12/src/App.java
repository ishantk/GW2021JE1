// Main Class
public class App {

	// main method
	public static void main(String[] args) {
		
		LinkedList playList = new LinkedList(); 
		// head = null, tail = null, length =0
		
		

		Song song1 = new Song("1. Permission to Dance", "BTS", 3.7f);
		// song1 -> 1ab2345
		// nextSong = null, previousSong = null
		
		Song song2 = new Song("2. Bimariyan", "Preetinder", 3.19f);
		// song2 -> 2ab2345
		// nextSong = null, previousSong = null
		
		Song song3 = new Song("3. Sach Keh Raha Hai", "B Praak", 3.44f);
		// song3 -> 3ab2345
		// nextSong = null, previousSong = null
		
		System.out.println("INITIALLY PLAY LIST DETAILS");
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song1); // song1 = 1ab2345
		// head = 1ab2345, tail = 1ab2345, length = 1
		
		System.out.println();
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song2); // song2 = 2ab2345
		// head = 1ab2345, tail = 1ab2345, length = 2
		// song1 -> 1ab2345 -> nextSong -> 2ab2345
		// song2 -> 2ab345 -> previousSong -> 1ab2345
		// head = 1ab2345 -> previousSong -> 2ab2345
		// tail -> 2ab2345
		// tail -> 2ab2345 -> nextSong -> head -> 1ab2345
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song3);
		
		Song song4 = new Song("4. Baarish", "Kim", 4.0f);
		Song song5 = new Song("5. Some Song", "Sia", 4.57f);
		
		playList.add(song4);
		playList.add(song5);
		
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length()); // 5
		
		playList.iterate(true);
		System.out.println("~~~~~~~~~~~~~~~~");
		playList.iterate(false);
		
	}

}

// Assignment -> ShoppingCart as LinkedList
