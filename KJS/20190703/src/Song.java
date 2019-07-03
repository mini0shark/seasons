
public class Song {
 private String title;
 private String artist;
 private String album;
 private String composer;
 private int year;
 private String track;
 
 
 Song(String album,int year,String track,String composer){
	
	 this.album=album;
	 this.year=year;
	 this.track=track;
	 this.composer=composer;
	
 }
 
 public  String Gettitle() {
		return title;
	}


	public void SetName(String title) {
	  this.title=title;
	  }

	public  String Getartist() {
			return artist;
		}


	public void Setartist(String artist) {
		  this.artist=artist;
		  }

   public  String Getalbum() {
     		return album;
			}


		public void Setalbum(String album) {
			  this.album=album;
			  }

		public  String Getcomposer() {
     		return composer;
			}


		public void Setcomposer(String composer) {
			  this.composer=composer;
			  }
		
		
		
		public int Getyaer() {
			return year;
		}

		public void Setyear(int year) {
			this.year=year;
		}	
		
		
	
		
		public String Gettrack() {
			return track;
		}

		public void Settrack(String track) {
			this.track=track;
		}		
		
	
	public void show() {
		System.out.println("아이유 좋은날 ("+Getalbum()+Getyaer()+Gettrack()+Getcomposer()+")");
	}
		
		
		
public static void main(String args[]) {
	Song song=new Song("Real",2010, "3번 track","이민수작곡");
	song.show();
}
		
	
}
