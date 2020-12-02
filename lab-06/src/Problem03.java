import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0);
        float r0 = min(width, height)/4f;
        float xo = width/2f;
        float yo = height/2f;

        drawStar(r0, xo, yo, 255, 0, 0);
        drawStar(r0/2f, xo/2f, yo/2f, 255, 255, 0);
        drawStar(r0/2f, xo/2f, yo/2f*3, 255, 255, 0);
        drawStar(r0/2f, xo/2f*3, yo/2f, 255, 255, 0);
        drawStar(r0/2f, xo/2f*3, yo/2f*3, 255, 255, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
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
