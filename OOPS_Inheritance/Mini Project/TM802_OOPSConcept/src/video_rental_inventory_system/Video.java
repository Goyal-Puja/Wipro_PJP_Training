package video_rental_inventory_system;

public class Video {
	String videoName;
	boolean checkOut;
	int rating;
	
	Video(String name){
		this.videoName = name;
		
	}
	String getName() {
		return videoName;
	}
	void doCheckOut() {
		checkOut = true;
	}
	void doReturn() {
		checkOut = false;
	}
	void receiveRating(int rating) {
		this.rating = rating;
	}
	int getRating() {
		return rating;	
	}
	boolean getCheckOut() {
		return checkOut;
		
	}
	
	

}
