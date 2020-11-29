import processing.core.*;
import java.util.Scanner;

public class Main extends PApplet {

    Scanner inp = new Scanner(System.in);

    float firstX;
    float secondX;
    String firstWord = inp.nextLine();
    String secondWord = inp.nextLine();
    double speedFirst = 0.3;
    double speedSecond = 0.3;

    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0);

        //first word
        textSize(100);
        text(firstWord, firstX, height/4f);

        //second word
        textSize(100);
        text(secondWord, secondX, 3*height/4f);

        if (firstX >= width - firstWord.length() || firstX <= 0){
            speedFirst *= (-1);
        }
        if (secondX >= width - secondWord.length() || secondX <= 0){
            speedSecond *= (-1);
        }

        firstX+=speedFirst;
        secondX+=speedSecond;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
