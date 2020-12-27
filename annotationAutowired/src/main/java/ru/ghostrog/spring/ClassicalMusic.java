package ru.ghostrog.spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

//    private List<String> ClassicPlayList;

//
//    public ClassicalMusic() {
//        ClassicPlayList = Arrays.asList("CLASSIC1", "CLASSIC2", "CLASSIC3");
//    }

//    private static final List<Classic> VALUES =
//            Collections.unmodifiableList(Arrays.asList(Classic.values()));
//    private static final int SIZE = VALUES.size();
//    private static final Random RANDOM = new Random();


//    public List<String> getClassicPlayList() {
//        return ClassicPlayList;
//    }
//
//    public void setClassicPlayList(List<String> classicPlayList) {
//        ClassicPlayList = classicPlayList;
//    }

    public List<String> getSong() {
        return Arrays.asList("CLASSIC1", "CLASSIC2", "CLASSIC3");
    }
}
