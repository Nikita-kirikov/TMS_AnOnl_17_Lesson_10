package task4;

import java.util.Scanner;

/*
Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в
строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить
является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных
ситуаций: например, в строке 5 слов, а на вход программе передали число
500 и т. п. ситуации.
 */
public class Main {
    public static void main(String[] args) {
        String[] rand = "привет как дела шалаш".split(" ");

        System.out.println("Пожалуйста введите число");
        Scanner scanner = new Scanner(System.in);
        StringBuilder randStr = new StringBuilder();
        StringBuilder palindrom = new StringBuilder();

        int input = scanner.nextInt();


        if (input < rand.length) {
            randStr.append(rand[input]);
            palindrom.append(rand[input]).reverse();
            if (randStr.compareTo(palindrom) == 0) {
                System.out.println("Ваше слово палиндром и это " + rand[input]);
            } else {
                System.out.println("Ваше слово не палиндром");
            }
        } else {
            System.out.println("Ваше число слишком большое");
        }
    }
}
