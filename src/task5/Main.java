package task5;
/*
Дана произвольная строка.
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки.
Например, "Hello" -> "HHeelllloo".
 */
public class Main {
    public static void main(String[] args) {
        char[] str = "Hello".toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            result.append(String.valueOf(str[i])).append(String.valueOf(str[i]));
        }
        System.out.println(result);
    }
}
