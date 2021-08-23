// Main Class
public class App {
	
	
	// main method -> execution begins from main
	public static void main(String[] args) {
		
		Song song1 = new Song("Permission to Dance", "BTS", 3.7f);
		Song song2 = new Song("Bimariyan", "Preetinder", 3.19f);
		Song song3 = new Song("Sach Keh Raha Hai", "B Praak", 3.44f);

		
//		System.out.println(song1);
//		System.out.println(song2);
//		System.out.println(song3);
		
		// Hard Code :( -> Circular Doubly LinkedList
		song1.nextSong = song2;
		song1.previousSong = song3;
		
		song2.nextSong = song3;
		song2.previousSong = song1;
		
		song3.nextSong = song1;
		song3.previousSong = song2;
		
		System.out.println("Forward Iteration");
		
		// Iteration -> Forward
		
		Song song = song1; // Reference Copy Operation
		
		while(true) {
			song.showSong();
			song = song.nextSong; // Reference Copy
			
			if(song.nextSong == song1) {
				song.showSong();
				break;
			}
		}
	
		System.out.println();
		System.out.println("Backward Iteration");
		
		// Iteration -> Backward
		
		song = song3;
		
		while(true) {
			song.showSong();
			song = song.previousSong; // Reference Copy
			
			if(song.previousSong == song3) {
				song.showSong();
				break;
			}
		}
		
//		song1.showSong();
//		song2.showSong();
//		song3.showSong();
		
	}

}
