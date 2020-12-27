package ru.ghostrog.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(SpringConfig.class);

//        ru.ghostrog.spring.Music music = context.getBean("rockMusic", ru.ghostrog.spring.Music.class);
//
//        ru.ghostrog.spring.MusicPlayer musicPlayer = new ru.ghostrog.spring.MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        ru.ghostrog.spring.Music music2 = context.getBean("classicalMusic", ru.ghostrog.spring.Music.class);
//
//        ru.ghostrog.spring.MusicPlayer classicalMusicPlayer = new ru.ghostrog.spring.MusicPlayer(music2);
//
//        classicalMusicPlayer.playMusic();

//        ru.ghostrog.spring.MusicPlayer musicPlayer = context.getBean("musicPlayer", ru.ghostrog.spring.MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = contextJava.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        contextJava.close();
    }
}