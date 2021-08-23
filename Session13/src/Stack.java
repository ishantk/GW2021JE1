/*
 	Operations:
 	PUSH -> Add Data/element
 	POP -> Remove Last Data/element
 	ITERATE -> Backward Iteration
 */


public class Stack {

	Song head;
	Song tail;
	private int length;

	boolean isEmpty() {
		return head == null;
	}
	
	int length() {
		return length;
	}
	
	void push(Song song) { // song = song3 = 3ab2345
		
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
	
	
	
	void pop() {
		
		Song toBeRemoved = tail;
		tail = toBeRemoved.previousSong;
		head.previousSong = tail;
		tail.nextSong = head;
	}
	
	
	@Override
	public String toString() {
		return "Stack [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
}
