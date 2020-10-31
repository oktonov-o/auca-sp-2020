import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int startHour = inp.nextInt();
        int startMinute = inp.nextInt();
        int finishHour = inp.nextInt();
        int finishMinute = inp.nextInt();
        int time, hours, minutes;
        if (startHour > finishHour){
            time = 24+finishHour-startHour;
        } else if (startHour == finishHour && startMinute>=finishMinute){
            time = 24;
        } else {
            time = finishHour - startHour;
        }
        time *= 60;
        time = time -startMinute + finishMinute;
        hours = time/60;
        minutes = time%60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hours, minutes);
    }
}