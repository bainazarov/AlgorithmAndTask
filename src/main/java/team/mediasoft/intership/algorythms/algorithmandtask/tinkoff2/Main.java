package team.mediasoft.intership.algorythms.algorithmandtask.tinkoff2;

/**
 * Посчитать количество кораблей на поле игры “Морской бой”.
 * Поле MxN, в этом поле размещены корабли по правилам игры "Морской бой".
 * В нашем случае М=N, значит поле - квадратное.
 * Корабли не могут соприкасаться  по вертикали, по горизонтали и по диагонали.
 * Корабли размещены валидно. Проверять верность расположения не нужно.
 * Речь о статически расположенных кораблях.
 * Они располагаются как по горизонтали так и по вертикали (как в игре). Их просто нужно посчитать.
 */
public class Main {
    public static int battleshipCounter(char[][] board) {
        int counter = 0;
        int horizont = board.length;
        int vertical = board.length;

        for (int i = 0; i < vertical; i++) {
            for (int j = 0; j < horizont; j++) {
                if (board[i][j] == 'X') {
                    if ((i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.'},
                {'.', 'X', '.', 'X', 'X', 'X', '.'},
                {'.', 'X', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', 'X', '.', '.'},
                {'.', 'X', '.', '.', 'X', '.', 'X'},
                {'.', 'X', '.', '.', '.', '.', '.'},
                {'.', 'X', '.', 'X', '.', '.', '.'}
        };

        int result = battleshipCounter(board);
        System.out.println("Количество кораблей на поле: " + result);
    }
}
