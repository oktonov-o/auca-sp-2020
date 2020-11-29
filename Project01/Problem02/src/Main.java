import processing.core.*;

public class Main extends PApplet {

    final float MAX_SIZE = 150;
    final float MIN_SIZE = 50;
    float sizeA = MAX_SIZE, speedA = 1;
    float sizeB = MIN_SIZE, speedB = -1;
    float sizeC = MAX_SIZE, speedC = 1;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);

        textAlign(CENTER);
        //hello
        textSize(sizeA);
        fill(255, 0, 0);
        text("Hello,", width / 2f, height / 6f);

        //wonderful
        textSize(sizeB);
        fill(0, 255, 0);
        text("Wonderful", width / 2f, 3f * height / 6);

        //world of java
        textSize(sizeC);
        fill(0, 0, 255);
        text("World of Java!", width / 2f, 5 * height / 6f);

        if (sizeA >= MAX_SIZE || sizeA <= MIN_SIZE) {
            speedA *= (-1);
        }
        if (sizeB >= MAX_SIZE || sizeB <= MIN_SIZE) {
            speedB *= (-1);
        }
        if (sizeC >= MAX_SIZE || sizeC <= MIN_SIZE) {
            speedC *= (-1);
        }

        sizeA += speedA;
        sizeB += speedB;
        sizeC += speedC;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
