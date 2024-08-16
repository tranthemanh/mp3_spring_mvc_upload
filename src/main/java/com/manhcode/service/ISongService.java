package com.manhcode.service;

import com.manhcode.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    Song findById(int id);

    void update(int id, Song product);

    void remove(int id);
}
