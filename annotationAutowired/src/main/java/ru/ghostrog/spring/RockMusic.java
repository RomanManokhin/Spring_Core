package ru.ghostrog.spring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

//    private List<String> RockPlayList;

//    public RockMusic(List<String> rockPlayList) {
//        RockPlayList = Arrays.asList("ROCK1", "ROCK2", "ROCK3");
//    }

    //
//    private static final List<Rock> VALUES =
//            Collections.unmodifiableList(Arrays.asList(Rock.values()));
//    private static final int SIZE = VALUES.size();
//    private static final Random RANDOM = new Random();


//    public List<String> getRockPlayList() {
//        return RockPlayList;
//    }
//
//    public void setRockPlayList(List<String> rockPlayList) {
//        RockPlayList = rockPlayList;
//    }

    @Override
    public List<String> getSong() {
        return Arrays.asList("ROCK1", "ROCK2", "ROCK3");
    }
}
