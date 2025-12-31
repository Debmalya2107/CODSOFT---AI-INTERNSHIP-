import java.util.Scanner;

class f12 
{
    private int hr;
    private int min;
    private int sec;
    private int totalSeconds;
 
    public void accept(int hours, int minutes, int seconds) {
        hr = hours;
        min = minutes;
        sec = seconds;
    }
    

    public void convert() {
        totalSeconds = (hr * 3600) + (min * 60) + sec;
    }
    
 
    public void showResult() {
        System.out.printf("Time entered: %02d:%02d:%02d\n", hr, min, sec);
        System.out.println("Total seconds: " + totalSeconds);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        
        f12 timeConverter = new f12();
        timeConverter.accept(hours, minutes, seconds);
        timeConverter.convert();
        timeConverter.showResult();
        
        scanner.close();
    }
}
