import processing.core.*;

import javax.swing.JOptionPane;
import java.util.Random;

public class Main extends PApplet {

    Random rnd = new Random();

    int numOfStars = 100;
    float[] xOfStars;
    float[] yOfStars;
    float[] speedY;
    float[] radiusOfStars;
    float[] angles;
    float[] dAngles;

    public void settings() {
        fullScreen();
    }

    public void setup() {

        String str = JOptionPane.showInputDialog("Number of stars: ");
        numOfStars = Integer.parseInt(str);
        xOfStars = new float[numOfStars];
        yOfStars = new float[numOfStars];
        speedY = new float[numOfStars];
        radiusOfStars = new float[numOfStars];
        dAngles = new float[numOfStars];
        angles = new float[numOfStars];

        float x = 0.05f;

        for (int i = 0; i < numOfStars; i++) {
            xOfStars[i] = rnd.nextInt(width - 100) + 10;
            yOfStars[i] = rnd.nextInt(height - 100) + 10;
            speedY[i] = rnd.nextInt(5) + 1;
            radiusOfStars[i] = rnd.nextInt(10) + 10;
            angles[i] = 0;
            dAngles[i] = x;
            x *= -1;
        }

    }

    public void draw() {
        background(0);
        for (int i = 0; i < numOfStars; i++) {
            pushMatrix();
            translate(xOfStars[i], yOfStars[i]);
            rotate(angles[i]);
            drawStar(radiusOfStars[i]);
            popMatrix();

            yOfStars[i] += speedY[i];
            angles[i] += dAngles[i];

            if (yOfStars[i] > height + 2 * radiusOfStars[i]) {
                yOfStars[i] = -2 * radiusOfStars[i];
                xOfStars[i] = rnd.nextInt(width);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    private void drawStar(float r) {
        stroke(255);
        strokeWeight(3);
        line(0, -r, 0, r);

        pushMatrix();
        pushMatrix();

        rotate(3.14f / 2);
        line(0, -r, 0, r);

        popMatrix();
        rotate(3.14f / 4);
        line(0, -sqrt(2 * r * r), 0, sqrt(2 * r * r));

        popMatrix();
        rotate(3.14f / 4 * 3);
        line(0, -sqrt(2 * r * r), 0, sqrt(2 * r * r));
    }
}