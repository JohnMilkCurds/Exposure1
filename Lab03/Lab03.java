package Lab03;

public class Lab03 {
    public static void main(String[] args) {

        int start_time = 10000123;
        int hours = start_time / 3600000;
        int remaining_seconds = start_time % 3600000;
        int minutes = remaining_seconds / 60000;
        int seconds = minutes % 60;
        int milliseconds = start_time % 1000;

        System.out.println("Starting time: \t" + start_time);
        System.out.println("Hours: \t\t\t\t\t\t" + hours);
        System.out.println("Minutes: \t\t\t\t\t" + minutes);
        System.out.println("Seconds: \t\t\t\t\t" + seconds);
        System.out.println("Milliseconds: \t\t\t\t" + milliseconds);

    }
}
