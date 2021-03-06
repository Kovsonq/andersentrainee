package part1.gofpatterns.Structural.Proxy.solution;

public class Image {
    protected String url;

    public Image(){}

    public Image(String url) {
        System.out.println("Loading url");
        this.url = url;
    }

    public void draw(){
        System.out.println("Draw image from url " + url);
    }
}
