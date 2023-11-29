package parseinttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static team.mediasoft.intership.algorythms.algorithmandtask.parseint.ParseInt.parseInt;

public class ParseIntTest {

    @ParameterizedTest
    @CsvSource({"123,123", "-123,-123"})
    public void positiveTest(String source, Integer expected) {
        int test = parseInt(source);
        assertEquals(expected, test);
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
    @ValueSource(strings = {"2147483648", "-2147483649"})
    public void positiveIndexOfBoundExceptionTest(String s) {
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
