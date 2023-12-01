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
    public void parseIntTest_Positive(String source, Integer expected) {
        int actual = parseInt(source);
        assertEquals(expected, actual);
    }

    @Test
    public void parseIntTest_OnEmpty() {
        String string = "";
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            parseInt(string);
        }, "NumberFormatException error was expected");

        assertEquals("Строка не может быть пустым: " + string, thrown.getMessage());
    }


    @ParameterizedTest
    @ValueSource(strings = {"2147483648", "-2147483649"})
    public void parseIntTest_ThrowsIndexOfBoundException(String string) {
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            parseInt(string);
        }, "IndexOutOfBoundException error was expected");

        assertEquals("Значение вышло за допустимый диапазон: ", thrown.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"One", "r"})
    public void parseIntTest_ThrowsNumberFormatterException(String string) {
        NumberFormatException thrown = Assertions
                .assertThrows(NumberFormatException.class, () -> {
                    parseInt(string);
                }, "NumberFormatException error was expected");

        assertEquals("Неправильный формат значения: " + string, thrown.getMessage());
    }
}
