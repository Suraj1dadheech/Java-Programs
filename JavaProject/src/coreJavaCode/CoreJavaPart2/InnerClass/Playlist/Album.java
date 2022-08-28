package coreJavaCode.CoreJavaPart2.InnerClass.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private SongList songs;
    
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    
    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }
    
    public boolean addToPlayList(int track,LinkedList<Song> playlist){
        Song checkSong = songs.findSong(track);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkSong = songs.findSong(title);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public static class SongList{
        private ArrayList<Song> asongs;
        
        
        private SongList(){
            this.asongs = new ArrayList<Song>();
        }
        
        private boolean add(Song song){
            if(this.asongs.contains(song)){
                return false;
            }
            this.asongs.add(song);
            return true;
        }
        
        private Song findSong(String title){
            for(int i=0;i<this.asongs.size();i++){
                Song song = this.asongs.get(i);
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
        
        private Song findSong(int track){
            int count = track -1;
            if(count>0 && count<this.asongs.size()){
                return this.asongs.get(count);
            }
            return null;
        }
        
    }
    
}