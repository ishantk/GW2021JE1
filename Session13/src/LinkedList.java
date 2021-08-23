
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
		
		if(forwardBackward) { // forwardBackward -> true -> iterate forward
			Song temporarySong = head; // Reference Copy
			
			while(true) {
				temporarySong.showSong();
				temporarySong = temporarySong.nextSong;
				
				if(temporarySong == tail) {
					temporarySong.showSong();
					break;
				}
			}
		}else { // forwardBackward -> false -> iterate backward
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
	
	// Linear Search Algorithm
	Song get(int index) {
		
		Song songAtIndex = null;
		
		Song temporarySong = head; // Reference Copy
		
		while(true) {
			
			
			if(temporarySong.index == index) {
				songAtIndex = temporarySong;
				break;
			}
			
			temporarySong = temporarySong.nextSong;
			
			
			
			if(temporarySong == tail) {
				if(temporarySong.index == index) {
					songAtIndex = temporarySong;
				}
				break;
			}
		}
		
		return songAtIndex;
	}

	void removeFirst() {
		
		Song toBeRemoved = head;
		head = toBeRemoved.nextSong;
		tail.nextSong = head;
		head.previousSong = tail;
		
	}
	
	void removeLast() {
		
		Song toBeRemoved = tail;
		tail = toBeRemoved.previousSong;
		head.previousSong = tail;
		tail.nextSong = head;
	}
	
	void remove(int index) {
		
		Song toBeRemoved = get(index);
		toBeRemoved.previousSong.nextSong = toBeRemoved.nextSong;
		toBeRemoved.nextSong.previousSong = toBeRemoved.previousSong;
		
	}
	
	// Assignment: Implementation, you take any input and implement it any way
	void updateIndexes() {
		
	}
	
	void insertAtIndex(int index) {
		
	}
	
	// Based on Duration of Song
	void bubbleSort() {
		
	}
	
	
	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
	
}
