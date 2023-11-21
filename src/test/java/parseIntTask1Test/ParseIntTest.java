package parseIntTask1Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static parseIntTask1.ParseInt.parseInt;

public class ParseIntTest {

    @Test
    public void positiveTest() {
        String s = "123";
        int test = parseInt(s);
        assertEquals(123, test);
    }

    @Test
    public void negativeTest() {
        String s = "-123";
        int test = parseInt(s);
        assertEquals(-123, test);
    }

    @Test
    public void stringIndexOutOfBoundsExceptionTest() {
        String s = "";
        IndexOutOfBoundsException thrown = Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            parseInt(s);
        }, "StringIndexOutOfBoundsException error was expected");

        Assertions.assertEquals("Строка не может быть пустым: " + s, thrown.getMessage());
    }

    @Test
    public void indexOfBoundExceptionTest() {
        String s = "99999999999999999";
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            parseInt(s);
        }, "IndexOutOfBoundException error was expected");

        Assertions.assertEquals("Значение вышло за допустимый диапазон: " + s, thrown.getMessage());
    }

    @Test
    public void numberFormatterExceptionTest() {
        String s = "One";
        NumberFormatException thrown = Assertions
                .assertThrows(NumberFormatException.class, () -> {
                    parseInt(s);
                }, "NumberFormatException error was expected");

        Assertions.assertEquals("Неправильный формат значения: " + s, thrown.getMessage());
    }
}
