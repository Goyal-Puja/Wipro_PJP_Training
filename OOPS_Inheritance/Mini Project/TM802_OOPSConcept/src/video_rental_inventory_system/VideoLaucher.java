package video_rental_inventory_system;
import java.util.Scanner;

public class VideoLaucher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		Scanner scan = new Scanner(System.in);
		VideoStore videoStore = new VideoStore();
		
		while(input != 6) {
	   System.out.println("\n1. Add Videos : "+"\n"+"2. CheckOut Video :"+"\n"+"3. Return Video :"+"\n"+"4. Receive Rating :"+"\n"+"5. List Inventory :"+"\n"+"6. exit :");
	   System.out.println("Enter your Choice (1...6) : ");
	   String name;
	   input = scan.nextInt();
	   scan.nextLine();
	   
	   switch(input) {
	   case 1:
		   System.out.println("Enter the name of video that you want to add : ");
		   name = scan.nextLine();
		   videoStore.addVideo(name);
		   System.out.println("Video "+ name + " added successfully.");
		   break;
		   
	   case 2:
		   System.out.println("Enter the name of video that you want to check out: ");
		   name = scan.nextLine();
		   if(videoStore.checkVideo(name) == 0) {
			   System.out.println("Video does not exist");
		   }
		   else {
			   videoStore.doCheckOut(name);
			   System.out.println("Video "+ name + " checked out successfully.");
		   }
		   break;
		   
	   case 3:
		   System.out.println("Enter the name of video that you want to return: ");
		   name = scan.nextLine();
		   if(videoStore.checkVideo(name) == 0) {
			   System.out.println("Video does not exist");
		   }
		   else {
			   videoStore.doReturn(name);
			   System.out.println("Video "+ name + " returned successfully.");
		   }
		   break;
		   
	   case 4:
		   System.out.println("Enter the name of video thay you want to rate: ");
		   name = scan.nextLine();
		   if(videoStore.checkVideo(name) == 0) {
			   System.out.println("Video does not exist");
		   }
		   else {
			   System.out.println("Enter the rating for this video: ");
			   int rating = scan.nextInt();
			   videoStore.receiveRating(name, rating);
			   System.out.println("Rating "+rating+" has been mapped to video "+name+".");
			   
		   }
		   break;
	   case 5:
		   videoStore.listInventory();
		   break;
		   
	 default:
		 System.out.println("Exiting !! Thanks for using the application.");
		 break;
		
	   }
			
			
		}

	}

}
/*Output


1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
1
Enter the name of video that you want to add : 
Funny Video
Video Funny Video added successfully.

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
5
---------------------------------------------------------------------------
	Video Name          	|	Checkout Status	|	Rating         

	Funny Video         	|	false     	|	0              
---------------------------------------------------------------------------

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
2
Enter the name of video that you want to check out: 
Funny Video
Video Funny Video checked out successfully.

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
5
---------------------------------------------------------------------------
	Video Name          	|	Checkout Status	|	Rating         

	Funny Video         	|	true      	|	0              
---------------------------------------------------------------------------

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
3
Enter the name of video that you want to return: 
Funny Video
Video Funny Video returned successfully.

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
5
---------------------------------------------------------------------------
	Video Name          	|	Checkout Status	|	Rating         

	Funny Video         	|	false     	|	0              
---------------------------------------------------------------------------

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
4
Enter the name of video thay you want to rate: 
Funny Video
Enter the rating for this video: 
10
Rating 10 has been mapped to video Funny Video.

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
5
---------------------------------------------------------------------------
	Video Name          	|	Checkout Status	|	Rating         

	Funny Video         	|	false     	|	10             
---------------------------------------------------------------------------

1. Add Videos : 
2. CheckOut Video :
3. Return Video :
4. Receive Rating :
5. List Inventory :
6. exit :
Enter your Choice (1...6) : 
6
Exiting !! Thanks for using the application.

*/