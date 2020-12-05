import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {

    final float SIZE = 100;
    float firstX;
    float secondX;
    String firstWord;
    String secondWord;
    double speedFirst;
    double speedSecond;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(SIZE);
        firstWord = JOptionPane.showInputDialog("First word: ");
        secondWord = JOptionPane.showInputDialog("Second word: ");
        firstX = 0;
        secondX = width - textWidth(secondWord);
        if (textWidth(firstWord)<textWidth(secondWord)){
            speedFirst = (1.0*width-textWidth(firstWord))/(width-textWidth(secondWord))*5;
            speedSecond = -5;
        } else {
            speedSecond = -(1.0*width-textWidth(secondWord))/(width-textWidth(firstWord))*5;
            speedFirst = 5;
        }
    }

    public void draw() {
        background(0);

        //first word
        fill(255,0,0);
        text(firstWord, firstX, height / 4f);

        //second word
        fill(0,255,0);
        text(secondWord, secondX, 3 * height / 4f);

        firstX += speedFirst;
        secondX += speedSecond;

        if (firstX > width-textWidth(firstWord) || firstX < 0) {
            speedFirst *= (-1);
        }
        if (secondX > width-textWidth(secondWord) || secondX < 0) {
            speedSecond *= (-1);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
