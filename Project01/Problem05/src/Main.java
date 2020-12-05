import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {

    int numOfSquares;
    float squareX, squareY, tempSquareX;
    float distance;
    String color;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Number of squares: ");
        numOfSquares = Integer.parseInt(str);
        distance = (6 * height / 8f) / numOfSquares;
    }

    public void draw() {
        background(0);

        squareX = width / 2f - 3 * height / 8f;
        squareY = height / 8f;
        tempSquareX = squareX;

        for (int i = 1; i <= numOfSquares; i++) {
            for (int j = 1; j <= numOfSquares; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        fill(125);
                        color = "Black;";
                    } else {
                        fill(255);
                        color = "White;";
                    }
                } else {
                    if (j % 2 == 0) {
                        fill(255);
                        color = "White;";
                    } else {
                        fill(125);
                        color = "Black;";
                    }
                }

                if (mouseX > squareX && mouseX < squareX + distance && mouseY > squareY && mouseY < squareY + distance) {
                    stroke(255, 0, 0);
                    strokeWeight(3);
                } else {
                    noStroke();
                }

                square(squareX, squareY, distance);

                if (mouseX > squareX && mouseX < squareX + distance && mouseY > squareY && mouseY < squareY + distance) {
                    textSize(30);
                    fill(255, 255, 0);
                    textAlign(CENTER);
                    text("Row: " + i + "; Column: " + j + "; Color: " + color, width / 2f, height / 16f);
                }

                squareX += distance;
            }
            squareX = tempSquareX;
            squareY += distance;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}