public class String_02 {
    /* Task 02
    Замените в строке все вхождения 'word' на 'letter'.
     */
    public static void main(String[] args) {
        String str = "wordjavaword1 word wo9rd wordepamword-3wor3 w o r dword";
        System.out.println("Исходная строка: " + str);
        char[] charArr = str.toCharArray();
        int countWord = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'w' && charArr[i + 1] == 'o' && charArr[i + 2] == 'r' && charArr[i + 3] == 'd') {
                countWord++;//находим количество вхождений word
            }
        }
        //Создадим новый массив символов и заменим word на letter
        char[] charArrNew = new char[charArr.length + (countWord * 2)]; //word короче letter на 2 символа
        int j = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'w' && charArr[i + 1] == 'o' && charArr[i + 2] == 'r' && charArr[i + 3] == 'd') {
                charArrNew[j] = 'l';
                charArrNew[j + 1] = 'e';
                charArrNew[j + 2] = 't';
                charArrNew[j + 3] = 't';
                charArrNew[j + 4] = 'e';
                charArrNew[j + 5] = 'r';
                i = i + 3;
                j = j + 5;
            } else {
                charArrNew[j] = charArr[i];
            }
            j++;
        }
        str = new String(charArrNew);
        System.out.println("Измененная строка: " + str);
    }
}