package Structural.Bridge.Problem;

public class IconWindow implements Window {

    // this is how we can solve our problem for two implementation, we will use switch() for 3 of them
    private boolean switchVersion;

    /**
     * there is the problem - we don't know what kind of implementation (linux or directx) should we use.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param colour
     */
    @Override
    public void draw(int x, int y, int width, int height, String colour) {

    }

    public void drawIcon(){
        draw(0,0,10,10,"white");
        draw(0,10,10,10,"Black");
    }
}
