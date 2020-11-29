import processing.core.*;

import java.util.Scanner;

public class Main extends PApplet {

    Scanner inp = new Scanner(System.in);

    int numOfSquares = inp.nextInt();

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0,0,0);

        for (int i=0; i<height; i+= height/numOfSquares){
            stroke(0, 0, 255);
            line( i, 0, i, height);
            line( 0, i, width, i);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
