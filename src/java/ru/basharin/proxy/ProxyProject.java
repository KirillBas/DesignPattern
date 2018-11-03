package ru.basharin.proxy;

public class ProxyProject implements Project {
    private String url;
    private WebProject webProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (webProject == null) {
            webProject = new WebProject(url);
        }
        webProject.run();
    }
}
