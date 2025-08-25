package app.trialProject;

public class MusicPlayer {
    private Music music;
    private String name;
    private Integer volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void play() {
        System.out.println("Playing music " + music.getSong() + " from " + name +
                "\nwith volume " + volume);
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
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

