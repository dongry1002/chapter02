package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song iu=new Song();
		
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("REAl");
		iu.setComposer("이민수작곡");
		iu.setYear(2010);
		iu.setTrack(3);
		
		iu.show();
		
		
		Song song2 = new Song(null,"에일리",null,"첫눈처럼 너에게 가겠다",0,2017);
		song2.show();
		
		Song song3= new Song("크러쉬","소파");
		song3.show();
		
		Song song4= new Song("잔나비","뜨여");
		song4.show();
		

	}

}
