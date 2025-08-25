package app.trialProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{

    @PostConstruct
    public void init() {
        System.out.println("RockMusic init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RockMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

}
