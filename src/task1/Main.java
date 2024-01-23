package task1;
/*
Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить
на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в
формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на
вход программы строку.
 */
public class Main {
    public static void main(String[] args) {
        String doc = "1234-abc-5678-def-9g0j";

        System.out.println(PrintStr.printNumDoc(doc));
        System.out.println(PrintStr.replaceStr(doc));
        System.out.println(PrintStr.printStrDoc(doc));
        System.out.println(PrintStr.printLetters(doc));
    }
}
