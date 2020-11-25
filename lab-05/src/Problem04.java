import processing.core.*;

public class Problem04 extends PApplet {
    public void settings() {
        fullScreen();
        noLoop();
    }

    public void setUp() {
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i<100; i++){
            circle(random(100, width) , random(100, height), random(10, 100));
            fill( random(10,255), random(10, 255), random(10, 255));
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
