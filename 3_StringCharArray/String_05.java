public class String_05 {
    /* Task 05
   Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
    заменить на одиночные пробелы. Крайние пробелы в строке удалить.
     */
    public static void main(String[] args) {
        String str = "   java   epam kv  2 020       string   ";
        int count = 0;
        char[] charArr = str.trim().toCharArray();//удаляем пробелы в начале и в конце строки
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                while (charArr[i + 1] == ' ') {
                    count++;
                    i++;
                }
            }
        }
        //создаем новый массив за вычетом лишних пробелов
        char[] charArrNew = new char[charArr.length - count];
        int j = 0;
        for (int i = 0; i < charArr.length; i++) {
            charArrNew[j] = charArr[i];
            if (charArr[i] == ' ') {
                while (charArr[i + 1] == ' ') {
                    i++;
                }
            }
            j++;
        }
        str = new String(charArrNew);
        System.out.println(str);
    }
}