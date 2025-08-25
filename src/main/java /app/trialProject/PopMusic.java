package app.trialProject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("popMusicBean")
public class PopMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("PopMusic init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PopMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Beautiful colors";
    }
}
