package com.tka.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Song;
import com.tka.dao.SongRepository;

@Service
public class SongService {
	
	@Autowired
	SongRepository repo;
	
	public String saveSong(Song song) {
	    String id = UUID.randomUUID().toString();
	    song.setId(id);
	    repo.save(song);
	    return "saved successfully";
	}

	public Song getSong(String id) {
	    return repo.findById(id).orElse(null); // safer than .get()
	}

	public List<Song> getAllSongs() {
	    return repo.findAll();
	}

	public String editSong(String id, String name) {
		 Song song = repo.findById(id).orElse(null);
		    if (song == null) {
		        return "Song not found";
		    }
		    song.setName(name);
		    repo.save(song);
		    return "Song updated successfully";
		
	}
	
	public String DeleteSong(String id) {
		if (repo.existsById(id)) {
	        repo.deleteById(id);
	        return "Deleted successfully";
	    }
	    return "Song not found";
	}
	
}
