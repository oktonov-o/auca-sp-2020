import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet{

    float numOfSquares;
    float distance;
    float d, a;
    float x0, y0;
    float dX = 5, dY = 5;
    float angle;
    float dAngle = 0.05f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Number of squares [ 2; 8] : ");
        numOfSquares = Integer.parseInt(str);
        if (numOfSquares < 2 || numOfSquares > 8){
            JOptionPane.showMessageDialog( null,"Incorrect input information!");
            exit();
        }

        distance = height/2f;
        a = distance/numOfSquares;
        d = sqrt(2*a*a)-a;
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);

        for (int i =1; i<=numOfSquares; i++){
            for (int j=1; j<=numOfSquares; j++){
                pushMatrix();
                translate(x0+ i *a+d,y0+ j *a+d);
                rotate(angle);
                drawSquare();
                popMatrix();
            }
        }
        if (x0 < -a || x0 > width-distance-numOfSquares*d-d){
            dX *= -1;
        }
        if (y0 < -a || y0 > height-distance-numOfSquares*d-d){
            dY *= -1;
        }

        x0 += dX;
        y0 += dY;
        angle += dAngle;
    }

    private void drawSquare() {
        fill(255);
        square(-a/2, -a/2, a);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
