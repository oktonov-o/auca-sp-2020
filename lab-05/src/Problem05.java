import processing.core.*;

public class Problem05 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
    }

    public void draw() {
        background(0, 0, 0);
        float circleColor = 0;
        float circleDiameter = height;
        for (int i = 0; i < 15; i++){
            fill(circleColor,0 ,0);
            circle(width/2, height/2, circleDiameter);
            circleColor+=255/15f;
            circleDiameter -= height/15f;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}
