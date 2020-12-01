import java.util.Arrays;

public class String_01 {
    /* Task 01
    Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
     */
    public static void main(String[] args) {
        String[] strArray = new String[]{"javaRush", "epamLearn", "vitaliKulsha", "zhodinoBelarus"};
        System.out.println("Исходный массив строк: " + Arrays.toString(strArray));
        for (int i = 0; i < strArray.length; i++) {
            char[] charArr = strArray[i].toCharArray();
            int idTemp = 0;
//находим в массиве заглавную букву, понижаем ее регистр и запоминаем порядковый номер данного символа
            for (int j = 0; j < charArr.length; j++) {
                if (Character.isUpperCase(charArr[j])) {
                    charArr[j] = Character.toLowerCase(charArr[j]);
                    idTemp = j;
                }
            }
            //создаем новый массив символов, заполняем его символами из charArr и добовляем символ '_'
            char[] charArrNew = new char[charArr.length + 1];
            for (int j = 0; j < charArrNew.length; j++) {
                if (j < idTemp) {
                    charArrNew[j] = charArr[j];
                } else if (j == idTemp) {
                    charArrNew[j] = '_';
                } else {
                    charArrNew[j] = charArr[j - 1];
                }
            }
            strArray[i] = new String(charArrNew);
        }

        System.out.println("Модифицированный массив строк: " + Arrays.toString(strArray));
    }
}
