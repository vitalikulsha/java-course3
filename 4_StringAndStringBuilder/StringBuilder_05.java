public class StringBuilder_05 {
    /* Task 05
    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
     */
    public static void main(String[] args) {
        String str = "java EPAM 2020 Антошка-картошка";
        int count = 0;
        //найдем общее количество букв 'a' в верхнем и нижнем регистрах, латиницей и кириллицей
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'а' || str.charAt(i) == 'А') {
                count++;
            }
        }
        System.out.println("В строке \"" + str + "\" встречается " + count + " букв \"a\"");
    }
}