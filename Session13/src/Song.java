
public class Song {
	
	static int idx; // Property of class
	
	int index; // Property of Object
	
	String track;
	String artists;
	float duration;
	
	Song nextSong;
	Song previousSong;
	
	Song(){
		
	}
	
	Song(String track, String artists, float duration) {
		index = idx;
		idx++; // increment property of class by 1
		
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("["+index+"] Track: "+track+"\t Artists: "+artists+"\t Duration: "+duration);
		System.out.println("----------------------------------------------------------------");
		System.out.println();
	}

//	@Override
//	public String toString() {
//		return "Song [index=" + index + ", track=" + track + ", artists=" + artists + ", duration=" + duration
//				+ ", nextSong=" + nextSong + ", previousSong=" + previousSong + "]";
//	}


}
