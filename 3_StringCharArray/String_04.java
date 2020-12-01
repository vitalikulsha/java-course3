public class String_04 {
    /* Task 04
    В строке найти количество чисел.
     */
    public static void main(String[] args) {
        String str = "01epam29.11.20 java 14 15 Вит1алий 35 Куль0712ша 32";
        char[] charArr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {//начало числа
                count++;
                for (int j = i + 1; j < charArr.length; j++) {//находим конец числа
                    if (Character.isDigit(charArr[j])) {
                        i = j;
                    } else break;
                }
            }
        }
        System.out.println("Строка '" + str + "' содержит " + count + " чисел");
    }
}