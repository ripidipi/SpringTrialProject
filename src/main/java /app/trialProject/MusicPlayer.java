package app.trialProject;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void play() {
        System.out.println("Playing music " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}

