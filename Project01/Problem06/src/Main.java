import processing.core.*;

public class Main extends PApplet{

    final float r = 50;
    float h,w;
    float recX1, recX2, recY1, recY2;
    float distanceX, distanceY;
    float circleX, circleY;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        h = height;
        w = width;
        distanceX = 2*width/8f;
        distanceY = 4*height/8f;

        recX1 = distanceX/2f;
        recY1 = distanceY/2f;
        recX2 = 5*distanceX/2f;
        recY2 = distanceY/2f;

        circleX = recX1 + distanceX/2f;
        circleY = recY1 + distanceY/2f;
    }

    public void draw() {
        background(0);

        stroke(255);
        fill(0);
        rect(recX1, recY2,distanceX, distanceY);
        rect(recX2, recY2 ,distanceX, distanceY);

        stroke(0,255,255);
        fill(0, 255, 255);
        circle(circleX, circleY, 2*r);

        String wordOnTop;

        if (circleY >= recY1 && circleY <= recY1 + distanceY){
            if (circleX <= recX2 + distanceX && circleX >= recX2){
                wordOnTop = "The center of the circle is in the right rectangle";
            } else if (circleX <= recX1 + distanceX && circleX >= recX1) {
                wordOnTop = "The center of the circle is in the left rectangle";
            } else {
                wordOnTop = "The center of the circle is outside of both rectangles";
            }
        }else {
            wordOnTop = "The center of the circle is outside of both rectangles";
        }

        textAlign(CENTER);
        fill(255);
        text(wordOnTop, width/2f, height/8f);

        if (mousePressed){
            textAlign(CENTER);
            fill(255, 0, 0);
            text("Mouse pressed", width/2f, 7*height/8f);
            circleX = mouseX;
            circleY = mouseY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
