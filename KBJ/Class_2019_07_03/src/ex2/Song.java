package ex2;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	public Song() {
		this("unknown", "unknown", "unknown", "unknown", "unknown", 0);
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show() {
		System.out.printf("%s %s (%s, %s, %d¹ø track, %sÀÛ°î)", this.artist, this.title, this.album,
				this.year, this.track, this.composer);
	}

}
