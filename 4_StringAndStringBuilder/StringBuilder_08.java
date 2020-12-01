import java.io.*;

public class StringBuilder_08 {
    /* Task 08
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        //String str = "  java   epam 2020  kulsha  жыве  vitali учиться 1234567  Беларусь ";
        String noSpaces = str.trim().replaceAll("\\s+", " ");//удаляем лишние пробелы
        String[] strArray = noSpaces.split(" ");//разбиваем строку на слова
        int maxLength = 0;
        int idWord = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLength) {
                maxLength = strArray[i].length();
                idWord = i;
            }
        }
        //Проверяем количество самых длинных слов
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (maxLength == strArray[i].length()) {
                count++;
            }
            if (count > 1) break;
        }
        if (count == 1) {
            System.out.println("Самое длинное слово в строке - \"" + strArray[idWord] + "\"");
        }
    }
}