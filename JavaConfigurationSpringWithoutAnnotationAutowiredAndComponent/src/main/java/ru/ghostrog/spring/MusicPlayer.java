package ru.ghostrog.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
//    private Music music1;
//    private Music music2;

    private List<Music> arrayListMusic;
    Random random = new Random();
    int randomNumber = random.nextInt(3);
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(List<Music> arrayListMusic) {
        this.arrayListMusic = arrayListMusic;
    }

    public List<Music> getArrayListMusic() {
        return arrayListMusic;
    }

    public String playMusic() {
        return "Playing: " + arrayListMusic.get(randomNumber).getSong();
    }


    public String getName() {
        return name;
    }


    public int getVolume() {
        return volume;
    }


}