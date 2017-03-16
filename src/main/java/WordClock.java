import java.time.LocalTime;
import java.util.HashMap;

public class WordClock {

    String translateTime(LocalTime time) {

        HashMap<Integer, String> hourMap = new HashMap<>();

        hourMap.put(1, "one");
        hourMap.put(2, "two");
        hourMap.put(3, "three");
        hourMap.put(4, "four");
        hourMap.put(5, "five");
        hourMap.put(6, "six");
        hourMap.put(7, "seven");
        hourMap.put(8, "eight");
        hourMap.put(9, "nine");
        hourMap.put(10, "ten");
        hourMap.put(11, "eleven");
        hourMap.put(0, "twelve");

        Integer hour = time.getHour();

        if (hour >= 12) {
            hour -= 12;
        }

        String hourWord = hourMap.get(hour);
        String translatedTime = hourWord + " o'clock";

        return translatedTime;
    }
}
