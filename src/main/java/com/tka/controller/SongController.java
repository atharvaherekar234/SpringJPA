package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Song;
import com.tka.service.SongService;

@RestController
@RequestMapping("/song")
public class SongController {
    
    @Autowired
    SongService service;
    
    @PostMapping("/save")
    public String saveSong(@RequestBody Song song) {
        return service.saveSong(song);
    }

    @GetMapping("/getsong/{id}")
    public Song getSong(@PathVariable String id) {
        return service.getSong(id);
    }
    
    @GetMapping("/allsongs")
    public List<Song> getAllSongs() {
        return service.getAllSongs();
    }
    
    @PutMapping("/edit/{id}")
    public String editSong(@PathVariable String id, @RequestBody Song song) {
        return service.editSong(id, song.getName());
    }
    
    @DeleteMapping("/remove/{id}")
    public String deleteSong(@PathVariable String id) {
        return service.DeleteSong(id);
    }
}
