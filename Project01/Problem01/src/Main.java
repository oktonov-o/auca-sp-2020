import processing.core.*;

public class Main extends PApplet {

    final float RADIUS = 25;
    final float speed = 10;
    float w,h;
    float x1,x2,x3,y1,y2,y3;
    float x1Speed,x2Speed,x3Speed,y1Speed,y2Speed,y3Speed;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        w = width;
        h = height;
        x1 = w / 2f;
        y1 = h / 2f;
        x2 = w / 2f + 2 * RADIUS;
        y2 = h / 2f + 2 * RADIUS;
        x3 = w / 2f + 4 * RADIUS;
        y3 = h / 2f + 4 * RADIUS;
        x1Speed = speed;
        y1Speed = speed;
        x2Speed = speed;
        y2Speed = speed;
        x3Speed = speed;
        y3Speed = speed;
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
