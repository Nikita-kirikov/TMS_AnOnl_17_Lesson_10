package task1;

public class PrintStr {
    public static String printNumDoc(String str) {
        return str.substring(0,4) + str.substring(9,13);
    }

    public static String replaceStr(String str) {
        return str.replaceAll("[a-fA-F]", "*");
    }

    public static String printStrDoc(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(5,9));
        sb.append(str.substring(14,18));
        sb.append(str.substring(19,21));
        sb.append(str.charAt(21));
        sb.setCharAt(3, '/');
        sb.setCharAt(7, '/');
        sb.setCharAt(9, '/');
        return sb.toString();
    }

    public static String printLetters(String str) {
        return "Letters:" + printStrDoc(str).toUpperCase();
    }
}
