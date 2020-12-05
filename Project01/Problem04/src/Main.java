import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {

    int numOfSquares;
    float x1, y1;
    float distance;
    float circleX, circleY;
    float speedX, speedY;
    String wordOnTop;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Enter the number squares");
        numOfSquares = Integer.parseInt(str);
        y1 = height/8f;
        x1 = width/2f - 3*height/8f;
        distance = (6*height/8f)/numOfSquares;
        circleX = x1 + distance/2;
        circleY = y1 + distance/2;
        wordOnTop = "Press Arrow buttons";
        frameRate(20);
    }

    public void draw() {

        fill(0,0,0,50);
        rect(0,0,width,height);

        float y2 = y1;
        float x2 = x1;
        for (int i = 0; i<=numOfSquares; i++){
            stroke(0, 0,255);
            line(x1, y2, x1 + numOfSquares*distance, y2);
            y2 += distance;
            line(x2, y1, x2, y1 + numOfSquares*distance);
            x2 += distance;
        }

        noStroke();
        fill(255,0,0);
        circle(circleX,circleY,distance);

        if (key == CODED) {
            wordOnTop = "You pressed button: ";
            if (keyCode == UP){
                speedX = 0;
                speedY = -distance;
                wordOnTop += "UP";
            }
            if (keyCode == DOWN){
                speedY = distance;
                speedX = 0;
                wordOnTop += "DOWN";
            }
            if (keyCode == RIGHT){
                speedX = distance;
                speedY = 0;
                wordOnTop += "RIGHT";
            }
            if (keyCode == LEFT){
                speedX = -distance;
                speedY = 0;
                wordOnTop += "LEFT";
            }
        }
        fill(0);
        rect(0,0,width,height/8f);
        fill(255, 0, 0);
        textAlign(CENTER);
        text(wordOnTop,width/2f, height/16f);

        circleX += speedX;
        circleY += speedY;
        if (circleX < x1 || circleX > x1+numOfSquares*distance || circleY < y1 || circleY > y1+numOfSquares*distance) {
            circleX -= speedX;
            circleY -= speedY;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
