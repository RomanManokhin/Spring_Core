package ru.ghostrog.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component

public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;
    Random rand = new Random();
    int randomNumber = rand.nextInt(3);
//    private Music musicClassic;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    @PostConstruct
    @PreDestroy
    public String playMusic(PlayList playList) {
        if (playList.equals(PlayList.ROCK)) {
            return rockMusic.getSong().get(randomNumber);
        } else {
            return classicalMusic.getSong().get(randomNumber);
        }
    }
}
