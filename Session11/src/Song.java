
public class Song {
	
	String track;
	String artists;
	float duration;
	
	// Reference Variables
	Song nextSong;
	Song previousSong;
	
	Song(){
		
	}
	
	Song(String track, String artists, float duration) {
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}

	void showSong() {
		System.out.println("-------------------------------------");
		System.out.println(track+"\t"+artists+"\t"+duration);
		System.out.println("-------------------------------------");
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Song [track=" + track + ", artists=" + artists + ", duration=" + duration + "]";
	}
	
}
