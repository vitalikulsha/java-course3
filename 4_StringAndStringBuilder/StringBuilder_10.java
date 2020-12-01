public class StringBuilder_10 {
    /* Task 10
    Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
     */
    public static void main(String[] args) {
        String str = "Привет! Как дела? Пойду гулять. идет снег. Холодно?";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println("Исходная строка - \"" + str + "\"");
        System.out.println("Количество предложений в строке - " + count);
    }
}