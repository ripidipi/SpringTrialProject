package app.trialProject;

public class ClassicalMusic implements Music {

    public void init() {
        System.out.println("ClassicalMusic init");
    }

    public void destroy() {
        System.out.println("ClassicalMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
