import processing.core.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main extends PApplet {
    int numOfStars;
    float[] xOfStars;
    float[] yOfStars;
    float[] speedX;
    float[] speedY;
    float[] radiusOfStars;
    float[] redOfStar;
    float[] greenOfStar;
    float[] blueOfStar;
    float[] angles;
    float[] dAngles;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        Random rnd = new Random();

        String str = JOptionPane.showInputDialog("Number of stars: ");
        numOfStars = Integer.parseInt(str);
        xOfStars = new float[numOfStars];
        yOfStars = new float[numOfStars];
        speedX = new float[numOfStars];
        speedY = new float[numOfStars];
        radiusOfStars = new float[numOfStars];
        redOfStar = new float[numOfStars];
        greenOfStar = new float[numOfStars];
        blueOfStar = new float[numOfStars];
        dAngles = new float[numOfStars];
        angles = new float[numOfStars];

        for (int i=0; i<numOfStars; i++) {
            xOfStars[i] = rnd.nextInt(width-100)+10;
            yOfStars[i] = rnd.nextInt(height-100)+10;
            speedX[i] = rnd.nextInt(20)-10;
            speedY[i] = rnd.nextInt(20)-10;
            radiusOfStars[i] = rnd.nextInt(10)+10;
            redOfStar[i] = rnd.nextInt(245)+10;
            greenOfStar[i] = rnd.nextInt(245)+10;
            blueOfStar[i] = rnd.nextInt(245)+10;
            angles[i]=0;
            dAngles[i]=0.05f;
        }

    }

    public void draw() {
        background(0);
        for (int i=0; i<numOfStars; i++){
            pushMatrix();
            translate(xOfStars[i], yOfStars[i]);
            rotate(angles[i]);
            drawStar(radiusOfStars[i], redOfStar[i], greenOfStar[i], blueOfStar[i]);
            popMatrix();

            xOfStars[i] += speedX[i];
            yOfStars[i] += speedY[i];
            angles[i]+= dAngles[i];

            if (xOfStars[i]<radiusOfStars[i] || xOfStars[i]>width-radiusOfStars[i]){
                dAngles[i] *= -1;
                speedX[i] *= -1;
            }
            if (yOfStars[i]<radiusOfStars[i] || yOfStars[i]>height-radiusOfStars[i]){
                dAngles[i] *= -1;
                speedY[i] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    private void drawStar(float r, float red, float green, float blue) {
        stroke(red, green, blue);
        strokeWeight(3);
        line(0,-r, 0, r);

        pushMatrix();
        pushMatrix();
        pushMatrix();

        rotate(3.14f/5);
        line(0,-r, 0, r);

        popMatrix();
        rotate(3.14f/5*2);
        line(0,-r, 0, r);

        popMatrix();
        rotate(3.14f/5*3);
        line(0,-r, 0, r);

        popMatrix();
        rotate( 3.14f/5*4);
        line(0,-r, 0, r);
    }
}
