package ru.ghostrog.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    //бин музыки
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    //бин музыки
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    //бин музыки
    @Bean
    public TechnoMusic technoMusic() {
        return new TechnoMusic();
    }
    //бин листа который собирает бины жанров
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), technoMusic());
    }
    //бин музыкального плеера который принимает лист с жанрами
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    //бин компьютера который запускает музыкальный плеер
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }


}
