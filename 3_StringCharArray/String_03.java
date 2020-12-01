public class String_03 {
    /* Task 03
    В строке найти количество цифр.
     */
    public static void main(String[] args) {
        String str = "Java14, 2020 EPAM 29/11";
        char[] charArr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {
                count++;
            }
        }
        System.out.println("Строка '" + str + "' содержит " + count + " цифр");
    }
}