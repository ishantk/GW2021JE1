/*
 	Operations:
 	ADD -> Add Data/element
 	PEEK -> To Get the Head of Queue
 	POLL -> To Remove the Head of Queue
 	ITERATE -> Forward Iteration
 */


public class Queue {

	Song head;
	Song tail;
	private int length;
	

	
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
	
	void iterate() {
		
			Song temporarySong = head; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.nextSong;
				
				if(temporarySong == tail) {
					temporarySong.showSong();
					break;
				}
			}
	}
	
	Song peek() {
		return head;
	}

	void poll() {
		
		Song toBeRemoved = head;
		head = toBeRemoved.nextSong;
		tail.nextSong = head;
		head.previousSong = tail;
		
	}
	
	
	@Override
	public String toString() {
		return "Queue [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
	
}
