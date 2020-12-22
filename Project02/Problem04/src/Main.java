import processing.core.*;

import javax.swing.*;
import java.util.Random;

public class Main extends PApplet {
    Random rnd = new Random();

    final float RADIUS = 25;
    float capacity;
    int numOfFrames;
    int numOfBalls;
    float[] xC;
    float[] yC;
    float[] dX;
    float[] dY;
    float distance;
    float[] red;
    float[] green;
    float[] blue;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str1 = JOptionPane.showInputDialog("Number of sequences : ");
        numOfBalls = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog("Length of sequences : ");
        numOfFrames = Integer.parseInt(str2);
        capacity = 250-13*numOfFrames;
        distance = 2*sqrt(RADIUS*RADIUS/2);
        xC = new float[numOfBalls];
        yC = new float[numOfBalls];
        dX = new float[numOfBalls];
        dY = new float[numOfBalls];
        red = new float[numOfBalls];
        green = new float[numOfBalls];
        blue = new float[numOfBalls];

        for (int i=0; i<numOfBalls; i++){
            xC[i]=rnd.nextInt(width-2*(int)RADIUS)+RADIUS;
            yC[i]=rnd.nextInt(height-2*(int)RADIUS)+RADIUS;
            red[i] = rnd.nextInt(245)+10f;
            green[i] = rnd.nextInt(245)+10f;
            blue[i] = rnd.nextInt(245)+10;

            if (i%2==0){
                dX[i]= distance;
                dY[i]= -distance;
            } else {
                dX[i]= -distance;
                dY[i]= distance;
            }
        }
        frameRate(10);
    }

    public void draw() {
        fill(0, capacity);
        rect(0,0,width,height);

        for (int i=0; i<numOfBalls; i++){
            drawCircle(red[i], green[i], blue[i], xC[i], yC[i]);

            xC[i] += dX[i];
            yC[i] += dY[i];

            if (xC[i]>width-RADIUS || xC[i]<RADIUS){
                dX[i] *= -1;
            }
            if (yC[i]>height-RADIUS || yC[i]<RADIUS){
                dY[i] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    private void drawCircle(float reds,float greens, float blues, float x0, float y0) {
        fill(reds, greens, blues);
        circle(x0, y0, 2*RADIUS);
    }
}
