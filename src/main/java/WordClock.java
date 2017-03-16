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
        hourMap.put(12, "twelve");
        hourMap.put(13, "one");
        hourMap.put(14, "two");
        hourMap.put(15, "three");
        hourMap.put(16, "four");
        hourMap.put(17, "five");
        hourMap.put(18, "six");
        hourMap.put(19, "seven");
        hourMap.put(20, "eight");
        hourMap.put(21, "nine");
        hourMap.put(22, "ten");
        hourMap.put(23, "eleven");
        hourMap.put(0, "twelve");

        Integer hour = time.getHour();

        String hourWord = hourMap.get(hour);

        String translatedTime = hourWord + " o'clock";

        return translatedTime;
    }
}
