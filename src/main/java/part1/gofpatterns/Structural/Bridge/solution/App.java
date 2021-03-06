package part1.gofpatterns.Structural.Bridge.solution;

public class App {
    public static void main(String[] args) {
        IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new DirectXWindowImpl());
        iconWindow.drawIcon();
        iconWindow.setWindow(new LinuxWindowImpl());
        iconWindow.drawIcon();
    }
}
