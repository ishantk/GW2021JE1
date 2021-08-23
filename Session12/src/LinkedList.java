
public class LinkedList {

	Song head;
	Song tail;
	private int length;
	
	/*LinkedList() {
		head = null;
		tail = null;
	}*/
	
	
	boolean isEmpty() {
		return head == null;
	}
	
	int length() {
		return length;
	}
	
	void add(Song song) { // song = song3 = 3ab2345
		
		length++;
		
		if(head == null) {
			head = song;
			tail = song;
			System.out.println("SONG ADDED AS HEAD AND TAIL");
		}else {
			// tail's next song will become the current song
			tail.nextSong = song;
			// current song's previous song updated
			song.previousSong = tail;
			
			head.previousSong = song;
			
			tail = song;
			tail.nextSong = head;
			
			System.out.println("SONG ADDED TAIL");
		}
		
	}
	
	
	void iterate(boolean forwardBackward) {
		
		if(forwardBackward) {
			Song temporarySong = head; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.nextSong;
				
				if(temporarySong == tail) {
					temporarySong.showSong();
					break;
				}
			}
		}else {
			Song temporarySong = tail; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.previousSong;
				
				if(temporarySong == head) {
					temporarySong.showSong();
					break;
				}
			}
			
		}
		
		
		
	}
}
