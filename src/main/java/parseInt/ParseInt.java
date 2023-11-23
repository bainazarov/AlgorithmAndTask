package parseInt;

import java.util.Objects;

public class ParseInt {
    public static Integer parseInt(String s) {

        int number = 0;
        boolean isNegative = false;

        if(Objects.equals(s, "")) {
            throw new NumberFormatException("Строка не может быть пустым: " + s);
        }

        if(s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1); // Подменяем первый индекс на 1
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!Character.isDigit(c)) { // проверка является ли значение цифрой
                throw new NumberFormatException("Неправильный формат значения: " + s);
            }
            int digit = s.charAt(i) - '0'; // Таким образом приводим к числовому значению
            number = number * 10 + digit; // Освобождаем место для нового значения
            if (number < Integer.MIN_VALUE / 10 && digit > 7 || number > Integer.MAX_VALUE) {
                throw new IndexOutOfBoundsException("Значение вышло за допустимый диапазон: ");
            }
        }

        if (isNegative) {
            number = -number;
        }

        return number;
    }
}