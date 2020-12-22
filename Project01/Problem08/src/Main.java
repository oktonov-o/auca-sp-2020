import processing.core.*;
import javax.swing.JOptionPane;

public class Main extends PApplet {

    float r0;
    float xo;
    float yo;
    float rs;
    float xs;
    float ys;

    float angle;
    float dAngle = 0.05f;
    int numOfStars;
    float angleBetweenStars;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Number of stars [ 2; 8] : ");
        numOfStars = Integer.parseInt(str);
        if (numOfStars>8 || numOfStars<2){
            JOptionPane.showMessageDialog(null,"Incorrect input value!");
            exit();
        }

        angleBetweenStars = 2*3.14f/numOfStars;
        r0 = min(width, height)/6f;
        rs = r0/2f;
    }

    public void draw() {
        background(0);

        translate(width/2f, height/2f);
        rotate(angle);
        drawStar(r0, xo, yo, 255, 0, 0);

        for (int i=0; i<numOfStars; i++){
            pushMatrix();
            rotate((i+1)*angleBetweenStars);
            translate(0,2*r0);
            rotate(-2*angle);
            drawStar(rs, xs, ys, 0, 0, 255);
            popMatrix();
        }


        angle += dAngle;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void drawStar(float r, float x0, float y0, float redF, float greenF, float blueF) {
        float xLeft = x0 - r;
        float yLeft = y0;

        float xRight = x0 + r;
        float yRight = y0;

        float xTop = x0;
        float yTop = y0 - r;

        float xBott = x0;
        float yBott = y0 + r;

        float xTL = x0 - r /4f;
        float yTL = y0 - r /4f;

        float xBL = x0 - r /4f;
        float yBL = y0 + r /4f;

        float xTR = x0 + r /4f;
        float yTR = y0 - r /4f;

        float xBR = x0 + r /4f;
        float yBR = y0 + r /4f;

        stroke(redF , greenF, blueF);
        line(xLeft, yLeft, xRight, yRight);
        line(xBott, yBott, xTop, yTop);

        line(xTL, yTL, xBR, yBR);
        line(xBL, yBL, xTR, yTR);

        line(xLeft,yLeft,xTL,yTL);
        line(xTop,yTop,xTL,yTL);
        line(xLeft,yLeft,xBL,yBL);
        line(xBott,yBott,xBL,yBL);
        line(xBott,yBott,xBR,yBR);
        line(xRight,yRight,xBR,yBR);
        line(xTop,yTop,xTR,yTR);
        line(xRight,yRight,xTR,yTR);
    }
}