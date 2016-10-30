package data;

import entity.Song;

public interface SongDataService {
	
	boolean saveSong(Song song);
	boolean newSong(String name);
	Song readSong(String name);
}
