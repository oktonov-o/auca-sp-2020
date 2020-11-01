import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String colon;
        int days, hours, minutes, seconds;
        int SECONDS_DAY = 86400;

        System.out.print("Dia ");
        int startDay = inp.nextInt();
        int startHour = inp.nextInt();
        colon = inp.next();
        int startMinute = inp.nextInt();
        colon = inp.next();
        int startSecond = inp.nextInt();

        System.out.print("Dia ");
        int finishDay = inp.nextInt();
        int finishHour = inp.nextInt();
        colon = inp.next();
        int finishMinute = inp.nextInt();
        colon = inp.next();
        int finishSecond = inp.nextInt();

        if (startDay < finishDay){
            seconds = SECONDS_DAY - startHour*60*60 - startMinute*60 -startSecond;
            seconds = seconds + finishHour*60*60 + finishMinute*60 + finishSecond;
            seconds = seconds + (finishDay - startDay - 1)*SECONDS_DAY;
        } else {
            seconds = (finishHour - startHour)*60*60 + (finishMinute - startMinute)*60 + finishSecond - startSecond;
        }
        days = seconds/SECONDS_DAY;
        seconds%=SECONDS_DAY;
        hours = seconds/3600;
        seconds%=3600;
        minutes = seconds/60;
        seconds%=60;
        System.out.println(days+" dia(s)");
        System.out.println(hours+" hora(s)");
        System.out.println(minutes+" minuto(s)");
        System.out.println(seconds+" segundo(s)");
    }
}
