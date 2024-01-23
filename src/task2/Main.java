package task2;

import java.util.Arrays;

/*
Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
Если таких слов несколько, то вывести последнее из них.
 */
public class Main {
    public static void main(String[] args) {
        String randStr = "Привет меня зовут Петя люблю играться в игры";

        String[] str = randStr.split(" ");
        String shortWord = str[0];
        String longWord = str[0];

        for(int i = 0; i < str.length; i++) {
            if(shortWord.length() > str[i].length()) {
                shortWord = str[i];
            }
            if(longWord.length() < str[i].length()) {
                longWord = str[i];
            }
        }
        System.out.println("Исходная строка - " + randStr);
        System.out.println("Самое маленькое слово - " + shortWord);
        System.out.println("Самое большое слово - " + longWord);
    }
}
