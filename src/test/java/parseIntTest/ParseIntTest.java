package parseIntTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static parseInt.ParseInt.parseInt;

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
    public void emptyTest() {
        String s = "";
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            parseInt(s);
        }, "NumberFormatException error was expected");

        assertEquals("Строка не может быть пустым: " + s, thrown.getMessage());
    }


    @ParameterizedTest
    @ValueSource(strings = {"2147483648"})
    public void positiveiIndexOfBoundExceptionTest(String s) {
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            parseInt(s);
        }, "IndexOutOfBoundException error was expected");

        assertEquals("Значение вышло за допустимый диапазон: ", thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"-2147483649"})
    public void negativeIndexOfBoundExceptionTest(String s) {
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            parseInt(s);
        }, "IndexOutOfBoundException error was expected");

        assertEquals("Значение вышло за допустимый диапазон: ", thrown.getMessage());
    }


    @Test
    public void numberFormatterExceptionTest() {
        String s = "One";
        NumberFormatException thrown = Assertions
                .assertThrows(NumberFormatException.class, () -> {
                    parseInt(s);
                }, "NumberFormatException error was expected");

        assertEquals("Неправильный формат значения: " + s, thrown.getMessage());
    }

    @Test
    public void oneCharacterNumberFormatterExceptionTest() {
        String s = "r";
        NumberFormatException thrown = Assertions
                .assertThrows(NumberFormatException.class, () -> {
                    parseInt(s);
                }, "NumberFormatException error was expected");

        assertEquals("Неправильный формат значения: " + s, thrown.getMessage());
    }
}
