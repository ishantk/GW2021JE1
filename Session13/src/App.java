
public class App {

	public static void main(String[] args) {
			
		Song s1 = new Song("some song1", "john, jennie", 3.5f);
		Song s2 = new Song("some song2", "fionna, sia", 4.5f);
		Song s3 = new Song("some song2", "fionna, sia", 4.5f);
		Song s4 = new Song("some song2", "fionna, sia", 4.5f);
		Song s5 = new Song("some song2", "fionna, sia", 4.5f);
		
		System.out.println("s1 hashCode is: "+s1);
		System.out.println("s2 hashCode is: "+s2);
		System.out.println("s3 hashCode is: "+s3);
		System.out.println("s4 hashCode is: "+s4);
		System.out.println("s5 hashCode is: "+s5);
		
		
//		s1.showSong();
//		//System.out.println(s1);
//		
//		s2.showSong();
//		//System.out.println(s2);
//		s3.showSong();
//		s4.showSong();
//		s5.showSong();
		
		LinkedList playList = new LinkedList();
//		System.out.println(playList);
		
		playList.add(s1);
		playList.add(s2);
		playList.add(s3);
		playList.add(s4);
		playList.add(s5);
		
//		System.out.println(playList);
//		
//		System.out.println(s5.nextSong);
//		System.out.println(s5.previousSong);
		
//		playList.iterate(false);
//		
//		System.out.println("Looking for Song at Index: 1");
//		Song song = playList.get(4);
//		if(song != null) {
//			song.showSong();
//		}else {
//			System.out.println("No Song Found :(");
//		}
		
		//playList.removeFirst();
		
		//playList.removeLast();
		
		playList.remove(2);
		
		playList.iterate(true);
		
		
		System.out.println("STACK");
		System.out.println("``````");
		
		Stack stack = new Stack();
		System.out.println(stack);
		
		
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		stack.push(s4);
		stack.push(s5);
		
		stack.pop();
		
		stack.iterate();
		
		System.out.println(stack);
		
		System.out.println("QUEUE");
		System.out.println("``````");
		
		
		Queue queue = new Queue();
		
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		queue.add(s4);
		queue.add(s5);
		
		queue.poll(); // remove first
		queue.poll();
		
		queue.iterate();
		

	}

}


/*
 		LinkedList 			Parent
 		Stack and Queue 	Children
 */
