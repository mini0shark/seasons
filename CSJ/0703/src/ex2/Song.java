package ex2;

import ex1.Goods;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}

	public void show() {
		Song song = new Song();
		
		
		song.setTitle("������");
		song.setArtist("������");
		song.setAlbum("Real");
		song.setComposer("�̹μ�");
		song.setYear(2010);
		song.setTrack(3);
		
		String title = song.getTitle();
		String artist = song.getArtist();
		String album = song.getAlbum();
		String composer = song.getComposer();
		
		int year = song.getYear();
		int track = song.getTrack();
		
		System.out.println(artist + " " + title + "(" + album + "," + year + "," + track+ "�� track, " + composer + " �۰�)");
		
	}
}
