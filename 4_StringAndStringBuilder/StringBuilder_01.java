public class StringBuilder_01 {
    /* Task 01
    Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
     */
    public static void main(String[] args) {
        String str = "       java   string     epam  2020       ";
        char symbol = ' ';
        int length = str.length();
        int maxCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == symbol) {
                int count = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == symbol) {
                        count++;
                    } else break;
                }
                maxCount = (count > maxCount) ? count : maxCount;
            }
        }
        System.out.println("В строке \"" + str + "\" наибольшее количество подряд идущих пробелов равно " + maxCount);
    }
}