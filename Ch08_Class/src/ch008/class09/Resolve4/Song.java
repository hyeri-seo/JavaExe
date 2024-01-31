package ch008.class09.Resolve4;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {}
	
	public void setSongInfo(String title, String artist, String album, 
							String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show(Song song) {
		System.out.println("노래제목: " + song.title);
		System.out.println("가수: " + song.artist);
		System.out.println("앨범제목: " + song.album);
		System.out.println("작곡가: " + song.composer);
		System.out.println("노래가 발표된 연도: " + song.year);
		System.out.println("트랙 번호: " + song.track);
	}
}
