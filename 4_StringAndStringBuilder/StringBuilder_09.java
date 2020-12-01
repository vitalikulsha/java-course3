public class StringBuilder_09 {
    /* Task 09
    Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    Учитывать только английские буквы.
     */
    public static void main(String[] args) {
        String str = "ViTaLi EPAM java BELarus";
        System.out.println("Задана строка - \"" + str + "\"");
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                countLower++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                countUpper++;
            } else continue;
        }
        System.out.println("Количество строчных букв - " + countLower + ", количество прописных букв - " + countUpper);
    }
}