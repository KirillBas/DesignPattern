package ru.basharin.proxy;

public class WebProject implements Project {
    private String url;

    public WebProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project " + url);
    }

    @Override
    public void run() {
        System.out.println("WebProject is running " + url);
    }
}
