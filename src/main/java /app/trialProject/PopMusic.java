package app.trialProject;

public class PopMusic implements Music {

    public void init() {
        System.out.println("PopMusic init");
    }

    public void destroy() {
        System.out.println("PopMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Beautiful colors";
    }

}
