package part1.gofpatterns.Structural.Bridge.solution;

public class Window {
    private WindowImpl window;

    void draw(int x, int y, int width, int height, String colour) {
        window.draw(x,y,width,height,colour);
    }

    public void setWindow(WindowImpl window) {
        this.window = window;
    }
}
