package ru.ghostrog.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 для Рока или 2 Для Классики");
        int choice = in.nextInt();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        if(choice == 1){
            System.out.println(musicPlayer.playMusic(PlayList.ROCK));
        } else {
            System.out.println(musicPlayer.playMusic(PlayList.CLASSIC));
        }



//        Computer computer = context.getBean("computer", Computer.class);
//
//        System.out.println(computer);

        context.close();

    }
}
