import processing.core.*;

public class Main extends PApplet {

    final float RADIUS = 50;
    float xSpeed = 2;
    float ySpeed = 2;
    float x = width / 2f;
    float y = height / 2f;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background( 0, 0, 0);

        circle( x, y, 2*RADIUS);
        if (x >= width - RADIUS || x <= RADIUS){
            xSpeed *= (-1);
        }
        if (y >= height - RADIUS || y <= RADIUS){
            ySpeed *= (-1);
        }

        x += xSpeed;
        y += ySpeed;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
