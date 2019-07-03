package 특강_190703;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return this.composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return this.track;
	}
	
	public void show() {
		System.out.println("제목: " + this.title);
		System.out.println("가수: " + this.artist);
		System.out.println("앨범: " + this.album);
		System.out.println("작곡가: " + this.composer);
		System.out.println("발표연도: " + this.year);
		System.out.println("트랙번호: " + this.track);
	}
}
