public class StringBuilder_06 {
    /* Task 06
    Из заданной строки получить новую, повторив каждый символ дважды.
     */
    public static void main(String[] args) {
        String str = "epam java 2020";
        String strNew = new String();
        for (int i = 0; i < str.length(); i++) {
            strNew = strNew + str.charAt(i) + str.charAt(i);
        }
        System.out.println("Исходная строка - \"" + str + "\"");
        System.out.println("Измененная строка - \"" + strNew + "\"");
    }
}