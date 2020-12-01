import java.io.*;

public class StringBuilder_07 {
    /* Task 07
    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    Например, если было введено "abc cde def", то должно быть выведено "abcdef".
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        //String str = "  aaabc deeeef cba ffed  grs sadfsh  ";
        //удаляем пробелы в строке
        StringBuilder modStr = new StringBuilder(str.replace(" ", ""));
        //удаляем повторяющиеся символы в строке
        for (int i = 0; i < modStr.length(); i++) {
            for (int j = modStr.length() - 1; j > i; j--) {
                if (modStr.charAt(i) == modStr.charAt(j)) {
                    modStr.deleteCharAt(j);
                }
            }
        }
        System.out.println("Измененная строка - \"" + modStr + "\"");
    }
}