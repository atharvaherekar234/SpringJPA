package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, String>  {


}