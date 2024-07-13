package Time;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validate(hour,minute,second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
//    public  void setHour(int hour){
//        this.hour = hour;
//    }
//
    public static void validate(int hour, int minute, int second){
        validateHour(hour);
        validateMinutes(minute);
        validateSeconds(second);
    }

    private static void validateHour(int hour){
        boolean validHour = hour < 0 || hour >= 23;
        if(validHour)throw new IllegalArgumentException("Hour must be between 0 and 23");
    }

    private static void validateMinutes(int minute){
        boolean validMinute = minute < 0 || minute >= 59;
        if(validMinute)throw new IllegalArgumentException("Minutes must be between 0 and 59");
    }

    private static void validateSeconds(int second){
        boolean validSecond = second < 0 || second >= 59;
        if(validSecond)throw  new IllegalArgumentException("Seconds must be between 0 and 59");
    }
}
