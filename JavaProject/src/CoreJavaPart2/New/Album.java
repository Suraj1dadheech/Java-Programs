package CoreJavaPart2.New;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.LinkedList;
public class Album {
    private String name, artist;
    private ArrayList<Song> songs;
    public Album(String name, String artist){
        this.name=name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==null) {
        	songs.add(new Song(title, duration));
        	return true;
        }
        return false;
    }
    public Song findSong(String title){
        for(int i=0;i<songs.size();i++) {
        	Song song=songs.get(i);
        	if(song.getTitle().equals(title))
        		return song;
        }
        return null;
    }

     public boolean addToPlayList(int track,LinkedList<Song> ls) 
     {
    	int count=track-1;
    	if(count>-1 && count<songs.size()) {
    		ls.add(songs.get(count));
    		return true;
    	}
    	return false;
     }
     public boolean addToPlayList(String title,LinkedList<Song> ls) {
    	 Song song=findSong(title);
    	 if(song!=null) {
    		 ls.add(song);
    		 return true;
    	 }
    	 return  false;
     }
}

