import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class WordClockTest {

    WordClock wordClock;

    @Before
    public void setUp() throws Exception {
        wordClock = new WordClock();
    }

    @Test
    public void forAnInputOfOneOClockWeGetBackAStringOutputOfOneOClock() {
        assertEquals("one o'clock", wordClock.translateTime(LocalTime.of(1, 0)));
    }

    @Test
    public void forAnInputOnTheHourOfTwoWeGetBackTwoOClock() throws Exception {
        assertEquals("two o'clock", wordClock.translateTime(LocalTime.of(2, 0)));
    }

    @Test
    public void forAnInputOnTheHourOfThreeWeGetBackThreeOClock() throws Exception {
        assertEquals("three o'clock", wordClock.translateTime(LocalTime.of(3, 0)));
    }

    @Test
    public void usesOClockForTimesOnTheHour() throws Exception {
        assertEquals("one o'clock", translateTime(1));
        assertEquals("two o'clock", translateTime(2));
        assertEquals("three o'clock", translateTime(3));
        assertEquals("four o'clock", translateTime(4));
        assertEquals("five o'clock", translateTime(5));
        assertEquals("six o'clock", translateTime(6));
        assertEquals("seven o'clock", translateTime(7));
        assertEquals("eight o'clock", translateTime(8));
        assertEquals("nine o'clock", translateTime(9));
        assertEquals("ten o'clock", translateTime(10));
        assertEquals("eleven o'clock", translateTime(11));
        assertEquals("twelve o'clock", translateTime(12));
    }

    @Test
    public void forAnInputAfterNoonWeGetBackATwelveHourValue() throws Exception {
        assertEquals("one o'clock", translateTime(13));
        assertEquals("two o'clock", translateTime(14));
        assertEquals("three o'clock", translateTime(15));
        assertEquals("four o'clock", translateTime(16));
        assertEquals("five o'clock", translateTime(17));
        assertEquals("six o'clock", translateTime(18));
        assertEquals("seven o'clock", translateTime(19));
        assertEquals("eight o'clock", translateTime(20));
        assertEquals("nine o'clock", translateTime(21));
        assertEquals("ten o'clock", translateTime(22));
        assertEquals("eleven o'clock", translateTime(23));
        assertEquals("twelve o'clock", translateTime(0));
    }

    private String translateTime(int hour) {
        return wordClock.translateTime(LocalTime.of(hour, 0));
    }

}