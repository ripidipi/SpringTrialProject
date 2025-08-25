package app.trialProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("musicPlayer")
@Scope("prototype")
public class MusicPlayer {
    private List<Music> music;
    private int currentSong;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private Integer volume;

    @Autowired
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void play() {
        while (currentSong < music.size()){
            if (currentSong == 0){
                System.out.print("with volume " + volume + '\n');
            }
            System.out.println("Playing music " + music.get(currentSong++).getSong() + " from " + name );
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
        System.out.println("No music played\n");
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}

