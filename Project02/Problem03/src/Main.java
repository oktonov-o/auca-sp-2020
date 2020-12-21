import processing.core.*;
import javax.swing.*;
import java.util.Random;

public class Main extends PApplet {

    int numOfFrames;
    float RADIUS = 25;
    float[] xC;
    float[] yC;
    float[] speedX;
    float[] speedY;
    float[] colour ;
    float dColour;
    float distance;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Number of frames [ 1; 35]: ");
        numOfFrames = Integer.parseInt(str);
        if (numOfFrames < 1 || numOfFrames > 35){
            JOptionPane.showMessageDialog(null, "Incorrect input value!");
            exit();
        }

        dColour = 255f/numOfFrames;
        speedX = new float[numOfFrames];
        speedY = new float[numOfFrames];
        xC = new float[numOfFrames];
        yC = new float[numOfFrames];
        colour = new float[numOfFrames];
        distance = 2*sqrt(RADIUS*RADIUS/2);

        for (int i=0; i<numOfFrames; i++){
            if (RADIUS+i*distance<width){
                xC[i]=RADIUS+i*distance;
                speedX[i] = 5;
            } else {
                xC[i]=width-(RADIUS+i*distance-width);
                speedX[i] = -5;
            }
            if(RADIUS+i*distance<height){
                yC[i]=RADIUS+i*distance;
                speedY[i]=5;
            } else {
                yC[i]=height-(RADIUS+i*distance-height);
                speedY[i]=-5;
            }
            colour[i] = (i+1)*dColour;
        }
    }

    public void draw() {
        background(0);

        for (int i=0; i<numOfFrames; i++){
            drawCircle(colour[i],xC[i], yC[i]);

            xC[i] += speedX[i];
            yC[i] += speedY[i];

            if (xC[i] > width-RADIUS || xC[i]<RADIUS){
                speedX[i] *= -1;
            }
            if (yC[i] > height-RADIUS || yC[i]<RADIUS){
                speedY[i] *= -1;
            }
        }
    }

    private void drawCircle(float colour, float x0, float y0) {
        fill(0, 0, colour);
        circle(x0, y0, 2*RADIUS);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
