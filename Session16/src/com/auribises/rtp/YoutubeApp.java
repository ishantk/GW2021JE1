package com.auribises.rtp;


abstract class Notification{
	abstract void notifyWithMessage(String message);
}

class YoutubeChannel{
	
	Notification notification;
	
	void subscribe(User user) {
		// RTP
		notification = user;
	}
	
	void uploadVideo(String name) {
		System.out.println("Video Uploaded");
		notification.notifyWithMessage("A new Video Uploaded "+name);
	}
	
}

class User extends Notification{
	
	void notifyWithMessage(String message) {
		System.out.println("Notifcation Received");
		System.out.println(message);
	}
}

public class YoutubeApp {

	public static void main(String[] args) {
		
		//Notification notification;
		 
		User user = new User();
		
		//notification = user;
		
		YoutubeChannel channel = new YoutubeChannel();
		channel.subscribe(user);
		
		
		channel.uploadVideo("~~RTP with Java~~");
		
	}

}
