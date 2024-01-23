package task3;

/*
Дана строка произвольной длины с произвольными словами.
Найти слово, в котором число различных символов минимально. Слово
может содержать буквы и цифры. Если таких слов несколько, найти первое
из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
быть "fffff".
 */
public class Main {
    public static void main(String[] args) {
        String[] randStr = "1234 ab f fffff jkjk".split(" ");
        char[] minCharRepeat;
        int[] num = new int[randStr.length];
        int max = 0;
        int indexMax = 0;

        for (int i = 0; i < randStr.length; i++) {
            minCharRepeat = new char[randStr.length] ;
            minCharRepeat = randStr[i].toCharArray();
            int count = 0;
            for (int j = 0; j < minCharRepeat.length - 1; j++) {
                if (minCharRepeat[j + 1] == minCharRepeat[j]) {
                    count++;
                }
            }
            num[i] = count;
        }

        for (int i = 0; i < num.length; i++) {
            int score = num[i];
            if (max < score) {
                max = score;
                indexMax=i;
            }
        }
        System.out.println(randStr[indexMax]);
    }
}
