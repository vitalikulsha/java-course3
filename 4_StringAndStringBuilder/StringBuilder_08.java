import java.io.*;

public class StringBuilder_08 {
    /* Task 08
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.

При решении задачи будет рассмотрено два способа решения задачи:
1 - с использованием регулирных выражений
2 - без использования регулярных выражений
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        //String str = reader.readLine();
        String str = "  java   epam 2020  kulsha  жыве 1 vitali учиться 1234567  Беларусь ";
        String noSpaces = str.trim().replaceAll("\\s+", " ");//удаляем лишние пробелы
        long start = System.currentTimeMillis();
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
        long finish = System.currentTimeMillis();
        System.out.println("Время выполения данным способом - " + (finish - start));

        //Вариант без использования регулярного выражения
        String startString = "  java   epam 2020  kulsha  жыве 1 vitali учиться 1234567  Беларусь ";
        String strNew = startString.trim().replaceAll("\\s+", " ");
        start = System.currentTimeMillis();
        System.out.println("Заданная строка - \"" + strNew + "\"");
        int begin = 0;
        int end = 0;
        int length = 0;
        int maxLengthWord = 0;
        int idBegin = 0;
        int idEnd = 0;
        int countWord = 1;
        for (int i = 0; i < strNew.length(); i++) { //подсчитываем количество слов в строке
            if (strNew.charAt(i) == ' ') {
                countWord++;
            }
        }
        int[] lengthWord = new int[countWord];
        //ищем максимальное по длине слова, индексы начало и конца самого длинного слова
        for (int i = 0; i < strNew.length(); ) {
            for (int j = 0; j < lengthWord.length; j++) {
                begin = i;
                if (strNew.indexOf(' ', i + 1) != -1) {
                    end = strNew.indexOf(' ', i + 1);
                } else {
                    end = strNew.length();
                }
                length = end - begin;
                lengthWord[j] = length;
                if (length > maxLengthWord) {
                    maxLengthWord = length;
                    idBegin = begin;
                    idEnd = end;
                }
                i = end + 1;
            }
        }
        //Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        int countTemp = 0;
        for (int i = 0; i < lengthWord.length; i++) {
            if (maxLengthWord == lengthWord[i]) {
                countTemp++;
            }
            if (countTemp > 1) break;
        }
        if (countTemp == 1) {
            String maxWord = strNew.substring(idBegin, idEnd);
            System.out.println("Самое длинное слово в строке - \"" + maxWord + "\"");
        }
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения данным способом - " + (finish - start));
    }
}