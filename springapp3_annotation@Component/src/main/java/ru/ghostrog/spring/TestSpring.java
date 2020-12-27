package ru.ghostrog.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Использование наших настроек из xml файла
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Music musicRock = context.getBean("rockMusic", Music.class);
        Music musicClassical = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayerRock = new MusicPlayer(musicRock);
        MusicPlayer musicPlayerClassical = new MusicPlayer(musicClassical);

        musicPlayerRock.playMusic();
        musicPlayerClassical.playMusic();


        context.close();



        //Создание бина(нашего объекта)
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = (MusicPlayer) context.getBean("musicPlayerBeanWithSetter");
//        MusicPlayer musicPlayer2 = (MusicPlayer) context.getBean("musicPlayerBeanWithSetter");
//
//        boolean comparas = musicPlayer1 == musicPlayer2;
//        System.out.println(comparas);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//
//        musicPlayer1.setVolume(10);
//
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        //обязательно необходимо закрывать
        context.close();
    }
}
