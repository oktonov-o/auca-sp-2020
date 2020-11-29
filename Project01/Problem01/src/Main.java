import processing.core.*;

public class Main extends PApplet {
    final float RADIUS = 25;
    final float w = 2 * RADIUS;
    final float h = 2 * RADIUS;
    final float speed = 10;

    float x1 = w / 2f;
    float y1 = h / 2f;
    float x2 = w / 2f + 2 * RADIUS;
    float y2 = h / 2f + 2 * RADIUS;
    float x3 = w / 2f + 4 * RADIUS;
    float y3 = h / 2f + 4 * RADIUS;
    float x1Speed = speed;
    float y1Speed = speed;
    float x2Speed = speed;
    float y2Speed = speed;
    float x3Speed = speed;
    float y3Speed = speed;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background( 0, 0, 0);

        fill( 0, 0, 255);
        circle( x1, y1, 2*RADIUS);
        fill(0, 255, 0);
        circle( x2, y2, 2*RADIUS);
        fill(255, 0, 0);
        circle( x3, y3, 2*RADIUS);


        if (x1 >= width - RADIUS-1 || x1 <= RADIUS-1){
            x1Speed *= (-1);
        }
        if (y1 >= height - RADIUS-1 || y1 <= RADIUS-1){
            y1Speed *= (-1);
        }
        if (x2 >= width - RADIUS-1 || x2 <= RADIUS-1){
            x2Speed *= (-1);
        }
        if (y2 >= height - RADIUS-1 || y2 <= RADIUS-1){
            y2Speed *= (-1);
        }
        if (x3 >= width - RADIUS-1 || x3 <= RADIUS-1){
            x3Speed *= (-1);
        }
        if (y3 >= height - RADIUS-1 || y3 <= RADIUS-1){
            y3Speed *= (-1);
        }

        x1 += x1Speed;
        y1 += y1Speed;
        x2 += x2Speed;
        y2 += y2Speed;
        x3 += x3Speed;
        y3 += y3Speed;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
