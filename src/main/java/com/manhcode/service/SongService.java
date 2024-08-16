package com.manhcode.service;

import com.manhcode.model.Song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongService implements ISongService {

    private static final Map<Integer, Song> songs;
    private static int currentId = 4;

    static {
        songs = new HashMap<>();
        songs.put(1, new Song(1,"Thich Thi Den", "Le Bao Binh", "Tinh Yeu"));
        songs.put(2, new Song(2,"Quan Tu Y", "Le Bao Binh", "Tinh Yeu"));
        songs.put(3, new Song(3,"Em Gia Vo Anh Nhan Vo", "Le Bao Binh", "Tinh Yeu"));
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songs.values());
    }

    @Override
    public void save(Song song) {
        songs.put(song.getId(), song);
    }

    @Override
    public Song findById(int id) {
        return songs.get(id);
    }

    @Override
    public void update(int id, Song customer) {
        songs.put(id, customer);

    }

    @Override
    public void remove(int id) {
        songs.remove(id);
    }
}
