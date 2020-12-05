import processing.core.PApplet;

public class Main extends PApplet {

    final float SUN_D = 150;
    float sunX, sunY;

    final float EARTH_D = SUN_D/4f;
    float earthX, earthY;

    double a = 1;
    double vel = 0.1, del =0.1;

    final float MOON_D = EARTH_D/3f;
    float moonX, moonY;

    final float VENUS_D = SUN_D/4f;
    float venusX, venusY;

    float distanceSE = SUN_D/2 + EARTH_D/2 + 200;
    float distanceSV = SUN_D/2 + VENUS_D/2 + 100;
    float distanceME = EARTH_D/2 + MOON_D/2 + 30;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        sunX = width/2f;
        sunY = height/2f;
    }

    public void draw() {
        fill(0,0,0,50);
        rect(0,0,width,height);

        fill(255,255,0);
        circle(sunX, sunY, SUN_D);

        a = a+vel*del;
        earthX = (float)Math.cos(a)*distanceSE+sunX;
        earthY = (float)Math.sin(a)*distanceSE+sunY;

        fill(0,0,255);
        circle(earthX, earthY, EARTH_D);

        moonX = (float)Math.cos(10*a)*distanceME+earthX;
        moonY = (float)Math.sin(10*a)*distanceME+earthY;

        fill(255);
        circle(moonX, moonY, MOON_D);

        venusX = (float)Math.cos(4*a)*distanceSV+sunX;
        venusY = (float)Math.sin(4*a)*distanceSV+sunY;

        fill(0,255,255);
        circle(venusX, venusY, VENUS_D);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
