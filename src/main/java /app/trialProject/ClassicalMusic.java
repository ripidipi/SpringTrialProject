package app.trialProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("ClassicalMusic init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ClassicalMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
