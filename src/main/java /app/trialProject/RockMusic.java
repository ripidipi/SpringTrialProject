package app.trialProject;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{

    public void init() {
        System.out.println("RockMusic init");
    }

    public void destroy() {
        System.out.println("RockMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
