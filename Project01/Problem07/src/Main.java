import processing.core.PApplet;

public class Main extends PApplet {

    final float SUN_D = 150;
    float sunX, sunY;

    final float EARTH_D = SUN_D/4f;
    float earthX, earthY;

    final float MOON_D = EARTH_D/3f;
    float moonX, moonY;

    final float VENUS_D = SUN_D/4f;
    float venusX, venusY;

    float distanceSE = SUN_D/2 + EARTH_D/2 + 200;
    float distanceSV = SUN_D/2 + VENUS_D/2 + 100;
    float distanceME = EARTH_D/2 + MOON_D/2 + 30;

    float angleE;
    final float dAngleE = 0.025f;
    float angleM;
    final float dAngleM = 0.2f;
    float angleV;
    final float dAngleV = 0.05f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        earthX = distanceSE;

        venusX = distanceSV;

        moonX = distanceME;
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);

        translate(width/2f, height/2f);

        fill(255,255,0);
        circle(sunX, sunY, SUN_D);

        rotate(angleV);
        fill(0,255,255);
        circle(venusX, venusY, VENUS_D);
        angleV += dAngleV;

        rotate(-angleE);
        fill(0,0,255);
        circle(earthX, earthY, EARTH_D);
        angleE += dAngleE;

        translate(earthX, earthY);
        fill(255);
        rotate(angleM);
        circle(moonX, moonY, MOON_D);
        angleM += dAngleM;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
